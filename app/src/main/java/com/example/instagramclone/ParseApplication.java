package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("kdhoHhMrDGX2akUzAOQ5X8Yhaz4gwnKRwFkZTJFh")
                .clientKey("hsuh5DkH80WRYmZ2G32CQW39egTgiuelOdhBxs6A")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
