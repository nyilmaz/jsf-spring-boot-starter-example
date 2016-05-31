package com.github.persapiens.sample.security.config;

import java.util.Arrays;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/**
 * @author nyilmaz
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

   @Override
   protected void configure(HttpSecurity http) throws Exception {
      http
          .userDetailsService(userDetailsService())
          .formLogin()
            .defaultSuccessUrl("/helloWorldSecurity.jsf").and()
          .csrf()
            .disable()
          .authorizeRequests()
            .anyRequest().authenticated();
   }

   @Override
   public void configure(WebSecurity web) throws Exception {
      web.ignoring().antMatchers("javax.faces.resources/*");
   }

   @Override
   protected UserDetailsService userDetailsService() {
      User user1 = new User("persapiens", "123", AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_ADMIN"));
      User user2 = new User("nyilmaz", "qwe", AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_USER"));
      return new InMemoryUserDetailsManager(Arrays.asList(user1, user2));
   }

}
