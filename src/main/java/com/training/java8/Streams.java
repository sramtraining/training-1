package com.training.java8;

import java.util.ArrayList;
import java.util.List;

public class Streams {
    public static void main(String[] args) {
        List<String> stringCollection = new ArrayList<>();

        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");

        for (String s : stringCollection) {
            if(s.startsWith("a")){
                System.out.println(s);
            }
        }


        stringCollection.stream().filter(s -> s.startsWith("a")).forEach(a->System.out.println(a));

        //Method Reference  System.out::println
        stringCollection.stream().filter(s -> s.startsWith("a")).forEach(System.out::println);


    }
}
