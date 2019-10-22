package Questions;

public class Factorial {

	
	
	//non recursive method
	public static int fact(int num) {
		
		int f = 1;
		for(int i=1; i<=num; i++) {
			f = f*1;
		}
		return f;
	}
	
	//with recursive method -- a function is calling itself
	public static int fact1(int num) {
		if(num==0)
			return 1;
		else
			return(num * fact1(num-1));
	}
	
	
	
	public static void main(String[] args) {

		System.out.println(fact(4));
		
	}

}
