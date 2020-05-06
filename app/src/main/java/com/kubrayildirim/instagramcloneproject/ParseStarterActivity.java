package com.kubrayildirim.instagramcloneproject;

import android.app.Application;

import com.parse.Parse;

public class ParseStarterActivity extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.setLogLevel(Parse.LOG_LEVEL_DEBUG);

        Parse.initialize(new Parse.Configuration.Builder(this)
        .applicationId("PlrGkqF19SyVu9qOtQHWMjrr1ksU6YuqC9g8NEy8")
        .clientKey("wTOPyWxkYY4OtY10nUjqsFljs6ASptB1oYmYi2KP")
        .server("https://parseapi.back4app.com/")
        .build());
    }
}
