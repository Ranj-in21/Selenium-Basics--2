package org.System;

public class Desktop extends Computer {
	
		public void desktopSize() {
		
		String size = "1920 x 1080";
		System.out.println("Desktop size: " +size);		

	}
	
	public void desktopMemory() {
		
		String memo = "8GB";
		System.out.println("Memory: " +memo);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("This is Single Inheritance");
		System.out.println("Windows: " +windows);
		Desktop obj = new Desktop();
		obj.computerModel();
		obj.computerProcessor();
		obj.desktopMemory();
		obj.desktopSize();
	
	}

}
