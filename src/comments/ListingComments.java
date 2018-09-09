package comments;

import java.util.ArrayList;
import java.util.List;
/*
 * Javadocs everywhere does not help, adds nothing and create
 * potential for lies and misdirection.
 * If someone changes the code but forgets changing the javadoc, 
 * it will lead to confusion.
 * */
public class ListingComments {
	List  <CD> myPlayList = new ArrayList<CD>();
	
	/**
	 * @param title The title of the CD
	 * @param author The author of the CD
	 * @param tracks The tracks on the CD
	 * */
	public void  addCD(String title, String author, int tracks) {
		CD cd = new CD();
		cd.author= author;
		cd.title = title;
		cd.tracks = tracks;
		
		myPlayList.add(cd);
	}
	
}

class CD {
	String title;
	String author;
	int tracks;
}