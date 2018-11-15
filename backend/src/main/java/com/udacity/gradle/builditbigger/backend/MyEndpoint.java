package com.udacity.gradle.builditbigger.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import javax.inject.Named;

import club.battlestar.vachan.jokes.JokesProvider;

// https://gradle-222505.appspot.com/_ah/api/myApi/v1/joke?fields=data


/** An endpoint class we are exposing */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class MyEndpoint {

    /** A simple endpoint method that takes a name and says Hi back */
    @ApiMethod(name = "joke", httpMethod = "GET")
    public MyBean joke() {
        MyBean response = new MyBean();
        response.setData(new JokesProvider().getJokes());
        return response;
    }

}
