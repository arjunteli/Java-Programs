package com.kn.polymorphism.runtime3;

public class Demo {
	public static void main(String[] args) {

		SoftwareEngineer se = new SoftwareEngineer();
		doActivity(se);
		se = new BackendEngineer();
		doActivity(se);
		doActivity(new DatabaseEngineer());
		doActivity(new JavaBackendEngineer());
		doActivity(new PythonBackendEngineer());
	}

	public static void doActivity(SoftwareEngineer se) {
		se.attendMeeting();
		se.doTesting();
		  if (se instanceof DatabaseEngineer) {
			se.attendMeeting();
			((DatabaseEngineer) (se)).doDatabaseProject();
			((DatabaseEngineer) (se)).learnSQL();
		} else if (se instanceof JavaBackendEngineer) {
			System.out.println("JAVA Backend Class");
			((JavaBackendEngineer) se).doBackendProject();
			((JavaBackendEngineer) se).learnJava();
		} else if (se instanceof PythonBackendEngineer) {
			((PythonBackendEngineer) se).doBackendProject();
			((PythonBackendEngineer) se).learnPython();
		}else if (se instanceof BackendEngineer) {
			System.out.println("Backend Engineer Class");
			se.attendMeeting();
			((BackendEngineer) se).doBackendProject();
		} 
		System.out.println("----------------------------------------------------");
	}
}
