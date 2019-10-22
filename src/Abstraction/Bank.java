package Abstraction;

public abstract class Bank {

	//in abstract class one abstract method is compulsory; rest can be non abstract method.
	//partial abstraction means having abstract method and non abstract method in a class
	//we cannot create the object of abstract class; e.g Bank b = new Bank();
	
	public abstract void loan();//abstract method; it means it does not have a method body; hiding the implementation logic is called abstraction
	
	//non abstract methods
	public void credit() {
		System.out.println("abstract class credit method");
	}
	
	public void debit() {
		System.out.println("abstract class debit method");
	}
	
}
