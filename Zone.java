import java.util.ArrayList;

/**
 * Zone class is used to add animal in the cage of a particular category 
 * Will have multiple zones and each zone would support animals 
 * from a single category like mammal, reptile or bird. 
 * There could be multiple zones for the same category. 
 * Each zone will have cages for animals.
 * Each zone has a limit on the number of cages that can be added to the zone
 * In a Zone we assume that maximum capacity of Cage is 3.
 * @author yash.porwal_metacube
 *
 */
public class Zone {
	private final int MAX_CAGE = 3;
	String category;
	boolean hasPark;
	boolean hasCanteen;
	private ArrayList<Cage> cages = new ArrayList<>();
	

	/**
	 * setter function to set the category variable
	 * @param cat as a String
	 */
	void setCategory(String cat){
		category  = cat;
	}
	
	/**
	 * getter function of category variable
	 * @return category as a String
	 */
	String getCategory(){
		return category;
	}
	
	/**
	 * getter function of cages
	 * @return cages in ArrayList
	 */
	ArrayList<Cage> getCages(){
		return cages;
	}
	
	/**
	 * takes animal object as an argument and add to the specific type of cage 
	 * will assign new cage if cage is Full
	 * @param animal
	 * @return boolean - true(animal added), false(animal not added) in the cage.
	 */
	boolean addAnimal(Animal animal){
		if(cages.size()==MAX_CAGE){
			return false;
		}
		boolean animalAdded = false;
		for(Cage cage:cages){

			if(cage.getCurrentCap() < cage.getCap() && 
				cage.getType().equals(animal.getAnimalType())){
				
				
				cage.addAnimal(animal);
				animalAdded = true;
				break;
			}
		}
		if(!animalAdded){

			Cage cage = new Cage();
			cage.addAnimal(animal);
			cages.add(cage);
		}
		return true;
	}

	/**
	 * display all the cages in the zone
	 */
	public void dispayCages() {
		for(Cage cage:cages){
			System.out.println("CAGE :"+cage.getType()+" ");
			cage.showAnimals();
		}
		
	}
}