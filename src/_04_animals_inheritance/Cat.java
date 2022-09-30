package _04_animals_inheritance;

public class Cat extends Animal{

	public Cat(String name, String color, boolean isGirl) {
		super(name, color, isGirl);
		
		
	}

	
	public void eat() {
		System.out.println("I am not Eating");
	}
	
	
	
}
