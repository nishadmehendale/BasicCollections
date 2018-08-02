package com.collection.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//Testing map
public class TestMap {

	public static void main(String[] args) {
		Map<String,String> map=new HashMap<>();
		
		map.put("Sayali", "Apple");
		map.put("Mehek", "Mango");
		map.put("Nishad", "Grapes");
		map.put("Drishti", "Watermelon");
		map.put("AnindyA", "Orange");
		
		Set<Entry<String,String>> set= map.entrySet();
		
		set.stream().forEach((e) -> System.out.println(e.getKey()+" "+e.getValue()));
		
		Set<String> keyset=map.keySet();
		System.out.println("Key set values are: "+keyset);
		
	}

}