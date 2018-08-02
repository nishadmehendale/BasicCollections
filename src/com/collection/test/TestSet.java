package com.collection.test;

import java.util.HashSet;
import java.util.Set;

import com.collection.application.Car;
import com.collection.application.CellPhone;
import com.collection.application.Laptop;
import com.collection.application.School;
import com.collection.application.Television;

//Testing Setss with different objects
public class TestSet {

	public static void main(String[] args) {
		
		Set<Object> hashSet = new HashSet<>();
		
		hashSet.add(new Laptop("Dell","Inspiron 3500","Windows","Intel i5"));
		hashSet.add(new Laptop("MacBook","Air Pro","MacOs","Intel i7"));
		hashSet.add(new Laptop("HP","Edge","Windows","Intel i7"));
		hashSet.add(new Laptop("HP","Edge","abc","xyz"));
		
		hashSet.add(new Car("Toyota", "Etios", 20010, 230000));
		hashSet.add(new Car("BMW", "4567", 2014, 470000));
		hashSet.add(new Car("Audi", "8", 2017, 2023000));
		hashSet.add(new Car("Audi", "8", 2018, 2023001));
		
		hashSet.add(new CellPhone("Moto", "G5S Plus", "Android",  "Black",14000));
		hashSet.add(new CellPhone("OnePlus", "5T", "Android", "Black", 30000));
		hashSet.add(new CellPhone("Apple", "X", "iOS", "Rose Gold", 70000));
		hashSet.add(new CellPhone("Apple", "X", "iOS", "Black", 70001));
		
		hashSet.add(new Television("Videocon", "LCD", false, 40000));
		hashSet.add(new Television("Onida", "LED", true, 53000));
		hashSet.add(new Television("Sony", "Plasma", true, 125000));
		hashSet.add(new Television("Sony", "Plasma", false, 125000));
		
		hashSet.add(new School("V.P.M", "Mumbai", "Mumbai", 50));
		hashSet.add(new School("SFIT", "Mumbai", "Mumbai", 35));
		hashSet.add(new School("S.V.P", "Thane", "Thane", 2));
		hashSet.add(new School("S.V.P", "Thane", "Thane", 20));
		
		hashSet.stream().forEach((hashset) -> System.out.println(hashset));

	}

}