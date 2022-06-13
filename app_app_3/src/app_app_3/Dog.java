package app_app_3;

public class Dog extends Animal{
	public void sound() {
		System.out.println("The dog sound: woo woo");
	}
	public static void main(String[] args) {
		Animal a1 = new Animal();
		Animal a2 = new Dog();
		Animal a3 = new Pig();
		
		a1.sound();
		a2.sound();
		a3.sound();
	}
}
