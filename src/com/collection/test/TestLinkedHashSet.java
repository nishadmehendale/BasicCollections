package com.collection.test;

import java.util.LinkedHashSet;

//Testing LinkedHashset
public class TestLinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<String> linkedhashset=new LinkedHashSet<>();
		
		linkedhashset.add("Sayali");
		linkedhashset.add("Nishad");
		linkedhashset.add("Drishti");
		linkedhashset.add("Anindya");
		linkedhashset.add("Mehek");
		
		linkedhashset.stream().forEach((name) -> System.out.println(name));
	}

}