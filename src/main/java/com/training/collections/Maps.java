package com.training.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {
    public static void main(String[] args) {
        Map<Integer, String> maps = new HashMap<>();
        maps.put(123, "John");
        maps.put(123, "Peter");
        System.out.println(maps);

        Map<Integer, String> linkedMaps = new LinkedHashMap<>();


        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(4,"John");
        treeMap.put(1,"John");
        treeMap.put(2,"John");

        System.out.println(treeMap);

    }
}
