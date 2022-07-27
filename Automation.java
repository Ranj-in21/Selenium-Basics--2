package javaAssignment.week3.OOPS;

public class Automation extends MultipleLanguage implements Language, TestTool {

	public static void main(String[] args) {
		
		Automation execution = new Automation();
		execution.ruby();
		execution.Java();
		execution.Selenium();
		execution.python();
			
	}

	public void Selenium() {
		System.out.println("Interface: Selenium");
		
	}

	public void Java() {
		System.out.println("Interface: Java");
		
	}

	@Override
	void ruby() {
		System.out.println("Unimplemented method: Ruby");
		
	}

}
