package com.shulpin;

import com.shulpin.model.Application;
import com.shulpin.model.Performer;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAutowireConstructor {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("autowired-constructor.xml");

        Performer performer = (Performer)context.getBean("performer");

        System.out.println(performer);

    }



}
