package OOPConceptPart2;

public class BMW extends Car {//this is called Has-a-relationship

	//when some method is present in parent class as well as in child class with same name and same number of argument is called method overriding
	public void start() {//overridden method
		System.out.println("BMW start");
	}
	
	public void theftsafety() {
		System.out.println("Theft protection");
	}
	
}
