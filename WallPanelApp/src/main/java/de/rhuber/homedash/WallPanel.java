package de.rhuber.homedash;

import android.content.Context;
import android.content.Intent;
import android.app.Application;

public class WallPanel extends Application {

    @SuppressWarnings("FieldCanBeLocal")
    private Intent wallPanelService;

    @Override
    public void onCreate() {
        super.onCreate();
        wallPanelService = new Intent(this, WallPanelService.class);
        startService(wallPanelService);
    }
}
