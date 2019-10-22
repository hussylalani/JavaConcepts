package Questions;

public class PrimeNumber {

	
	public static boolean isPrimeNumber(int num) {
		
		//edge/corner cases:
		if(num<=1) {
			return false;
		}
		
		for(int i=2; i<num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	//how many prime numbers are there between 1 to 20 
	public static void getPrimeNumbers(int num) {
		for(int i=2; i<=num; i++) {
			if(isPrimeNumber(i)) {
				System.out.println(i + "");
			}
		}
	}
	
	
	public static void main(String[] args) {

		System.out.println(isPrimeNumber(18));
		getPrimeNumbers(20);
	}

}
