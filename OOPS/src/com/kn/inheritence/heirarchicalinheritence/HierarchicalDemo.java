package com.kn.inheritence.heirarchicalinheritence;

public class HierarchicalDemo {

	public static void main(String[] args) {
		Developer developer = new Developer();
		developer.salary = 9986789;
		developer.name = "Arjun Teli";
		System.out.println("Developer\n\tName = "+ developer.name+"\n\tSalary = "+developer.salary+"\n");
		
		TestEngineer tester = new TestEngineer();
		tester.name="Nishchita";
		tester.salary = 678934;
		System.out.println("Test Engineer\n\tName = "+ tester.name+"\n\tSalary = "+tester.salary+"\n");
		
		Manager manager = new Manager();
		manager.name = "Arun Kumar";
		manager.salary = 9999780;
		System.out.println("Manager\n\tName = "+ manager.name+"\n\tSalary = "+manager.salary+"\n");
		
		TeamLead teamLead = new TeamLead();
		teamLead.name = "Monica";
		teamLead.salary= 56787;
		System.out.println("Team Lead\n\tName = "+ teamLead.name+"\n\tSalary = "+teamLead.salary+"\n");
		
	}

}
