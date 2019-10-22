package ListConcepts;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {

		ArrayList ar = new ArrayList();//non-generic array list because it allows to store any data type
		
		//1. array list can contain duplicate values
		//2. maintain insertion order
		//3. It is not synchronized in respect to multi-threading concept. Thats why it is slow
		//4. allows random access to fetch the element because it stores the values on the basis of indexes
		
		ar.add(10);
		ar.add(20);
		ar.add(30);
		
		System.out.println(ar.size());
		
		ar.add(40);
		ar.add(50);
		
		System.out.println(ar.size());
		
		//non-generic vs generic
		ArrayList<Integer> ar1 = new ArrayList<Integer>();//generic array list because it allows to store only integer data type
		
		ArrayList<E> ar2 = new ArrayList<E>();//we add <E> if we want all data types in the array
		
		//Employee class objects
		Employee e1 = new Employee("Hussain", 28, "Technology");
		Employee e2 = new Employee("Hussy", 27, "Technology");
		Employee e3 = new Employee("Hussein", 25, "Technology");
		
		ArrayList<Employee> ar3 = new  ArrayList<Employee>();
		ar3.add(e1);
		ar3.add(e2);
		ar3.add(e3);
		
		//iterator to traverse the value of above array list
		//iterator does not work on the basis of indexes, so to traverse the values we need to use while() loop
		Iterator<Employee> it = ar3.iterator();
		while(it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		
		//**************
		//addAll() is used to merge two arraylist
		ArrayList<String> ar4 = new ArrayList<String>();
		ar4.add("Hello");
		ar4.add("Maths");
		ar4.add("Physics");
		
		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("Hello again");
		ar5.add("Maths part 2");
		ar5.add("Physics part 2");
		
		//adding ar5 in ar4
		ar4.addAll(ar5);
		
		for(int i=0; i<ar4.size(); i++) {
			System.out.println(ar4.get(i));
		}
		
		//removeAll() two remove one arraylist from other arraylist
		ar4.removeAll(ar5);
		
		for(int i=0; i<ar4.size(); i++) {
			System.out.println(ar4.get(i));
		}
		
		System.out.println("***********");
		//retainAll() is used to print/access the common value in two array list
		ArrayList<String> ar6 = new ArrayList<String>();
		ar6.add("Hello");
		ar6.add("Maths");
		ar6.add("Physics");
		
		ArrayList<String> ar7 = new ArrayList<String>();
		ar7.add("Hello");
		ar7.add("Maths part 2");
		ar7.add("Physics part 2");
		
		ar6.retainAll(ar7);
		
		for(int i=0; i<ar6.size(); i++) {
			System.out.println(ar6.get(i));
		}
	}

}
