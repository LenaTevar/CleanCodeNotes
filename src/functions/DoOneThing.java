package functions;

import java.util.ArrayList;
import java.util.List;

public class DoOneThing {
	/*Functions should do one thing. They should do it well. They should do it only.
	 * if statements, else statements, while statements and so on should be one line long.
	 * A long de4scriptive name is better than a short enigmatic name.
	 * 
	 * */
	
	class Book{
		String name;
	}
	
	class Library{
		List <Book> catalogue = new ArrayList<Book>();
		
		public void addBook(Book book) { //<--- only adds books
			if(notRegistered(book)) {
				catalogue.add(book);
			}
				
		}
		
		public boolean notRegistered(Book book) { //<--- only checks registered books
			if (catalogue.contains(book))
				return false;
			return true;				
		}
	}
	
	public void doSomething(int foo) {System.out.println("never ever do this " + foo + "this is horrible" );
	if(foo>4) {System.out.println("why, god, why");} else if(foo>10) {System.out.println("Always indent!");}}
	
	/*Don't pass booleans to methods that not are clear, it's confusing. */
	public void render(boolean bool) {
		System.out.println("something");
	}
	
	public void renderForTest(boolean bool) {
		System.out.println("Clearer");
	}
}