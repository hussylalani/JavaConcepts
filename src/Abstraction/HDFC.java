package Abstraction;

public class HDFC extends Bank{

	//since HDFC is the child class of Parent Bank class, it becomes compulsory to define the abstract method in child class
	
	public void loan() {//this is a overridden method. this is the concept of overriding
		System.out.println("parent class 'bank' abstract method defined in child class 'hdfc'");
	}
	
	public void funds() {
		
		System.out.println("this is a hdfc bank method");
	}
	
	
	
}
