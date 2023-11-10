package com.kn.encapsulation2;


public class DogDemo {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter the number of DOGS = ");
//		int num = sc.nextInt();
//		Dog.createDogObjects(num);
		
		
		
		
		
		
		
		
		
		
		Dog obj1 = new Dog("Sheru", "White", 5, "Lebrador");
		System.out.println("Dog 1 ");
		System.out.println("\tName = "+ obj1.getName());
		System.out.println("\tColor = "+ obj1.getColor());
		System.out.println("\tAge = "+ obj1.getAge());
		System.out.println("\tBreed = "+ obj1.getBreed());
		
		Dog obj2 = new Dog("Zoe", "White", 2, "Lebrador");
		System.out.println("Dog 2 ");
		System.out.println("\tName = "+ obj2.getName());
		System.out.println("\tColor = "+ obj2.getColor());
		System.out.println("\tAge = "+ obj2.getAge());
		System.out.println("\tBreed = "+ obj2.getBreed());
		
		Dog obj3 = new Dog("Goldy", "Golden", 4, "Golden Retriver");
		System.out.println("Dog 3 ");
		System.out.println("\tName = "+ obj3.getName());
		System.out.println("\tColor = "+ obj3.getColor());
		System.out.println("\tAge = "+ obj3.getAge());
		System.out.println("\tBreed = "+ obj3.getBreed());
	}

}
