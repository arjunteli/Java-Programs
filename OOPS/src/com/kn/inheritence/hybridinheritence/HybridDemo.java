package com.kn.inheritence.hybridinheritence;

public class HybridDemo {
	public static void main(String[] args) {
		EngineeringStudent engineer = new EngineeringStudent();
		engineer.name = "Engineer Visvesvriya";
		System.out.println(engineer.name );
		MedicalStudent doctor = new MedicalStudent();
		doctor.name = "Doctor Aman Jha";
		System.out.println(doctor.name );
		JavaTrainer javaTrainer = new JavaTrainer();
		javaTrainer.name = "Arun Sir";
		System.out.println(javaTrainer.name );
		SQLTrainer sqlTrainer = new SQLTrainer();
		sqlTrainer.name = "SQL Arun Sir";
		System.out.println(sqlTrainer.name );
		
		
		
		
	}
}
