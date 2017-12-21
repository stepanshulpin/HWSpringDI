package com.shulpin.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class JavaCollection {

    List productList;
    Set productSet;
    Map productMap;

    public JavaCollection() {
        System.out.println("JavaCollection.JavaCollection empty");
    }

    public JavaCollection(List productList, Set productSet, Map productMap) {
        this.productList = productList;
        this.productSet = productSet;
        this.productMap = productMap;
        System.out.println("JavaCollection.JavaCollection");
        System.out.println("productList = " + productList);
        System.out.println("productSet = " + productSet);
        System.out.println("productMap = " + productMap);
    }

    public List getProductList() {
        return productList;
    }

    public void setProductList(List productList) {
        this.productList = productList;
        System.out.println("JavaCollection.setProductList");
        System.out.println("productList = " + productList);
    }

    public Set getProductSet() {
        return productSet;
    }

    public void setProductSet(Set productSet) {
        this.productSet = productSet;
        System.out.println("JavaCollection.setProductSet");
        System.out.println("productSet = " + productSet);
    }

    public Map getProductMap() {
        return productMap;
    }

    public void setProductMap(Map productMap) {
        this.productMap = productMap;
        System.out.println("JavaCollection.setProductMap");
        System.out.println("productMap = " + productMap);
    }
}
