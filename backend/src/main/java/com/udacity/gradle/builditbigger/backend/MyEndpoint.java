package com.udacity.gradle.builditbigger.backend;

import com.example.comedian.Comedian;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

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

    /** A simple endpoint method that tells a joke */
    @ApiMethod(name = "amuseMe")
    public MyBean amuseMe() {
        MyBean response = new MyBean();
        Comedian comedian = new Comedian();
        response.setData(comedian.amuseMe());
        return response;
    }

}
