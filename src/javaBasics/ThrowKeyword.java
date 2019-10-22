package javaBasics;

public class ThrowKeyword {
	
	//error and exception are child class, whose parent class is throwable. Object is parent class of throwable
	//throw keyword is used to delibrately create your own exception
	public static void main(String[] args) throws Exception {

		System.out.println("abc");
		
		try {
			throw new Exception("Hussain Exception");//this will call the constructor of Exception class and we pass a string parameter. 'Hussain Exception' is our own exception created
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//throw new Exception("Hussain Exception");wrong way of doing it
		
		System.out.println("pqr");
	}

}
