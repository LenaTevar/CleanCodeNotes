package comments;

public class NeverCommentLikeThis {
	/**
	 * A variable that we are going to use 
	 * */	 
	private int someVariableYouAreUsing = -1;

	/**
	 * The random class we are using in this example
	 * */
	private DummyClass someRandomClassDeclaration = new DummyClass();
	
	/**
	 * Sets the some variable we are using to a
	 * */
	public void setSomeVariableYouAreUsing(int a) {
		this.someVariableYouAreUsing = a;
	}
	
	/**
	 * Method that returns some variable we are using
	 * */
	public int getSomeVariableYouAreUsing() {
		return someVariableYouAreUsing;
	}
	
	/**
	 * Sets some random class declaration to dummy and this
	 * is painful to write
	 * */
	public void setSomeRandomClassDeclaration(DummyClass dummy) {
		this.someRandomClassDeclaration = dummy;
	}
	
	/**
	 * Gets some random class
	 * @return random class
	 * */
	
	public DummyClass getSomeRandomClassDeclaration() {
		return someRandomClassDeclaration;
	}
}


/*
 * This type of comments only fill the page with useless stuff.
 * Stuff like:
 * 
 * method returnDay returns the day
 * @return day
 * 
 * is absolutely ridiculous  
 * 
 * */