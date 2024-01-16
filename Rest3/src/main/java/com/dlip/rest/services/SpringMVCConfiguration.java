package com.dlip.rest.services;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@ComponentScan("com.*")
@Configuration
@EnableWebMvc
public class SpringMVCConfiguration extends WebMvcConfigurationSupport {

}
