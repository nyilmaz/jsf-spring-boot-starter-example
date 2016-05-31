package com.github.persapiens.sample.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

/**
 * @author nyilmaz
 */
@SpringBootApplication
@EnableWebSecurity
public class JsfSpringBootSecuritySampleApplication {

   public static void main(String[] args) {
      SpringApplication.run(JsfSpringBootSecuritySampleApplication.class, args);
   }
}
