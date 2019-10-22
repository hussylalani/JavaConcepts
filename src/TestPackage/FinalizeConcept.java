package TestPackage;

public class FinalizeConcept {

	public void finalize() {//just before gc() finalize method will be called just for clean up processing of object
		System.out.println("finalize method");
	}
	
	public static void main(String[] args) {

		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();
		
		f1 = null;
		f2 = null;
		
		System.gc();//garbage collector method is called 
		
	}

}
