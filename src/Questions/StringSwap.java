package Questions;

public class StringSwap {

	public static void main(String[] args) {

		String a = "Hello";
		String b = "world";
		
		//append a and b:
		a = a+b;
		
		//store initial string a in b:
		b = a.substring(0,a.length()-b.length());
		
		//store initial string b in a
		a = a.substring(b.length());
		
		System.out.println(a);
		System.out.println(b);
		
	}

}
