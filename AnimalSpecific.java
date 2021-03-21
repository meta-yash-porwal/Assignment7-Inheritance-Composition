/**
 * this class inherits the property of  class AnimalCategory
 * And used to override the abstract function in AnimalCategory & Animal class 
 * @author yash.porwal_metacube
 *
 */
public class AnimalSpecific extends AnimalCategory{

	/**
	 * constructor for initializing the animal category, type, name
	 * @param category  as a String of animal
	 * @param name as a String of animal
	 * @param type as a String of animal
	 */
	AnimalSpecific(String category,String name,String type){
		super(category);
		animalName = name;
		animalType = type;
	}
	
	
	///// Setters Function of class Animal /////
	
	@Override
	void setId(int animalId) {
		id = animalId;
	}

	@Override
	void setName(String nameInp) {
		name = nameInp;
	}
	
	@Override
	void setAge(double inputAge){
		age = inputAge;
	}
	
	@Override
	void setWeight(double inputWeight){
		weight = inputWeight;
	}
	
	@Override
	void setSound(String sound){
		animalSound = sound;
	}
	
	
	///// Getter Function of class Animal /////
	
	@Override
	String getName(){
		return animalName;
	}
	
	@Override
	String getAnimalCategory(){
		return animalCategory;
	}
	
	@Override
	String getAnimalType(){
		return animalType;
	}
	
	@Override
	String getAnimalName() {
		return animalName;
	}
	
	@Override
	int getId() {
		return id;
	}
	
	@Override
	String getSound() {
		return animalSound;
	}
	
}
