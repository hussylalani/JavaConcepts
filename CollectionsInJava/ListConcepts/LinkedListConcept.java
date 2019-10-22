package ListConcepts;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {

		
		LinkedList<String> ll = new LinkedList<String>();
		
		//add
		ll.add("test");
		ll.add("qtp");
		ll.add("selenium");
		ll.add("RPA");
		ll.add("RFT");
		
		//print
		System.out.println("content of LinkedList: " + ll);
		
		//add in first position/index
		ll.addFirst("Hussain");
		//add in last position/index
		ll.addLast("Lalani");
		
		System.out.println("content of LinkedList: " + ll);
		
		//get
		System.out.println(ll.get(0));
		
		//set: it changes the value on the set index
		ll.set(0, "hussy");
		System.out.println(ll.get(0));
		
		//remove
		ll.removeFirst();
		ll.removeLast();
		
		System.out.println("content of LinkedList: " + ll);
		
		//remove specific position
		ll.remove(2);
		System.out.println("content of LinkedList: " + ll);
		
		//how to iterate: to print all the values of linkedlist: for loop, advance for loop, iterator, while loop
		//for loop
		for(int n=0; n<ll.size();n++) {
		System.out.println(ll.get(n));
		}
		
		//advance for loop
		for(String str : ll) {//"String str" is string of all the linked list object. Whatever strings are available in this particular "ll" please iterate and print one by one
			System.out.println(str);
		}
		
		//iterator
		Iterator<String> it = ll.iterator(); 
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//while loop
		int num = 0;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
		}
	}

}
