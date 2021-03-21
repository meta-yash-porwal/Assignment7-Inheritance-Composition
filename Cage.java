import java.util.ArrayList;

/**
 * this Cage class is used to add animal in cage of same type
 * Each cage will specify the type of animals that can be added to the cage
 * Have a limit on the number of animals that can be added to the cage.
 * We assume that Maximum Capacity of Animals in the cage is 3.
 * @author yash.porwal_metacube
 *
 */
public class Cage {
	private final int MAX_CAP = 3;
	String type;
	private ArrayList<Animal> animals = new ArrayList<>();
	
	
	/**
	 * setter of animal type
	 * @param animalType as an String
	 */
	void setType(String animalType){
		type = animalType;
	}
	
	///// Getter Function /////
	/**
	 * getter of animal type
	 * @return type of String
	 */
	String getType(){
		return type;
		
	}
	
	/**
	 * getter of Maximum Capacity of Cage 
	 * @return Maximum capacity as an integer
	 */
	int getCap(){
		return MAX_CAP;
	}
	
	/**
	 * getter of current capacity of cage
	 * @return the current capacity as an integer
	 */
	int getCurrentCap(){
		return animals.size();
	}
	
	/**
	 * getter function to get list of all animals
	 * @return animals of arrayList
	 */
	ArrayList<Animal> getAnimals(){
		return animals;
	}
	
	/**
	 * takes an animal as an argument and add to the cage
	 * @param animal object of Animal class
	 */
	public void addAnimal(Animal animal) {
		setType(animal.getAnimalType());
		animals.add(animal);
		
	}

	/**
	 * show all the animals present in the cage
	 */
	public void showAnimals() {
		System.out.println("ID\tName\tSound");
		for(Animal animal:animals){
			System.out.println(animal.getId()+"\t"+animal.getName()+"\t"+animal.getSound());
		}
		
	}

}