package com.oppconcepts;
interface Language{
	void getName(String name);
}
class ProgrammingLanguge implements Language{
	public void getName(String name) {
		System.out.println("the language is::"+name);
		
	}
}

public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProgrammingLanguge language=new ProgrammingLanguge();
		language.getName("python");
	}

}
