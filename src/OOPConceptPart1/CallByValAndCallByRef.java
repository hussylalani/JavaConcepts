package OOPConceptPart1;

public class CallByValAndCallByRef {
	
	int p;
	int q;

	public static void main(String[] args) {
		
		CallByValAndCallByRef obj = new CallByValAndCallByRef();
		int x = 10;
		int y = 20;
		obj.testsum(x, y);//call by value or pass by value // the copy of x and y is given to a and b, not the original value
		
		//call by ref
		obj.p = 50;
		obj.q = 60;
		
		obj.swap(obj);
		System.out.println(obj.p);
		System.out.println(obj.q);
	}

	public int testsum(int a, int b) {
		int c = a + b;
		return c;
	}
	
	//call by reference // it means we are passing the value of object reference
	public void swap(CallByValAndCallByRef t) {
		int temp;
		temp = t.p; //temp = 50
		t.p = t.q; // t.p = 60
		t.q = temp; //t.q = 50
	}
}
