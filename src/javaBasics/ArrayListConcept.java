package javaBasics;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		
		al.add(100);
		al.add(200);
		al.add(300);
		
		System.out.println(al.size());
		
		al.add(400);
		al.add(500);
		
		System.out.println(al.size());
		
		al.add("Hello");
		al.add(12.33);
		al.add('M');
		
		System.out.println(al.size());
		System.out.println(al.get(4));
		
		al.remove(7);
		
		System.out.println(al.size());
		
		//to print all the values of arraylist
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		//to only have integers in arraylist
		ArrayList<Integer> ar = new ArrayList<Integer>();
		//ar.add("Tom");//Error
		
	}

}
