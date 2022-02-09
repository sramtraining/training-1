package com.training;

import com.training.oops.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TrainingApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainingApplication.class, args);

		Parent parent = new Parent();
		parent.getParentAge();

		Child child = new Child();
		child.getParentAge();

		GrandCHild grandCHild = new GrandCHild();
		grandCHild.getParentAge();

		Polymorphsim poly = new Polymorphsim();

		System.out.println(poly.getValue(4,6));
		poly.getParentAge();
	}




}
