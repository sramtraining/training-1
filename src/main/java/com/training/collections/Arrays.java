package com.training.collections;

import com.training.exceptions.UserDefinedException;

public class Arrays {
    public static void main(String[] args) throws UserDefinedException {
        int[] intArr = {1, 2, 3, 4, 5};
        for (int i : intArr) {
            System.out.println(i);
        }
        try {
            System.out.println(intArr[1]);
            System.out.println(1 / 0);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("404" + " Index is out of Limit");
        } catch (ArithmeticException e) {
            System.out.println("406" + " UnDefined Number");
            //   throw new UserDefinedException("404", "UnDefined Number");
        } catch (InternalError e) {
            throw new UserDefinedException("405", "InternalError");
        } finally {
            System.out.println("Finally");
        }

        System.out.println("I am still here");
    }
}
