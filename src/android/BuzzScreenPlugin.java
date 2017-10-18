package com.buzzvil.cordova;

import android.util.Log;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.Context;

import com.buzzvil.buzzscreen.BuzzScreen;

public class BuzzScreenPlugin extends CordovaPlugin {
    private static final String TAG = "BuzzScreen";

    @Override
    public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException {
      return true;
    }
}