package com.kyrioslab.vkplistsaver.client.services;

import com.google.gwt.core.client.JsArray;
import com.kyrioslab.vkplistsaver.client.dto.Track;

/**
 * Created by Ivan Kirilyuk on 01.06.15.
 * <p/>
 * Vkontakte service for OAuth authentication,
 * playlist retrieving etc.
 */
public interface VKService {

    JsArray<Track> getTracks();

}
