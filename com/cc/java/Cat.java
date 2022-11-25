package com.cc.java;

public class Cat extends Supercat{
 
    private int counter;

    protected Cat(String name, String furColor, int age, int counter) {
        super(name, furColor, age);
        this.counter = counter;
    }

    protected String getAge() {
            return checkEscalationLevel(); 
    }

    private String checkEscalationLevel() {
    counter++;
        switch (counter) {
            case 1:
                return "This is an inappropriate question!";
            case 2:
                return "I've told you once!"; 
            case 3:
                return "Talk to the hand!";        
            default:
                return "1#!?&&%"; 
        }
    }
}
