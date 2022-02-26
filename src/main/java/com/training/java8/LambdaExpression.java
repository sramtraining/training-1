package com.training.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExpression {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

        //Before Java-8
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        });
        System.out.println(names);


        //After Java-8
        names.sort((a, b) -> a.compareTo(b));
        System.out.println(names);



        //Funtional Interface
        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
        Integer converted = converter.convert("123");
        System.out.println(converted);


        Converter<List<String>, String> converter1 = (from) ->from.toString();
        String s = converter1.convert(names);
        System.out.println(s);

    }
}
