package com.oppconcepts;

public class MethodExample {
	public int addNumber(int a,int b) {
		int sum =a+b;
		return sum;
		
	}
	public  static int sqrt(int num) {
		return num*num;
	}
	public static void main(String[] args) {
		int num1=25;
		int num2=45;
		MethodExample add=new MethodExample();
		int reuslt=add.addNumber(num1, num2);
		System.out.println("the sum is ::"+reuslt);
		int mul;
		mul=sqrt(20);
		System.out.println("square of the value  20::"+mul);
		//System.out.println("the square root of the 4 is::"+Math.m);
		

	}

}
