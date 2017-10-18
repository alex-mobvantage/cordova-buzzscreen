package com.buzzvil.buzzscreen.sdk.cordova;

import android.util.Log;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.Context;

import com.buzzvil.buzzscreen.sdk.BuzzScreen;

public class BuzzScreenPlugin extends CordovaPlugin {
    private static final String TAG = "BuzzScreen";

    private static final String ACTIVATE = "launch";
    private static final String DEACTIVATE = "deactivate";
    private static final String LOGOUT = "logout";
    private static final String SET_USER_ID = "setUserId";
    private static final String SET_BIRTH_YEAR = "setBirthYear";
    private static final String SET_GENDER = "setGender";

    @Override
    public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException {
      if (action.equals(SET_USER_ID)){
        final String userId = args.getString(0);
        BuzzScreen.getInstance().getUserProfile().setUserId(userId);

        Log.d(TAG, "Set user id: " + userId);
        callbackContext.success();
        return true;
      } else if (action.equals(SET_BIRTH_YEAR)){
        final int birthYear = args.getInt(0);
        BuzzScreen.getInstance().getUserProfile().setBirthYear(birthYear);

        Log.d(TAG, "Set birth year: " + birthYear);
        callbackContext.success();
        return true;
      } else if (action.equals(SET_GENDER)){
        final String gender = args.getString(0);
        BuzzScreen.getInstance().getUserProfile().setGender(gender);

        Log.d(TAG, "Set gender: " + gender);
        callbackContext.success();
        return true;
      } else if (action.equals(ACTIVATE)){
        BuzzScreen.getInstance().activate();
        
        Log.d(TAG, "Activated");
        callbackContext.success();
        return true;
      } else if (action.equals(DEACTIVATE)){
        BuzzScreen.getInstance().deactivate();

        Log.d(TAG, "Deactivated");
        callbackContext.success();
        return true;
      } else if (action.equals(LOGOUT)){
        BuzzScreen.getInstance().logout();

        Log.d(TAG, "Logged out");
        callbackContext.success();
        return true;
      } else {
        Log.e(TAG, "Unknown/unsupported action: " + action);
        callbackContext.error("Unknown/unsupported action");
      }

      return false;
    }
}