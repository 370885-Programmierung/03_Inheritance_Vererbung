package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        Cat cat1 = new Cat(null, null, 0, 0);
        Tomcat tomcat1 = new Tomcat(null, null, 0);
        Supercat supercat1 = new Supercat(null, null, 0);

        Cat cat = new Cat("Grizabella", "Blond", 20, 0);
        output(cat.getStringAttributes("#name"));
        output(cat.getStringAttributes("#color"));
        output(cat.getAge());
    
        output("------------------------");

        Tomcat tomcat = new Tomcat("Alonso", "grau", 25);
        output(tomcat.getStringAttributes("#name"));
        output(tomcat.getStringAttributes("#color"));
        output(tomcat.getAge());

        output("------------------------");

        Supercat supercat = new Supercat("Hermann", "schwarz", 53);
        output(supercat.getStringAttributes("#name"));
        output(supercat.getStringAttributes("#color"));
        output(supercat.getAge());
    }

    // Methode wird aus der KLASSE aufgerufen, daher static
    private static void output(String outputStr) {
        System.out.println(outputStr);
    }
}

