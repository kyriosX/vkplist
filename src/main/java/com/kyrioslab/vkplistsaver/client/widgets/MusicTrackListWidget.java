package com.kyrioslab.vkplistsaver.client.widgets;

import com.gargoylesoftware.htmlunit.javascript.host.Console;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.*;
import com.google.gwt.user.client.ui.*;
import com.kyrioslab.vkplistsaver.client.dto.Track;
import com.kyrioslab.vkplistsaver.client.services.VKService;

/**
 * Created by Ivan Kirilyuk on 01.06.15.
 * Widget for VK music track list.
 */
public class MusicTrackListWidget extends Composite {

    private static final int ROW_TITLE_INDEX = 0;

    private String widgetName;
    private VKService vkPlaylistService;
    private ColumnConstraint [] columnConstraints;

    /**
     * Base widget element.
     */
    private FlexTable flexTable = new FlexTable();

    public MusicTrackListWidget(String name,
                                ColumnConstraint[] columnConstraints,
                                VKService vkPlaylistService) {

        this.widgetName = name;
        this.columnConstraints = columnConstraints;
        this.vkPlaylistService = vkPlaylistService;

        // assemble track list downloading panel
        Button btnDownload = new Button("Download");
        Button btnUpdateList = new Button("UpdateList");

        HorizontalPanel hPanel = new HorizontalPanel();
        hPanel.add(btnUpdateList);
        hPanel.add(btnDownload);

        // assemble track list panel
        VerticalPanel vPanel = new VerticalPanel();
        vPanel.add(flexTable);
        vPanel.add(hPanel);

        flexTable.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                HTMLTable.Cell cell = flexTable.getCellForEvent(event);
                if (cell != null && canEdit(cell.getCellIndex())) {
                    startEditing(cell.getElement());
                }
            }
        });

        initWidget(vPanel);
        loadPlaylist();
    }

    /**
     * Check if can edit specified cell.
     *
     * @param cellIndex cell column index
     * @return true if can edit
     */
    private boolean canEdit(int cellIndex) {
        boolean canEdit = true;
        for (ColumnConstraint c : columnConstraints) {
            if (c.getIndex() == cellIndex && !c.isEditable()) {
                canEdit = false;
                break;
            }
        }
        return canEdit;
    }

    private void loadPlaylist() {
        refreshTable();
        JsArray<Track> trackList = vkPlaylistService.getTracks();
        try {
            for (int i = 0; i < trackList.length(); i++) {
                Track t = trackList.get(i);
                int row = flexTable.insertRow(i + 1);
                flexTable.setText(row, indexOf("#"), String.valueOf(i + 1));
                flexTable.setText(row, indexOf("Title"), t.getTitle());
                flexTable.setText(row, indexOf("Artist"), t.getArtist());
                flexTable.setText(row, indexOf("Duration"), t.getDuration());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Reassemble track table.
     */
    private void refreshTable() {
        flexTable.removeAllRows();
        // assemble track list table
        for (ColumnConstraint c : columnConstraints) {
            flexTable.setText(ROW_TITLE_INDEX, c.getIndex(), c.getName());
        }
    }

    /**
     * Enable user to edit table content.
     * Creates corresponding text edit.
     *
     * @param cell table td
     */
    private void startEditing(final Element cell) {
        int absTop = cell.getAbsoluteTop();
        int absLeft = cell.getAbsoluteLeft();

        int height = cell.getClientHeight();

        // get row width / 2
        int width = cell.getParentElement().getClientWidth() / 2;

        final TextBox editBox = new TextBox();
        editBox.setPixelSize(width, height);
        editBox.setText(cell.getInnerText());

        final RootPanel trackListWidget = RootPanel.get(widgetName);
        trackListWidget.add(editBox, absLeft, absTop);
        editBox.setFocus(true);

        // remove box after pressing enter
        editBox.addKeyUpHandler(new KeyUpHandler() {
            @Override
            public void onKeyUp(KeyUpEvent event) {
                if (event.getNativeKeyCode() == KeyCodes.KEY_ENTER) {
                    removeTextBox(editBox, cell, trackListWidget);
                }
            }
        });

        // remove box after focus removal
        editBox.addBlurHandler(new BlurHandler() {
            @Override
            public void onBlur(BlurEvent event) {
                removeTextBox(editBox, cell, trackListWidget);
            }
        });
    }

    private void removeTextBox(TextBox editBox, Element editedCell, RootPanel widget) {
        String value = editBox.getValue();
        if (!value.trim().equals("")) {
            editedCell.setInnerText(value);
        }
        editBox.setFocus(false);
        widget.remove(editBox);
    }

    private int indexOf(String colName) throws Exception {
        for (ColumnConstraint c : columnConstraints) {
            if (c.getName().equals(colName)) {
                return c.getIndex();
            }
        }
        throw new Exception("Cannot find column with name: " + colName);
    }
}
