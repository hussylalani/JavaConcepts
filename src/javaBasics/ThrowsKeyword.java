package javaBasics;

public class ThrowsKeyword {

	//in throws , jvm catches/accepts the exception
	//program gets terminated once exception is encountered
	public static void main(String[] args) throws ArithmeticException {

		ThrowsKeyword obj = new ThrowsKeyword();
		obj.sum();
	}
	
	//public void sum(){
		//try{div();}catch(ArithmeticException e){}

	//}
	
	public void sum() throws ArithmeticException {//sum is the calling method
		div();
	}
	
	public void div() throws ArithmeticException{//div is the called method
		int i = 9/0;//exception line
	}

}
