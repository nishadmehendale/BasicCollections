package com.collection.test;

import java.util.TreeSet;

import com.collection.application.Car;

//Testing TreeSet
public class TestTreeSet {

	public static void main(String[] args) {
		//Testing with Strings
		TreeSet<String> treeset = new TreeSet<>();

		treeset.add("Sayali");
		treeset.add("Nishad");
		treeset.add("Drishti");
		treeset.add("Anindya");
		treeset.add("Mehek");

		treeset.stream().forEach((name) -> System.out.println(name));

		//Testing with Car objects
		TreeSet<Car> car = new TreeSet<>();

		car.add(new Car("Toyota", "Etios", 20010, 230000));
		car.add(new Car("BMW", "4567", 2014, 470000));
		car.add(new Car("Audi", "8", 2017, 2023000));

		car.stream().forEach((name) -> System.out.println(name));
	}
}