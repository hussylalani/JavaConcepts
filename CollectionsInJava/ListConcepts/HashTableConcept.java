package ListConcepts;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {

		//hashtable is similar to hashmap but hashtable is synchronised
		//stores the value on the basis of key-value pair 
		//in hashtable we use a object which is specified as a key
		//in hashtable the key is stored in the form of object and object in java have special unique identifier called hashcode 
		//key-->object-->hashcode--> value
		//hashcode is a java object number. whenever you create an object, java provides a particular hashcode for that object. its a 32 bit sign integer number
		//it contains only unique values
		//no null key and null values
		
		Hashtable h1 = new Hashtable();
		h1.put(1, "Tom");
		h1.put(2, "Test");
		h1.put(3, "Java");
		
		//create a clone copy/shallow copy of hashtable:
		Hashtable h2 = new Hashtable();
		
		h2 = (Hashtable)h1.clone();
		
		System.out.println("the values from h1 " + h1);
		System.out.println("the values from h2 " + h2);
		
		h1.clear();
		System.out.println("the values from h1 " + h1);
		System.out.println("the values from h2 " + h2);
		
		//contains value:
		Hashtable h3 = new Hashtable();
		h3.put(1, "Hussain");
		h3.put(2, "Hussy");
		h3.put(3, "Hu");
		
		if(h3.containsValue("hussy")) {
			System.out.println("value is present");
		}
		
		//print all the values from hashtable using -- Enumeration -- elements()
		Enumeration e = h3.elements();
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		//get all the values from hashtable using -- entrySet() -- set of hashtable values
		Set s = h3.entrySet();
		System.out.println(s);
		
		Hashtable h4 = new Hashtable();
		h4.put(1, "Hussain");
		h4.put(2, "Hussy");
		h4.put(3, "Hu");
		
		//check both the hashtables are equal or not:
		if(h3.equals(h4)) {
			System.out.println("both are equal");
		}
		
		//get the value from a key
		System.out.println(h3.get(1));
		
		//get the hashcode of hashtable object:
		System.out.println(h3.hashCode());
		
		//generics
		Hashtable<String, String> ex = new Hashtable<String, String>();
	}

}
