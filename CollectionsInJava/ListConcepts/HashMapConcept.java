package ListConcepts;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {

		//HashMap is a class which implements Map Interface
		//it extends AbstractMap
		//it contains only unique elements
		//stores the value in key - value pair format
		//it may have one null key and multiple null values
		//it maintains no order
		//HashMap is non-synchronised; it means hashmap can be accessed by all the threads if multiple threads are running
		//hashmap increases the performance compared to hashtable bcz hashtable is synchronised
		//disadvantage of hashmap: if anyone specific thread updates the value of a key- value pair object then all the threads get the updated value and its called fail-fast condition
		// fail-fast condition is also called concurrent modification exception
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1,"selenium");
		hm.put(2,"qtp");
		hm.put(3,"testcomplete");
		hm.put(4,"rft");
		
		System.out.println(hm.get(1));
		System.out.println(hm.get(4));//null; it does not give outofboundexception bcz it does not store on basis of index
		
		//to print all values of hashmap
		for(Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		hm.remove(3);
		System.out.println(hm);
		
		//to store the Employee constructor values using HashMap
		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();
		
		Employee e1 = new Employee("Hussy", 28, "Tech"); //initialising the employee constructor
		Employee e2 = new Employee("raj", 25, "admin");
		Employee e3 = new Employee("vinay", 29, "media");
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		//iterate/traverse the HashMap
		for(Entry<Integer, Employee> m : emp.entrySet()) {
			int key = m.getKey();
			Employee e = m.getValue();
			
			System.out.println(key + " " + "Info");
			System.out.println(e.name + " " + e.age + " " + e.dept);
		}
		
	}

}
