package org.Student;

import org.Department.Department;

public class Student extends Department {

	protected void studentName() {
		
		String name = "Ranjini";
		System.out.println("\n" +"Student Name: " +name);
		

	}
	protected void studentDept() {
		
		String dept = "ECE";
		System.out.println("Student Department: " +dept);
		
	}
	protected void studentId() {
		
		int id = 84;
		
		System.out.println("Student ID: " +id);

	}
	public static void main(String[] args) {
		
		Student obj = new Student();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		obj.departmentName();
		obj.studentName();
		obj.studentDept();
		obj.studentId();
		

	}

}
