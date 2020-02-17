package com.example.testrest;

import org.glassfish.jersey.servlet.ServletContainer;
import org.glassfish.jersey.servlet.ServletProperties;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

/**
 * Created by niharikasaxena on 25/08/17.
 */
public class CommonConfiguration {

    @Bean
    public ServletRegistrationBean jerseyServlet(){
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new ServletContainer(), "/*");
        servletRegistrationBean.addInitParameter(ServletProperties.JAXRS_APPLICATION_CLASS,JerseyConfig1.class.getName());
        return  servletRegistrationBean;
    }
}
