package com.training.oops;

public class American implements PersonInterface{

    @Override
    public void dance() {
        System.out.println("I Dance Tango");
    }

    @Override
    public void speak() {
        System.out.println("I Speak English");

    }
    @Override
    public void talk()
    {
        System.out.println("I can Talk English");
    }
}
