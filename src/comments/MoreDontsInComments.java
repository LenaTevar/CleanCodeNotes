package comments;

public class MoreDontsInComments {
	/**
	 * Method that return if an integer is even 
	 * a module is one of the fundamental algebraic structures 
	 * used in abstract algebra. A module over a ring is a 
	 * generalization of the notion of vector space over a field,
	 * wherein the corresponding scalars are the elements of an 
	 * arbitrary given ring (with identity) and a multiplication
	 * (on the left and/or on the right) is defined between 
	 * elements of the ring and elements of the module.
	 * 
	 * In a vector space, the set of scalars is a field and acts on 
	 * the vectors by scalar multiplication, subject to certain 
	 * axioms such as the distributive law. In a module, the 
	 * scalars need only be a ring, so the module concept represents 
	 * a significant generalization. In commutative algebra, both 
	 * ideals and quotient rings are modules, so that many arguments 
	 * about ideals or quotient rings can be combined into a single 
	 * argument about modules. In non-commutative algebra the 
	 * distinction between left ideals, ideals, and modules becomes 
	 * more pronounced, though some ring-theoretic conditions can be 
	 * expressed either about left ideals or left modules.
	 * */
	public boolean isEven(int a) {
		return a % 2 == 0;
	}

}
