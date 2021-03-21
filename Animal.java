/**
 * this is an abstract class which is inherited in AnimalCategory Class.
 * In this we make abstract getter & setter function of protected variable
 * @author yash.porwal_metacube
 *
 */
public abstract class Animal {

	protected int id;
	protected String animalName;
	protected String animalCategory;
	protected String animalType;
	protected String name;
	protected double weight;
	protected double age;
	protected String animalSound;
	
	
	        ///// Getters Function //////
	/**
	 * getter of animal id 
	 * @return the id of animal in integer
	 */
	 abstract int getId();
	
	/**
	 * getter of animal Sound variable
	 * @return the sound of animal in String
	 */
	abstract String getSound();
	
	/**
	 * getter of animal name variable 
	 * @return the name of the animal in String
	 */
	abstract String getAnimalName();
	
	/**
	 * getter of animal category variable
	 * @return the category of the animal in String 
	 */
	abstract String getAnimalCategory();
	
	/**
	 * getter of animal type variable 
	 * @return the type of animal in String
	 */
	abstract String getAnimalType();
	
	/**
	 * getter of name of specific animal like Mighty Elephant Ramu, etc.
	 * @return the name of a animal 
	 */
	abstract String getName();
	
	
	
	///// Setters Function /////
	/**
	 * setter function of Name variable of animal
	 * @param nameInp takes an String
	 */
	abstract void setName(String nameInp); 
	
	/**
	 * setter function of Age variable of animal
	 * @param age takes an double
	 */
	abstract void setAge(double age);
	
	/**
	 * setter function of Sound variable of animal 
	 * @param weight takes in double
	 */
	abstract void setWeight(double weight); 
	
	/**
	 * setter function of Sound variable of animal
	 * @param animalId takes integer and set Id
	 */
	abstract void setId(int animalId);
	
	/**
	 * setter function of Sound variable of animal
	 * @param sound takes it from user as String
	 */
	abstract void setSound(String sound);

}
