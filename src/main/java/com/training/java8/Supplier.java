package com.training.java8;

public class Supplier {

    public static void main(String[] args) {

        java.util.function.Supplier<Tutorial> personSupplier = Tutorial::new;
        personSupplier.get();
    }
}
