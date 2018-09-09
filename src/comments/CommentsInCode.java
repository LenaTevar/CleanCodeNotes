package comments;

public class CommentsInCode {
	int iceCream = 0;
	int people = 10;
	DummyClass classExample = new DummyClass();
	
	public void iceCreamChecker() {
		//if there is not enough ice cream, class example buys more. 
		if(iceCream < people) {
			classExample.buyMore();
		}
	}
	
	public void iceCreamChecker2() {
		if(notEnoughIceCream()) { //<--- obvious meaning
			classExample.buyMore();
		}
	}

	public boolean notEnoughIceCream() {
		return iceCream < people;
	}
}
