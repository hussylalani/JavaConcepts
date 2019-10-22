package TestMain;

public class TestBase {

	//main method is overloaded - same main method with different parameters
	//JVM will still search for main method with "String[] args" parameters and it should be "public static void". JVM will not execute unless it finds the said main method.
	public static void main(String[] args) {
		System.out.println("main method");		
		main("Time");
		main(4);
		main(4,3);
	}
	
	public static void main(String args) {
		System.out.println("main method 1");		
	}
	
	public static void main(int a) {
		System.out.println("main method 2");		
	}
	
	public static void main(int a, int b) {
		System.out.println("main method 3");		
	}
	
	

}
