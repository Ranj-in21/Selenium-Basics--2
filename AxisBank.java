package javaAssignment.week3.OOPS;

public class AxisBank extends BankInfo{
	
	public void deposit(float interest) {
		
		System.out.println("Deposit Interest: " +interest);

	}

	public static void main(String[] args) {
		
		AxisBank obj = new AxisBank();
		obj.deposit(6.5f);

	}

}
