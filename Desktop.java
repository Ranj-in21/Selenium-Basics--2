package org.System;

public class Desktop extends Computer{

	
	public void desktopMemory(String model) {
		
		
		System.out.println("Memory: " +model +"GB");
	}
	
	public void dektopSize(String model) {
		
		System.out.println("Desktop Size: " +model);

	}
	

public void computerProcessor(String model) {
	
		//System.out.println("This is overriding");
		
		System.out.println("Processor: " +model);
		

	}
	
	public void computerModel(String model) {
		
	//	System.out.println("This is overriding");
		
		 System.out.println("Model: " +model);
		 
	

	}
	


	
	public static void main(String[] args) {
		
		Desktop obj = new Desktop();
		obj.computerModel("Latitude E7474");
		obj.computerProcessor("Intel Core i7");
		obj.dektopSize("1920 x 1080");
		obj.desktopMemory("8");
		
		

	}

}
