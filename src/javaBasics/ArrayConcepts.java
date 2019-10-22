package javaBasics;

public class ArrayConcepts {

	public static void main(String[] args) {

		
		//Array: to store similar data type values in a array variable
		
	//one dimensional array
		//disadvantage of one dimensional array
			//size is fixed -- to overcome this problem we use Collections: ArrayList, HashTable -- dynamic array 
			// stores only similar data type -- to overcome this problem we use Object Array.
		//int array
		int i[] = new int[4];
		i[0] = 10; 
		i[1] = 20;
		i[2] = 30; 
		i[3] = 40;
		
		for(int j=0; j<i.length;j++) {
			System.out.println(i[j]);
		}
		
		System.out.println(i[4]);//ArrayIndexOutOfBoundsException error will be encountered
		
		
		
	//Object array (Object is a super class). It is used to store different data types values
		Object ob[] = new Object[6];
		ob[0] = "Tom";
		ob[1] = 25;
		ob[2] = 12.33;
		ob[3] = "1/1/1990";
		ob[4] = 'M';
		ob[5] = "London";
		
	}

}
