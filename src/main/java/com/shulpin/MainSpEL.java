package com.shulpin;

import com.shulpin.model.Circle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpEL {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpEL-config.xml");

        Circle circle = (Circle)context.getBean("circle");
    }

}
