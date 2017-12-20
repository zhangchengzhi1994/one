package Clazz;

public class test {
	public static void main(String[] args) {
		Dog d = new Dog();  
		Class<Dog> clazz = (Class<Dog>) d.getClass();
	}
}
