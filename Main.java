package com.oppconcepts;
class Animal{
	String name;
	public void eat() {
		System.out.println("i am eating");
	}
}
class Dog extends Animal{
	public void display() {
		System.out.println("my name is::"+name);
		
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog=new Dog();
		dog.name="puppy";
		dog.display();
		dog.eat();

	}

}
