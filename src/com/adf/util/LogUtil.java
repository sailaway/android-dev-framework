/**
 * Copyright 2014 sailaway(https://github.com/sailaway)
 *
 * Licensed under theGNU GENERAL PUBLIC LICENSE Version 3 (the "License");
 *  Copyright (C) 2007 Free Software Foundation, Inc. <http://fsf.org/>
 * Everyone is permitted to copy and distribute verbatim copies
 * of this license document, but changing it is not allowed.
 * 
 */
package com.adf.util;

import android.util.Log;

public class LogUtil {

	public static String TAG = "android-dev-framework";
	
	public static final void err(String msg){
		Log.e(TAG, msg);
	}
	public static final void log(String msg){
		Log.v(TAG, msg);
	}
	
}
