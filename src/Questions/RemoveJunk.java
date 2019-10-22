package Questions;

public class RemoveJunk {

	public static void main(String[] args) {

		String s = "131313 ---- $$$$$ sfasfklaf";
		
		//Regular expression: ^ <-- this symbol denotes 'not'. [^a-zA-Z0-9] <-- this means apart from a to z and 0 to 9 remove other characters
		s = s.replaceAll("[^ a-zA-Z0-9]", "");
		System.out.println(s);
		
	}

}
