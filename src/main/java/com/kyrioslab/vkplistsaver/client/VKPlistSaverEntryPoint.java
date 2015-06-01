package com.kyrioslab.vkplistsaver.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.kyrioslab.vkplistsaver.client.services.PlaylistService;
import com.kyrioslab.vkplistsaver.client.widgets.ColumnConstraint;
import com.kyrioslab.vkplistsaver.client.widgets.MusicTrackListWidget;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class VKPlistSaverEntryPoint implements EntryPoint {

    @Override
    public void onModuleLoad() {
        MusicTrackListWidget trackWidget = new MusicTrackListWidget(
                "trackList",
                new ColumnConstraint[]{
                        new ColumnConstraint(0, "#", false),
                        new ColumnConstraint(1, "Title", true),
                        new ColumnConstraint(2, "Artist", true),
                        new ColumnConstraint(3, "Duration", false)
                },
                new PlaylistService());

        RootPanel.get().add(trackWidget);
    }
}
