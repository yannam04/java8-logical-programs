package com.oppconcepts;

class Light{
	boolean isOn;
	void turnOn() {
		isOn=true;
		System.out.println("the lamp is on?::"+isOn);
		
	}
	void turnOff() {
		isOn=false;
		System.out.println("the lamp is on? ::" +isOn);
	}

}
public class Lamp extends Light{
	public static void main(String[] args) {
		Light l=new Light();
		l.turnOn();;
		l.turnOff();
		
		
	}
}
