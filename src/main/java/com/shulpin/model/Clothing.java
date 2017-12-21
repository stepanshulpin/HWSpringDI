package com.shulpin.model;

import java.util.concurrent.atomic.AtomicLong;

public class Clothing {

    private static AtomicLong count = new AtomicLong(0);
    private boolean isWomen;


    public Clothing() {
        count.incrementAndGet();
    }


    public String toString() {
        return "A new " + (isWomen?"women":"") + "Clothing, count(" + count.get() +")";
    }

    public void setIsWomen(boolean women) {
        isWomen = women;
    }

    public boolean isWomen() {
        return isWomen;
    }

}
