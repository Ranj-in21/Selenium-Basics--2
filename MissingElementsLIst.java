package javaAssignment.week3.OOPS;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;

public class MissingElementsLIst {

	public static void main(String[] args) {
		
	//Synatx of list
		List<Integer> list = new ArrayList<Integer>();
			list.add(1);
			list.add(2);
			list.add(3);
			list.add(4);
			list.add(7);
			list.add(6);
			list.add(8);
			System.out.println("Given Array: " +list);
			
	//To sort the array
			Collections.sort(list);
			System.out.println("Sorted Array: " +list);
	
	//Iterate the sorted array
			for (int i = 0; i < list.size(); i++) {
			//System.out.print((list.get(i)-1) +" ");
	
	//Check if the iterator variable is not equal to the array values respectively
							
					if(i!= (list.get(i)-1)) {
	//Print the number and break the iteration
						System.out.println("The missing number is: " +(list.get(i)-1));
						break;
					}
				
			}
				
			}
		
}