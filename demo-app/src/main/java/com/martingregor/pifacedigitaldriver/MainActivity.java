/*
 * Copyright 2016, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.martingregor.pifacedigitaldriver;

import android.app.Activity;
import android.os.Bundle;

import java.io.IOException;

import gregor.martin.driver.PiFaceDigital2.PiFaceDigital2;
import timber.log.Timber;

public class MainActivity extends Activity {
	private PiFaceDigital2 mPiFaceDigital2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Timber.d("onCreate");

		try {
			mPiFaceDigital2 = PiFaceDigital2.create(BoardDefaults.getSPIPort());

			mPiFaceDigital2.setLED(0, true);
			mPiFaceDigital2.setLED(1, false);
			mPiFaceDigital2.setLED(2, true);
			mPiFaceDigital2.setLED(3, false);
			mPiFaceDigital2.setLED(4, true);
			mPiFaceDigital2.setLED(5, false);
			mPiFaceDigital2.setLED(6, true);
			mPiFaceDigital2.setLED(7, false);

			mPiFaceDigital2.setRelay(0, true);

			mPiFaceDigital2.setOutputPin(1, false);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void onDestroy() {
		Timber.d("onDestroy");

		try {
			mPiFaceDigital2.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		super.onDestroy();
	}
}
