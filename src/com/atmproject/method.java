package com.atmproject;

public class method {
	public void add() {
		byte a=35;
		byte b=48;
		byte c= (byte) (a+b);
		System.out.println(c);
	}
public void add(float a) {
System.out.println(a);
}	

public static void main(String[] args) {
	method s=new method();
	s.add();
	s.add(10);
}
}
