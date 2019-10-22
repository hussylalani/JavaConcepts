package javaBasics;

public class StringManipulation {

	public static void main(String[] args) {

		String str = "The rains have started coming";
		String str1 = "The rains Have started coming";
		
		System.out.println(str.length());
		System.out.println(str.charAt(5));
		System.out.println(str.indexOf('s'));
		System.out.println(str.indexOf('s',(str.indexOf('s')+1)));
		System.out.println(str.indexOf("have"));
		System.out.println(str.indexOf("hello"));//-1 bcz not available in string
		
		//string comparison 
		System.out.println(str.equals(str1));//false bcz H is capital in str1. Java is case sensitive
		System.out.println(str.equalsIgnoreCase(str1));//true
		
		//substring
		System.out.println(str.substring(0, 9));
		
		//trim -- removing space
		String s = "  Name  is    ";
		System.out.println(s.trim());//it only removes spaces at start and end
		System.out.println(s.replace(" ", ""));//it removes all the spaces
		
		String date = "01-01-3018";
		System.out.println(date.replace("-", "/"));
		
		//split
		String test = "My_Name_is_Anthony_Gonsalves";
		String tst[] = test.split("_");//splitting a string always returns an array
		for(int i=0; i<tst.length; i++) {
			
			System.out.println(tst[i]);
		}
	}
	
	

}
