package TestCases;

public class FinallyConcept {

	public static void main(String[] args) {

		test1();
		
	}
	
	public static void test1() {
		try {
			System.out.println("inside test1 method");
			throw new RuntimeException("test");
		}catch(Exception e) {
			System.out.println("inside catch block");
		}
		//finally is always used with try catch and it will always be executed
		finally {
			System.out.println("inside finally block");
		}
	}

}
