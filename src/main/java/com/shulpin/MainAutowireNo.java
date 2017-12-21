package com.shulpin;

import com.shulpin.model.Application;
import com.shulpin.model.Driver;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAutowireNo {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("autowired-no.xml");

        Driver driver = (Driver)context.getBean("driver");

        System.out.println(driver);

    }



}
