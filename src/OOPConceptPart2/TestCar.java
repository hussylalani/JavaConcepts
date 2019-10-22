package OOPConceptPart2;

public class TestCar {

	public static void main(String[] args) {

		//polymorphism means one to many methods. Methods overriding, when same methods are created in parent and child class we are achieving method overriding
		//this is called static polymorphism or compile time polymorphism	
		BMW b = new BMW();
		b.start();//BMW start method will be executed instead Car start method
		b.stop();
		b.refuel();
		b.theftsafety();
		b.engine();
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.theftsafety();//Error a parent cannot access child class method
		
		//dynamic polymorphism or Top casting
		//only overriden methods and parent class methods will be called using dynamic polymorphism
		Car c1 = new BMW();//child class object can be referred by parent class reference variable -- dynamic polymorphism or run time polymorphoism
		c1.start();
		c1.stop();
		c1.refuel();
		c1.theftsafety();//Error cannot access
		
		//Down Casting
		BMW b1 = (BMW)new Car();// Error ClassCastException. At runtime a parent class object cannot be referred to child class variable
	}

}
