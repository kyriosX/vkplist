package com.kyrioslab.vkplistsaver.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.kyrioslab.vkplistsaver.client.services.PlaylistService;
import com.kyrioslab.vkplistsaver.client.widgets.playlist.ColumnConstraint;
import com.kyrioslab.vkplistsaver.client.widgets.playlist.PlaylistWidget;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class VKPlistSaverEntryPoint implements EntryPoint {

    private static final String CONTAINER_DIV_ID = "trackList";

    @Override
    public void onModuleLoad() {
        PlaylistWidget trackWidget = new PlaylistWidget(
                CONTAINER_DIV_ID,
                new ColumnConstraint[]{
                        new ColumnConstraint(0, "#", false),
                        new ColumnConstraint(1, "Title", true),
                        new ColumnConstraint(2, "Artist", true),
                        new ColumnConstraint(3, "Duration", false)
                },
                new PlaylistService());

        RootPanel trackListPanel = RootPanel.get(CONTAINER_DIV_ID);
        trackListPanel.add(trackWidget);
    }
}
