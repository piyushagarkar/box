package com.ninescript.test.oops.demo2;


/**
 * @author Piyush
 */

class Person {
	
		String FirstName;
		String LastName;

	Person(String fName, String lName) {
			FirstName = fName;
			LastName = lName;
	}

	void Display() {
	
		System.out.println("First Name : " + FirstName);
		System.out.println("Last Name : " + LastName);
	}
}

	class Student extends Person {
		
			int id;
			String standard;
			String instructor;

	Student(String fName, String lName, int nId, String stnd, String instr) {
		
		super(fName, lName);
		id = nId;
		standard = stnd;
		instructor = instr;
	}

	void Display() {
	
		super.Display();

		System.out.println("ID : " + id);
		System.out.println("Standard : " + standard);
		System.out.println("Instructor : " + instructor);
	}
}

class Teacher extends Person {
	
	String mainSubject;
	int salary;
	String type; // Primary or Secondary School teacher

	Teacher(String fName, String lName, String sub, int slry, String sType) {
			super(fName, lName);
			mainSubject = sub;
			salary = slry;
			type = sType;
	}

	void Display() {
		
		super.Display();

		System.out.println("Main Subject : " + mainSubject);
		System.out.println("Salary : " + salary);
		System.out.println("Type : " + type);
	}
}

class InheritanceDemo {
	
	public static void main(String args[]) {
	
		Person pObj = new Person("Piyush", "Agarkar");
		Student sObj = new Student("Rohit", "Patil", 1, "1 - B", "Roma");
		Teacher tObj = new Teacher("Sham", "Deshmukha", "English", 6000, "Primary Teacher");

		System.out.println("Person :");
		pObj.Display();
		System.out.println("-------------------");

		System.out.println("Student :");
		sObj.Display();
		System.out.println("-------------------");
		System.out.println("Teacher :");
		tObj.Display();
	}
}



	


