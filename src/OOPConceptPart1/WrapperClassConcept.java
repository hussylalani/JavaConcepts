package OOPConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {

		String x = "100";
		System.out.println(x+20);
		
		//data conversion: String to int
		//method parseInt in class Integer converts the string into int value. Integer is wrapper class
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		//Different Wrapper classes: Integer, Double, Boolean
		
		//String to Double conversion
		String y = "12.22";
		double d = Double.parseDouble(y);
		System.out.println(d+12);
		
		//String to boolean
		String a = "true";
		boolean b = Boolean.parseBoolean(a);
		System.out.println(b);
		
		//int to String conversion
		int j = 200;
		String m = String.valueOf(j);
		System.out.println(m+20);
		
		String u = "100A";
		Integer.parseInt(u);//Error: NumberFormatException -- For input string: "100A"
		
	}

}
