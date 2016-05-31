package com.github.persapiens.sample.security.view;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 * @author nyilmaz
 */
@Named
@ViewScoped
public class HelloWorldSecurityMBean {

   private String nickname;

   public String getNickname() {
      return nickname;
   }

   public void setNickname(String nickname) {
      this.nickname = nickname;
   }

   public void buttonAction() {
      addMessage("Welcome " + nickname + "!!!");
   }

   public void addMessage(String summary) {
      FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, null);
      FacesContext.getCurrentInstance().addMessage(null, message);
   }

}
