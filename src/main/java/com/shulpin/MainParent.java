package com.shulpin;

import com.shulpin.model.Animal;
import com.shulpin.model.Cat;
import com.shulpin.model.Dog;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainParent {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("parent-config.xml");


        Animal cat = (Cat) context.getBean("cat");
        Animal dog = (Dog) context.getBean("dog");


    }

}
