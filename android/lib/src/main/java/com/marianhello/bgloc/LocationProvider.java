/*
According to apache license

This is fork of christocracy cordova-plugin-background-geolocation plugin
https://github.com/christocracy/cordova-plugin-background-geolocation

This is a new class
*/

package com.marianhello.bgloc;

/**
 * LocationProvider interface
 */
public interface LocationProvider {

    void onCreate();
    void onDestroy();
    void onStart();
    void onStop();
    void onSwitchMode(int mode);
    void onConfigure(Config config);
    boolean isStarted();
}
