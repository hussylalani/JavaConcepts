package javaBasics;

public class ExceptionHandling {
	
	int a = 10;
	//static ExceptionHandling obj; <-- this throws nullpointerexception bcz reference is created but there is no object
	
	
	public static void main(String[] args) {

		//int i = 9/0;
		//System.out.println(i);//uncaught exception; after running the program you get arithmetic exception
		
		//caught exception
		//Thread.sleep(2000);
		
		//ExceptionHandling obj = null; this is called null reference
		ExceptionHandling obj = new ExceptionHandling(); 
		obj = null;
		//System.out.println(obj.a);//it gives null pointer exception bcz obj is null
		
		
		//There are 3 types of exception handling method
		//1. try-catch block:
		try {
			int j = 9/0;//this code will throw an exception			
		}
		catch(ArithmeticException e){
			e.printStackTrace();
			//System.out.println(e.getMessage());
		}
		 
		System.out.println("ABC");
		
		try {
			int j = 9/0;//this code will throw an exception			
		}
		catch(Throwable e){//throwable is superclass of 'error' and 'exception'
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
	}

}
