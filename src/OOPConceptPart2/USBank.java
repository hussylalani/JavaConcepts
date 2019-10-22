package OOPConceptPart2;

public interface USBank {

	int min_bal = 100;//we cannot change the value of this interface variable in other class
	
	//interface cannot have method body
	//only method declaration
	//we can declare variables and they are by default static by nature
	//variable value will not be changed
	//no static method in interface
	//no main method in interface
	//we cannot created the object of interface or cannot be instantiate 
	//interface is abstract in nature
	public void credit();
	public void debit();
	public void transfermoney();
	
}
