package com.oppconcepts;
abstract class Animals1{
	abstract void makeSound();
	public void display() {
		System.out.println("i can see");
	}
	
}

class Cat extends Animals1{

	public void makeSound() {
		//super();
		System.out.println("mew mew");
	}
}

class AbstractExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat=new Cat();
		
	
		cat.makeSound();
	
		cat.display();

	}

}
