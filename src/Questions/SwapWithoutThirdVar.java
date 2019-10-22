package Questions;

public class SwapWithoutThirdVar {

	public static void main(String[] args) {

		int x = 44;
		int y = 456;
		
		x = x+y;
		y= x-y;
		x= x-y;
		
		x = x*y;
		y = x/y;
		x = x/y;
		
		//using XOR ^ --- it means bitwise conversion --binary answer
		x = x ^ y;
		y = x ^ y;
		x = x ^ y;
		
		System.out.println(x);
		System.out.println(y);
		
		
		
	}

}
