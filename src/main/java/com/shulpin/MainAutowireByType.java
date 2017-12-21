package com.shulpin;

import com.shulpin.model.Application;
import com.shulpin.model.Employee;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAutowireByType {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("autowired-bytype.xml");

        Employee employee = (Employee)context.getBean("employee");

        System.out.println(employee);

    }



}
