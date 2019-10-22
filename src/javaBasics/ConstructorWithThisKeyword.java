package javaBasics;

public class ConstructorWithThisKeyword {
	//class/global variable
	String name;
	int age;
	
	public ConstructorWithThisKeyword(String name, int age) {
		//this.globalVariable = localVariable
		this.name = name;//this keyword is used to initialise the class/global variable in the constructor
		
		
		System.out.println(name);
		System.out.println(age);
	}
	
	
	
	public static void main(String[] args) {
		
		ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("Tom", 30);
			
	}

}
