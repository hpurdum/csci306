

abstract class Pet {
	String name;
	String sound;
	String food;
	String funActivity;

	public Pet(String name, String sound, String food, String funActivity) {
		this.name = name;
		this.sound = sound;
		this.food = food;
		this.funActivity = funActivity;
	}

	public void makeSound() {
		System.out.println(sound);
	}
	public void giveTreat() {
		System.out.println("Give " + name + " " + food);
	}

	public void haveFun() {
		System.out.println(funActivity);
	}
}
