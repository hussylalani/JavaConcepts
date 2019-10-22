package Questions;

public class PalindromeNumber {

	public static void isPalindromeNumber(int num) {
		int r=0;
		int sum=0;
		int temp;
		
		temp=num;
		
		while(num>0) {
			r=num%10;
			sum = (sum*10) + r;
			num = num/10;
		}
		
		if(temp==sum) {
			System.out.println("it is palindrome");
		}else {
			System.out.println("it is not palindrome");
		}
	}
	
	
	
	public static void main(String[] args) {

		
		isPalindromeNumber(151);
		
	}

}
