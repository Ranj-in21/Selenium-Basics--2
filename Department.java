package org.Department;

import org.College.College;

public class Department extends College {
	
	protected void departmentName() {
		
		String[] dept = {"BioTechnology", "CSE", "ECE", "EEE", "Civil", "E&I", "Mechanical"};
			System.out.println("Departments: ");
			for (int i = 0; i < dept.length; i++) {
				System.out.print(dept[i] +" ");
			
		}
		

	}
	public static void main(String[] args) {
		Department dept = new Department();
		dept.departmentName();
		
	}

}
