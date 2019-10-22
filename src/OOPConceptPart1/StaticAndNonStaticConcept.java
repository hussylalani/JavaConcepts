package OOPConceptPart1;

public class StaticAndNonStaticConcept {
	
	
	String name = "Tom";//non static global variable
	static int age = 25; //static global variable

	public static void main(String[] args) {
		
		//how to call static method and variable?
		
		// direct calling:
		sum();
		
		//calling by classname:
		StaticAndNonStaticConcept.sum();
		
		//calling non static method
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		
		//accessing static method by obj reference
		obj.sum();//warning will be given and probably not a good practice
	}
	
	public void sendMail() {//non static method
		
		System.out.println("send mail method");
	}

	public static void sum() {//static method
		
		System.out.println("sum method");
	}
}
