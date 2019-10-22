package javaBasics;

public class NullConcepts {
	
	static Object obj;//value will be null for any reference variable if it is not defined
	static String str;
	static NullConcepts nc;
	

	public static void main(String[] args) {

		//1. case sensitive
		//Object obj = null;
		
		//default reference value will be null
		System.out.println(obj);
		System.out.println(str);
		System.out.println(nc);
		
		//2. 
		Integer i = null;
		int j = i;//not allowed bcz i is reference variable of class Integer and j is primitive data type
		
		//3.instanceof
		Integer i = null;
		Integer j = 10;
		
		System.out.println(j instanceof Integer);//value is true
		System.out.println(i instanceof Integer);//value will be false
		
		//5.static vs non-static
		NullConcepts obj = null;
		obj.send();//NullPointerException bcz obj is null and send() is just a template stored in the memory
		obj.sum();//"sum...." it will print the value bcz static method can be accessed by null references bcz it is stored in common memory allocation in memory and it does not hold any memory inside the object
	}
	
	public void send() {
		System.out.println("sendd...");
	}
	
	public static void sum() {
		System.out.println("sum...");
	}

}
