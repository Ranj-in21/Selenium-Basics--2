package javaAssignment.week3.OOPS;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrintDuplicates {

	public static void main(String[] args) {
		
	
		List<Integer> num = Arrays.asList(14,12,13,11,15,14,18,16,17,19,18,17,20);
			
			Collections.sort(num);	
			System.out.println("Sorted array list: " +num);
			System.out.println("The duplicates are: ");
		
		for (int i = 0; i < num.size()-1; i++) {
			
			if(num.get(i).equals(num.get(i+1))) {
				
				System.out.print(num.get(i) +",");
			}
			
		}
		
			
		
	
		
	
	
	}

}
