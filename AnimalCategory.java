/**
 * this class is for Animal Category
 * Inherit Animal class
 * @author yash.porwal_metacube
 *
 */
public abstract class AnimalCategory extends Animal{
	
	/**
	 * constructor which set the animal category 
	 * @param type is the string which then set to animal category
	 */
	AnimalCategory(String type) {
		animalCategory = type;
	}
}
