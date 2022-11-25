package com.cc.java;

public class App {
    
    public static void main(String[] args) {
    
        Cat cat = new Cat("Grizabella", "white", 0);
        output(cat.getStringAttributes("#name"));
        output(cat.getStringAttributes("#color"));
        output(cat.getAge());
        output(cat.getAge());
        output(cat.getAge());
        output(cat.getAge());
    
        output("------------------------");

        Tomcat tomcat = new Tomcat("Alonzo", "grey", 35);
        output(tomcat.getStringAttributes("#name"));
        output(tomcat.getStringAttributes("#color"));
        output(tomcat.getAge());

    }

    // Methode wird aus der KLASSE aufgerufen, daher static
    public static void output(String outputStr) {
        System.out.println(outputStr);
    }




}

