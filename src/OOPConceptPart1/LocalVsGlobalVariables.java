package OOPConceptPart1;

public class LocalVsGlobalVariables {
	
	//Global variables or class variables
	String name = "Tom";
	int age = 25;
	

	public static void main(String[] args) {

		int i = 10;//Local variables for main method
		
		LocalVsGlobalVariables obj = new LocalVsGlobalVariables();
		System.out.println(obj.name);
		
	}
	
	public void sum() {
		
		int i = 15;//local variable for sum method
		int j = 20;
		int age = 25;
		System.out.println();
	}

}
