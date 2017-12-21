package com.shulpin;

import com.shulpin.model.Application;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAutowireByName {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("autowired-byname.xml");

        Application application = (Application)context.getBean("application");

        System.out.println(application);

    }



}
