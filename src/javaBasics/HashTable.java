package javaBasics;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {

		//in array we have indexes, in hashtable we have keys
		Hashtable h = new Hashtable();
		
		h.put("A", "Test");
		h.put("B", "Hello");
		h.put("C", "Room");
		
		System.out.println(h.size());
		
		h.put(1, 100);
		h.put(2, 200);
		
		System.out.println(h.size());
		
		System.out.println(h.get(2));
		System.out.println(h.get("B"));
		
		h.put(3, "Mary");
		
		Hashtable<Integer, Integer> h1 = new Hashtable<Integer, Integer>(); //to restrict input just as integer
		
	}

}
