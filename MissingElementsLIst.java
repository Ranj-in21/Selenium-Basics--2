package javaAssignment.week3.OOPS;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;

public class MissingElementsLIst {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,7,6,8};
		List<Integer> list = new ArrayList<Integer>();
		
			for (int i = 0; i < arr.length; i++) {
				list.add(arr[i]);
				}
			System.out.println("Given Array: " +list);
			
			Collections.sort(list);
			System.out.println("Sorted Array: " +list);
	
			for (int i = 0; i < list.size(); i++) {
			//System.out.print((list.get(i)-1) +" ");
				if(i!= (list.get(i)-1)) {
						
					System.out.println("The missing number is: " +(list.get(i)-1));
						break;
					}
				
			}
				
			}
		
}