package com.kn.arrayobject;

public class StudentDemo {
	public static void main(String[] args) {
		Student s1 = new Student(01,"Amit", 83);
		Student s2 = new Student(02,new String("Ankur"), 29);
		Student s3 = new Student(03,"Aakash", 90);
		Student s4 = new Student(04,"Amol", 36);
		Student s5 = new Student(05,"Ranveer", 100);
		Student s6 = new Student(06,"VIRAT", 42);
		Student srr[] = {s1,s2,s3,s4,s5,s6,};
		
		for(Student i:srr) {
			if(i.name.equalsIgnoreCase("ankur")) {
				System.out.println("ID = "+i.id + " , Name = "+ i.name+" , Marks = "+i.marks);
			}
		}
		System.out.println("\n******************************");
		
		for(Student i :srr) {
			if(i.marks <35) {
				System.out.println(i.name + "\n\tExisting Marks = " + i.marks);
				i.marks = 35;
				
				System.out.println("\tAfter Grace\n\tUpgraded Marks = "+i.marks);
			}
			
		}
		System.out.println("\n\n\n********************\nAscending Order\n ");
		
		for(int i = 0; i<srr.length;i++) {
			boolean bl = true;
			for(int j = 0; j<srr.length-i-1; j++) {
				if(srr[j].marks > srr[j+1].marks) {
					bl = false;
					Student temp = srr[j];
					srr[j] = srr[j+1];
					srr[j+1] = temp;
				}
				
			}
			if(bl) {
				break;
			}
		}
		
		
		for(Student i:srr) {
			
				System.out.println("\t\tID = "+i.id + " , Name = "+ i.name+" , Marks = "+i.marks);
			
		}
		
	}
}	
