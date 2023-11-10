package com.kn.abstraction;

abstract public class Program {
	//static variable 
	static int i ;
	
	//instance variable 
	int j ;
	
	//static block 
	static {
		i = 10;
		System.out.println("Static block");		
	}
	//Instance block 
	{
		j=9;
		System.out.println("Instatnce Block");
	}
	//Static Method
	public static void m1() {
		System.out.println("Static Method");
	}
	//Instance Method
	public void m2() {
		System.out.println("Instance Method");
	}
	//Abstract Method
	public abstract void m3();
	//Final Method
	public final void m4() {
		System.out.println("Final Method");
	}
	
	
	
	
	public Program() {
		super();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
