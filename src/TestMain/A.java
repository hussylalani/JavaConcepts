package TestMain;

public class A {

	//we can call main method from different class, because it is static and public in nature
	public static void main(String[] args) {

		System.out.println("class A main method");
		B.main(args);
		
	}

}
