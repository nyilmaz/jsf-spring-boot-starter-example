package org.joinfaces.example.view;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import org.omnifaces.util.Faces;

/**
 * @author nyilmaz
 */
public class FailedView implements Serializable {

   @PostConstruct
   public void setup() {
      FacesContext context = Faces.getContext();
      assert context!=null;
   }

   public Integer getValue() {
      return 42;
   }

}
