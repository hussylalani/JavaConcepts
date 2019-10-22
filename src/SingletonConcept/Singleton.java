package SingletonConcept;

public class Singleton {
	
	//In OOP, singleton is a class that can only have one object/instance of the class at a time.
	//Way to design singleton class:
	//1. make constructor as private
	//2. write a public static method(getInstance) that has a return type object of this singleton class (Lazy initialization)
	//difference between normal class and singleton class:
		//we use constructor for normal class whereas for singleton we use getInstance() method to instantiate
	
	private static Singleton singleton_instance = null;
	public String str;
	
	private Singleton() {
		str = "This is singleton concept";
	}
	
	public static Singleton getInstance() {
		if(singleton_instance==null)
			singleton_instance = new Singleton();
		return singleton_instance;
	}
	

	public static void main(String[] args) {

		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		Singleton z = Singleton.getInstance();
		
		x.str = (x.str).toUpperCase();
		System.out.println(x.str);
		
		System.out.println(y.str);
		System.out.println(z.str);
		
		
		
	}

}
