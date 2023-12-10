package com.kn.sortingcollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeDemo {

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1, "Yudhishthir", 250000.78));
		list.add(new Employee(2, "Karan", 2270000.78));
		list.add(new Employee(5, "Nakul", 250700.78));
		list.add(new Employee(3, "Bheem", 350000.78));
		list.add(new Employee(4, "ARJUN", 450000.78));
		list.add(new Employee(6, "Sahdev", 357800.78));

		System.out.println(sortByIdAscending(list));
		System.out.println("******************************************");
		System.out.println(sortByNameAscending(list));
		System.out.println("******************************************");
		System.out.println(sortBySalaryAscending(list));
		System.out.println("******************************************");
		System.out.println(sortByIdDescending(list));
		System.out.println("******************************************");
		System.out.println(sortByNameDescending(list));
		System.out.println("******************************************");
		System.out.println(sortBySalaryDescending(list));
		System.out.println("******************************************");
	}

	// Sorting by Id Ascending
	public static ArrayList<Employee> sortByIdAscending(ArrayList<Employee> list) {
		Collections.sort(list, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				if (o1.getEmployeeId() > o2.getEmployeeId()) {
					return 1; // for descending return -1;
				} else if (o1.getEmployeeId() < o2.getEmployeeId()) {
					return -1; // for descending return +1 here ;
				} else {
					return 0;
				}
			}
		});
		return list;
	}

	// Sorting by Id Descending
	public static ArrayList<Employee> sortByIdDescending(ArrayList<Employee> list) {
		Collections.sort(list, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				if (o1.getEmployeeId() > o2.getEmployeeId()) {
					return -1;
				} else if (o1.getEmployeeId() < o2.getEmployeeId()) {
					return 1;
				} else {
					return 0;
				}
			}
		});
		return list;
	}

	// Sorting by Name Ascending
	public static ArrayList<Employee> sortByNameAscending(ArrayList<Employee> list) {
		Collections.sort(list, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getEmployeeName().compareTo(o2.getEmployeeName());
			}
		});
		return list;
	}

	// Sorting by Name Descending
	public static ArrayList<Employee> sortByNameDescending(ArrayList<Employee> list) {
		Collections.sort(list, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return -(o1.getEmployeeName().compareTo(o2.getEmployeeName()));
			}
		});
		return list;
	}

	// Sorting By Salary Ascending
	public static ArrayList<Employee> sortBySalaryAscending(ArrayList<Employee> list) {
		Collections.sort(list, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				if (o1.getEmployeeSalary() > o2.getEmployeeSalary()) {
					return 1; // for descending return -1;
				} else if (o1.getEmployeeSalary() < o2.getEmployeeSalary()) {
					return -1; // for descending return +1 here ;
				} else {
					return 0;
				}
			}
		});
		return list;
	}

	// Sorting By Salary Descending
	public static ArrayList<Employee> sortBySalaryDescending(ArrayList<Employee> list) {
		Collections.sort(list, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				if (o1.getEmployeeSalary() > o2.getEmployeeSalary()) {
					return -1; // for descending return -1;
				} else if (o1.getEmployeeSalary() < o2.getEmployeeSalary()) {
					return 1; // for descending return +1 here ;
				} else {
					return 0;
				}
			}
		});
		return list;
	}

}
