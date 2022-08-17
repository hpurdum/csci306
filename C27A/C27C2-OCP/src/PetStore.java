import java.util.ArrayList;

public class PetStore {
	private ArrayList<Pet> pets = new ArrayList<Pet>();
	
	public void sounds() {
		for (Pet pet : pets) {
			pet.makeSound();
		}	
		System.out.println() ;
	}
	
	public void treats() {
		for (Pet pet : pets) {
			pet.giveTreat();
		}
		System.out.println() ;
	}
	
	public void fun() {
		for (Pet pet : pets) {
			pet.haveFun();
		}	
		System.out.println() ;
	}
	
	public void addPet(Pet pet) {
		pets.add(pet) ;
	}

	public void listPets() {
		for(Pet pet : pets) {
			System.out.println(pet.name);
		}
	}
	
	public static void main(String[] args) {
		PetStore myStore = new PetStore() ;
		
		myStore.addPet(new Cat("Buttons"));
		myStore.addPet(new Dog("Boxer"));
		myStore.addPet(new Cat("Dax"));
		myStore.addPet(new Moose("Harold"));
		myStore.addPet(new Mouse("Jerry"));
		
		myStore.fun();
		myStore.treats();
		myStore.sounds();
		
	}

}
