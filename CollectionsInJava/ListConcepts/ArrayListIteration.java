package ListConcepts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {

	public static void main(String[] args) {

		ArrayList<String> tv = new ArrayList<String>();
		
		tv.add("GOT");
		tv.add("Prison break");
		tv.add("Big bang theory");
		tv.add("Breaking bad");
		
		//1. iterating/traverse using java 8 with for each loop and lambda expression:
		tv.forEach(shows ->{//shows is representing tv object elements
			System.out.println(shows);
		});
		
		//2. using simple iterator
		Iterator<String> it = tv.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//3. using iterator and java 8 lambda and forEachRemaining() method:
		it = tv.iterator();
		it.forEachRemaining(show ->{
			System.out.println(show);
		});
		
		//4. using for each loop:
		for(String show : tv) {
			System.out.println(show);
		}
		
		//5. using for loop with order/index:
		for(int i=0; i<tv.size();i++) {
			System.out.println(tv.get(i));
		}
		
		
		//6.using a listIterator() to traverse in both the directions
		ListIterator<String> tvshows = tv.listIterator(tv.size());
		while(tvshows.hasPrevious()) {
			System.out.println(tvshows.previous());
		}
	}
}
