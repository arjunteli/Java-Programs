
public class Car {
	String model;
	String com;
	String color;
	void drive() {
		System.out.println("Car is driven by MODI");
	}
	void start() {
		System.out.println("Car is started by MODI");
	}
	void get() {
		System.out.println(model);
		System.out.println(com);
		System.out.println(color);
	}
	Car (String model, String com, String color){
		this.model = model;//SHADOWING PROBLEM RESOLVE
		this.com = com;//SHADOWING PROBLEM RESOLVE
		this.color = color;//SHADOWING PROBLEM RESOLVE
	}
	Car(){
		
	}
}
