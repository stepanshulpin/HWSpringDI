package com.shulpin;

import com.shulpin.model.JavaCollection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCollectionsDI {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("collections-DI.xml");


        JavaCollection jc = (JavaCollection) context.getBean("javaCollection");

        System.out.println(jc.getProductList());
        System.out.println(jc.getProductSet());
        System.out.println(jc.getProductMap());


    }



}
