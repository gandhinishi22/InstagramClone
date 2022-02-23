package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("DsBGHJ3H3soFZ1HYQsz4DQXE9xju3jH5tsQhFnEq")
                .clientKey("i7CoDe7oBIZdNi5UTFLKfTBqa9Ca8sKyacgODmqb")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
