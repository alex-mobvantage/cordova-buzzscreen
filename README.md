# cordova-buzzscreen

This is a plugin for accessing the BuzzScreen SDK functionality from within your cordova application.

**_Note: Only Android is currently supported_**

# Integration

Check out the <a href="https://github.com/Buzzvil/buzzscreen-sdk-publisher/blob/master/README_EN.md">documentation</a> for installing the SDK.

You can skip adding the libraries and modifying the manifest - this is taken care of by the plugin.

You must call `BuzzScreen.init` from your `Application`'s constructor. E.g:

```java
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ...
        // app_key : `app_key` for SDK usage. Find it on your BuzzScreen dashboard.
        // SimpleLockerActivity.class : Lock screen activity class
        // R.drawable.image_on_fail : An image file to be displayed when either network error occurs or there is no campaign available temporarily
        BuzzScreen.init("app_key", this, SimpleLockerActivity.class, R.drawable.image_on_fail);
    }
}
```

Make sure to add strings (ie in `strings.xml`) for:
* `buzzscreen_app_license`
* `buzzscreen_plist`

# Cordova Usage

* To add plugin
```
cordova plugin add https://github.com/alex-mobvantage/cordova-buzzscreen.git
```

* To remove plugin
```
cordova plugin remove cordova-buzzscreen
```

# Supported Methods

* `activate(successCallback, errorCallback)`
* `deactivate(successCallback, errorCallback)`
* `logout(successCallback, errorCallback)`
* `setUserId(userId, successCallback, errorCallback)`
* `setBirthYear(birthYear, successCallback, errorCallback)`
* `setGender(gender, successCallback, errorCallback)`
