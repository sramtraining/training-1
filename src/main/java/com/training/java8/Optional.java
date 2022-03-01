package com.training.java8;

public class Optional {

    public static void main(String[] args) {

        Tutorial tutorial = new Tutorial();

        java.util.Optional<Tutorial> optional = java.util.Optional.of(tutorial);


        System.out.println(optional.isPresent());
        System.out.println(optional.get());

        tutorial = null;
        optional = java.util.Optional.of(tutorial);

        Tutorial tutorial1 = new Tutorial();
        tutorial1.setId(123l);
        System.out.println(optional.orElse(tutorial1));
    }
}
