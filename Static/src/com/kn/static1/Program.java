package com.kn.static1;

public class Program {
	static int x,y;
	static {
		x =10;y=20;
		System.out.println("Static Block\n********************");
	}
	public static void display1() {
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		System.out.println("Static Method\n******************");
	}
	
	int a,b;
	{
		a=10;b=20;
		System.out.println("Instance Block\n*****************");
	}
	public void display2() {
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("Instance Method\n****************");
	}
	public Program() {
		super();
		System.out.println("Constructor\n****************");
	}
	
}
