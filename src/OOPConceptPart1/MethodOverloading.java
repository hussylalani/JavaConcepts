package OOPConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {

		MethodOverloading obj = new MethodOverloading();
		
		obj.sum();
		obj.sum(10);
		obj.sum(10,5);
		
	}
	
	//we can overload main method
	public static void main(int i) {
		
	}
	
	public static void main(int i, int j) {
		
	}
	
	//We cannot create method inside a method
	//We cannot create duplicated method
	
	
	//method overloading --> when the method name is same with different arguments/datatypes or input parameters within the same class.
	public void sum() {//no input parameter
		System.out.println("sum method -- zero input params");
	}
	
	public void sum(int i) {//same name but one input parameter
		System.out.println("sum method -- one input params");
	}
	
	public void sum(int i, int j) {//same name but two input parameter
		System.out.println("sum method -- two input params");
	}

}
