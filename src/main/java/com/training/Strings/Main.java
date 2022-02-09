package com.training.Strings;

public class Main {

    public static void main(String[] args) {
        String a = "Hello";

        if (a.equalsIgnoreCase("hello")) {
            System.out.println("Equals Case");
        }

        if (a.length() == 5) {

        }

       a = a.replace('l', 'p');
        System.out.println(a);
    }
}
