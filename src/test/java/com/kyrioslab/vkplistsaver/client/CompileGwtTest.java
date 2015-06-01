package com.kyrioslab.vkplistsaver.client;

import com.google.gwt.junit.client.GWTTestCase;
import com.kyrioslab.vkplistsaver.client.dto.Track;
import com.kyrioslab.vkplistsaver.client.services.PlaylistService;
import com.kyrioslab.vkplistsaver.client.services.VKService;

public class CompileGwtTest extends GWTTestCase {

    @Override
    public String getModuleName() {
        return "com.kyrioslab.vkplistsaver.VKPlistSaver";
    }

    public void testSandbox() {
        VKService vkService = new PlaylistService();
//        Track[] trackList = vkService.getTracks();
    }

}
