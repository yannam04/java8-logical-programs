package com.oppconcepts;

public class Complex {
	private int a,b;
	private Complex(int i,int j) {
		this.a=i;
		this.b=j;
		}
	private Complex(int i) {
		this(i,i);
	}
	private Complex() {
		this(0);
	}
	

	@Override
	public String toString() {
		return this.a+"  + " +this.b + "i";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex c1=new Complex(2,7);
		Complex c2=new Complex(5);
		Complex c3=new Complex();
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

	}

}
