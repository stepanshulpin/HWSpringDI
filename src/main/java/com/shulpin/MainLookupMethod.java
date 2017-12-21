package com.shulpin;

import com.shulpin.model.Clothing;
import com.shulpin.model.ClothingShop;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLookupMethod {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("lookup-method-config.xml");
        ClothingShop shop = (ClothingShop)context.getBean("clothingShop");

        Clothing first = shop.makeClothing();

        System.out.println("first = " + first);
        Clothing second = shop.makeWomenClothing();

        System.out.println("second = " + second);

    }

}
