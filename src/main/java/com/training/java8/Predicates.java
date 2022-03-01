package com.training.java8;

import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Predicates {

    public static void main(String[] args) {
        Predicate<String> predicate = (s) -> s.length() > 0;
        System.out.println(predicate.test("Surya"));
        System.out.println(predicate.negate().test("Surya"));







    }
}
