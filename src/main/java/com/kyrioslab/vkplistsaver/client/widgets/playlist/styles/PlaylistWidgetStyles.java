package com.kyrioslab.vkplistsaver.client.widgets.playlist.styles;

import com.google.gwt.user.client.ui.*;

/**
 * Created by Ivan Kirilyuk on 02.06.15.
 *
 * Encapsulates styles for each widget element.
 */
public class PlaylistWidgetStyles {

    private static final int ROW_HEADER = 0;

    public static void setButtonPanelStyles(Widget bPanel) {
        bPanel.addStyleName("button_panel");
    }

    public static void setTablePanelStyles(Widget tPanel) {
        tPanel.setStyleName("h_align_center");
        tPanel.addStyleName("table_panel");
    }

    public static void setMainPanelStyles(VerticalPanel widget) {
        widget.setStyleName("h_align_center");
        widget.addStyleName("widget_panel");
    }

    public static void setRowStyles(HTMLTable.RowFormatter rowFormatter, int count) {
        rowFormatter.setStyleName(ROW_HEADER, "table_header");
        for (int i = 1; i < count; i++) {
            rowFormatter.setStyleName(i,
                    i % 2 == 0 ? "color_b" : "color_d");
        }
    }
}
