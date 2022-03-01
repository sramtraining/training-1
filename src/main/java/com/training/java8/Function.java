package com.training.java8;

public class Function {

    public static void main(String[] args) {
        java.util.function.Function<String, Integer> toInteger = Integer::valueOf;
        System.out.println(toInteger.apply("123"));

    }
}
