package com.example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleFunction {
    public String hello(String name) {
        return "hello " + name; 
    }

    public static void main(String[] args) {
        SimpleFunction sf = new SimpleFunction();
        System.out.println(sf.hello("Habiba"));
    }
    public String today(){
         SimpleDateFormat sdf= new SimpleDateFormat("yyyy-mm");
         return sdf.format(new Date());
    }
    public boolean isEven(int n){
        if (n % 2 == 0) {
            System.out.println(n + " is even.");
            return true;

        } else {
            System.out.println(n + " is odd.");
            return false;
        }
    }

}