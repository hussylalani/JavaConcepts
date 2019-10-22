package Questions;

public class ReverseString {

	public static void main(String[] args) {

		String s = "Selenium";
		
		int len = s.length();
		String rev = "";
		
		for(int i = len-1; i>=0; i--) {
			
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
		
		//using StringBuffer class which is available in java; StringBuffer is mutuable class but String is immutable
		StringBuffer sf = new StringBuffer(s);
		System.out.println(sf.reverse());
		
		
	}

}
