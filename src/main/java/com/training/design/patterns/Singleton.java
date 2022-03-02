package com.training.design.patterns;

public class Singleton {

//Refer https://refactoring.guru/design-patterns/java for addtional design Patterns

    // Double Checked Locking based Java implementation of
    // singleton design pattern
    private static volatile Singleton obj = null;


    //Private Constructor
    private Singleton() {
    }

    public static Singleton getInstance() {
        if (obj == null) {
            // To make thread safe
            synchronized (Singleton.class) {
                // check again as multiple threads
                // can reach above step
                if (obj == null)
                    obj = new Singleton();
            }
        }
        return obj;
    }
}
