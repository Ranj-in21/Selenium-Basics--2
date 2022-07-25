package javaAssignment.week3.OOPS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestList {

	public static void main(String[] args) {				
								
			List<Integer> largest = new ArrayList<Integer>();
				largest.add(3);
				largest.add(2);
				largest.add(11);
				largest.add(4);
				largest.add(6);
				largest.add(7);
				
				System.out.println("Given Array: " +largest);
				
			Collections.sort(largest);
				System.out.println("Sorted Array: " +largest);
				System.out.println("Index of Second largest number: " +(largest.size()-2));	
				System.out.println("Second Largest Number: " +largest.get(4));
					
					
					
				
	}

}
