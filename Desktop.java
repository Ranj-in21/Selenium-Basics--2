package org.System;

public class Desktop extends Computer {
	
	int windows = 10;

	public void desktopSize() {
		
		String size = "1920 x 1080";
		System.out.println("Desktop size: " +size);		

	}
	
	public void desktopMemory() {
		
		String memo = "8GB";
		System.out.println("Memory: " +memo);
		
	}
	
	public static void main(String[] args) {
		
		Desktop obj = new Desktop();
		System.out.println("This is Inheritance");
		obj.computerModel();
		obj.computerProcessor();
		obj.desktopMemory();
		obj.desktopSize();
	
	}

}
