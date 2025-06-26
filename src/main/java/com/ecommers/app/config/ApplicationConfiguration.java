package com.ecommers.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationConfiguration {
    @Bean
    public String getConfiguration(){
       return "This is Bean";
   }
   @Bean
   public RestTemplate getRestTemplateBean(){
    return new RestTemplate();
   }
}
