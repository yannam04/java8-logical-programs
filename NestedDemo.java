package com.oppconcepts;
class CPU{
	double price;
	class Proceser{
		double cores;
		String manufacturer;
		double getCache(){
			return 4.3;
			
		}
	}
	protected class RAM{
		double memory;
		String manufacturer;
		double getClockspeed() {
			return 5.5;
		}
	}
}

public class NestedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 CPU cpu = new CPU();
		 CPU.Proceser proceser=cpu.new Proceser();
		 CPU.RAM ram=cpu.new RAM();
		 System.out.println("Processor Cache = " + proceser.getCache());
	        System.out.println("Ram Clock speed = " + ram.getClockspeed());
		 
		 
		 
		 
	}

}
