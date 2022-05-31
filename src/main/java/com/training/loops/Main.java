package com.training.loops;

import com.training.oops.American;

public class Main {

    public static void main(String[] args) {
        if (1 < 0) {
            System.out.println("If Block");


        } else {
            System.out.println("Else Block");

        }
        int[] arr = {1, 2, 3, 4};
        while (true) {
            System.out.println("While Block");

            break;
        }
        do {
            System.out.println("Do While Block");
            break;
        }
        while (true);




        for (int a : arr) {
            System.out.println(a);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        American amc = new American();
        amc.talk();

    }
}
