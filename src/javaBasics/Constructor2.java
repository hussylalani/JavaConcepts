package javaBasics;

public class Constructor2 extends Constructor1 {

	public Constructor2() {
		super(10);//super keyword will take to parent class constructor which has int argument
				//super keyword should be written inside the child class constructor and should be the first statement. It can be used only once in a method
		System.out.println("child class constructor");
	}
	
	public static void main(String args[]) {
		Constructor2 obj = new Constructor2();
	}
	
}
