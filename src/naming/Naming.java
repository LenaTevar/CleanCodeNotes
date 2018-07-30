package naming;

public class Naming {
	/*NOT RECOMENDED*/
	int d; 
	
	/*BETTER WAYS OF NAMING*/
	int days; 
	int daysSinceCreation; 
	
	/*
	 * This two variables can be confusing when auto completing.
	 * Pick something like above.
	 *  
	 * */
	int XYZControllerForEfficientHandlingOfStrings;
	int XYZControllerForEfficientStorageOfStrings; 
	
	/*
	 * Member prefixes are not needed. 
	 * Your classes and functions should be small enough.
	 * */
	int m_days;
	
	/*
	 * Variables are names.
	 * Methods are verbs.
	 * */
	
	int price;
	public void addTax(int price) {}
	
}
