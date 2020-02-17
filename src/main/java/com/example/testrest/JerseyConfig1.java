package com.example.testrest;
//import org.glassfish.jersey.filter.LoggingFilter;
//import org.glassfish.jersey.logging.LoggingFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.RequestContextFilter;
@Component
public class JerseyConfig1 extends ResourceConfig {

    public JerseyConfig1(){
        register(RequestContextFilter.class);
        packages("com");
//register(LoggingFilter.class);
    }
}

