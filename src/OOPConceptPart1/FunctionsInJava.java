package OOPConceptPart1;

public class FunctionsInJava {

	public static void main(String[] args) {
		//main method is always void bcz it never returns a value
		//functions and methods are same thing
		
		FunctionsInJava obj = new FunctionsInJava();//one object will be created, obj is the reference variable referring to this object
											//after creating the object, the copy of all non static methods will be given to this object
		
		obj.test();
		
		int l = obj.pqr();
		System.out.println(l);
	}
	
	//non static methods
	public void test() {
		System.out.println("test method");
	}
	
	public int pqr() {
		System.out.println("PQR method");
		int a = 10;
		int b = 20;
		int c = a+b;
		
		return c;
	}
	
	public String qa() {
		System.out.println("qa method");
		String s = "selenium";
		
		return s;
	}
	
	public int division(int x, int y) {
		int d = x/y;
		
		return d;
	}
}
