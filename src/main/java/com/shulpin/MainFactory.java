package com.shulpin;

import com.shulpin.model.LoginService;
import com.shulpin.model.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainFactory {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("factory-config.xml");
        UserService userService=(UserService)context.getBean("userService");
        LoginService loginService = (LoginService) context.getBean("loginService");
    }

}
