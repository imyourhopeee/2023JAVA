class Animal{
	String name;
	public Animal(String name) {this.name=name;}
	public void sleep() {System.out.println(name + " is sleeping");}
}
class Dog extends Animal{
	public Dog(String name) {super(name);}
	public void bark() {System.out.println("멍멍");}
}
class Cat extends Animal{
	public Cat(String name) {super(name);}
	public void bark() {System.out.println("야옹");}
}
public class Ani {
	public static void main(String[] args) {
		Dog dog=new Dog("Luke");
		Cat cat=new Cat("Goyang");
		
		dog.sleep();
		cat.sleep();
		cat.bark();
		
		
	}

}
