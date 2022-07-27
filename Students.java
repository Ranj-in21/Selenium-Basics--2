package javaAssignment.week3.OOPS;

public class Students {
	
		public void getStudentsInfo(int id) {
			
			System.out.println("Student id: " +id);
			
		}
		public void getStudentsInfo(int id, String name) {
			
			System.out.println("Student id: " +id);
			System.out.println("Student Name: " +name);

		}
		public void getStudentsInfo(String email, long number) {
			
			System.out.println("Student email: " +email);
			System.out.println("Student Phone Number: " +number);			

		}
	public static void main(String[] args) {
		
			Students student = new Students();
			student.getStudentsInfo(84);
			student.getStudentsInfo(84, "Ranjini");
			student.getStudentsInfo("ranjini.1213@gmail.com", 9444324036l);
			
		

	}

}
