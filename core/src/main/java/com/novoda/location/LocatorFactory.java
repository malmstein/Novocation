/**
 * Copyright 2011 Novoda Ltd.
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
package com.novoda.location;

import com.novoda.location.locator.DefaultLocator;

import android.location.Location;

public class LocatorFactory {
	
	private static Locator instance; 
	
	public static Locator getInstance() {
		if(instance == null) {
			instance = new DefaultLocator();
		}
		return instance;
	}

	public static void setLocation(Location location) {
		getInstance().setLocation(location);
	}

	public static Location getLocation() {
		return getInstance().getLocation();
	}

}
