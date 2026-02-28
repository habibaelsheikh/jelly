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
    public String cap(String s){

            return s.substring(0, 1).toUpperCase() + s.substring(1);

    }
        public String capall(String s){
            String finalstring = "";
            String[] words = s.split("\\s+");
            for (String word : words) {
                finalstring += word.substring(0, 1).toUpperCase() + word.substring(1) + " ";
            }
            return finalstring.trim();
        }

}