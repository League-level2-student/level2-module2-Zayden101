package _04_animals_inheritance;

public class Animal {

		String name;
	String color;
	boolean isGirl;

	
	public Animal(String name, String color, boolean isGirl) {
		
this.name=name;
this.color=color;
this.isGirl=isGirl;

	}
	
	
	public void printName() {
		System.out.println("My name is "+name);
	}
	
	public void eat() {
		System.out.println("I am Eating");
	}
	
	public void sleep() {
		System.out.println("I am Sleeping");
	}
	
	public void play() {
		System.out.println("I am Playing");
	}
	
	
	
}
