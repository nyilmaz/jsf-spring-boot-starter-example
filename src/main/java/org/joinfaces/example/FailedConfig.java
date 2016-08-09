package org.joinfaces.example;

import javax.faces.view.ViewScoped;
import org.joinfaces.example.view.FailedView;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author nyilmaz
 */
@Configuration
public class FailedConfig {

   @Bean
   @ViewScoped
   public FailedView failedView() {
      return new FailedView();
   }

}
