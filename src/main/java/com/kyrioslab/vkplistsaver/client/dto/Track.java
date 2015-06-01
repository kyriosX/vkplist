package com.kyrioslab.vkplistsaver.client.dto;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Created by Ivan Kirilyuk on 01.06.15.
 *
 * Simple track representation.
 */
public class Track extends JavaScriptObject{

    protected Track() {}

    public final native String getTitle() /*-{return this.title}-*/;
    public final native String getArtist() /*-{return this.artist}-*/;
    public final native String getDuration() /*-{return this.duration}-*/;
}
