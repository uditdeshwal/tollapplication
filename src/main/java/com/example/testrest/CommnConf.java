//package com.example.testrest;
//
//import org.glassfish.jersey.servlet.ServletContainer;
//import org.glassfish.jersey.servlet.ServletProperties;
//import org.springframework.boot.web.servlet.ServletRegistrationBean;
//import org.springframework.context.annotation.Bean;
//
//public class CommnConf {
//
//
//   @Bean
//   public ServletRegistrationBean jerseyServlet(){
//
//        ServletRegistrationBean servletRegistration = new ServletRegistrationBean(new ServletContainer(), "/*");
//        servletRegistration.addInitParameter(ServletProperties.JAXRS_APPLICATION_CLASS, JersyConfig1.class.getName());
//        return  servletRegistration;
//    }
//}
