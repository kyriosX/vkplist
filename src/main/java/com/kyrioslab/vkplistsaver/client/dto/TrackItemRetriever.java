package com.kyrioslab.vkplistsaver.client.dto;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

import java.util.List;

/**
 * Created by Ivan Kirilyuk on 01.06.15.
 *
 * Playlist track response item representation.
 */
public class TrackItemRetriever extends JavaScriptObject {

    protected TrackItemRetriever() {}

    public final native JsArray<Track> retrieve() /*-{
        var items = this.response.items;
        // remove user information item
        items.splice(0, 1);
        return items;
    }-*/;

}
