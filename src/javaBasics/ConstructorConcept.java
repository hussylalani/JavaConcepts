package javaBasics;

public class ConstructorConcept {
	//every method whose object is created has a default constructor
	//constructor will be called immediately once we create the object of this class
	//constructor can be overload
	public ConstructorConcept() {
		System.out.println("Default constructor");
	}
	
	public ConstructorConcept(int i) {
		System.out.println("single param constructor: " + i);
	}
	
	public ConstructorConcept(int i, int j) {
		System.out.println("single param constructor: " + i + j);
	}
	
	
	public static void main(String[] args) {
		
		ConstructorConcept obj1 = new ConstructorConcept();
		ConstructorConcept obj2 = new ConstructorConcept(10);
		ConstructorConcept obj3 = new ConstructorConcept(10, 20);
		
	}

}
