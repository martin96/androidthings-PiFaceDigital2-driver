package com.martingregor.pifacedigitaldriver;

import android.app.Application;

import timber.log.Timber;

/**
 * Created by mgregor on 2/10/2017, project PiFace Digital 2 Driver.
 */

public class MainApp extends Application {
	@Override
	public void onCreate() {
		super.onCreate();

		Timber.plant(new Timber.DebugTree());
	}
}
