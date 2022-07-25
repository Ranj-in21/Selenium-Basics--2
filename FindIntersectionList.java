package javaAssignment.week3.OOPS;

import java.util.ArrayList;
import java.util.List;

public class FindIntersectionList {

	public static void main(String[] args) {
				
		List<Integer> find1 = new ArrayList<Integer>();	//syntax
			find1.add(3);								//list1
			find1.add(2);
			find1.add(11);
			find1.add(4);
			find1.add(6);
			find1.add(7);
			System.out.println("A= " +find1);
			
		List<Integer> find2 = new ArrayList<Integer>();
			find2.add(1);								//list2
			find2.add(2);
			find2.add(8);
			find2.add(4);
			find2.add(9);
			find2.add(7);
			System.out.println("B= " +find2);
			System.out.println("The intersecting elements are:");
		
			for (int i = 0; i < find1.size(); i++) {	
				
				for (int j = 0; j < find2.size(); j++) {
					
					if(find1.get(i)==find2.get(j)) {		//condition to find intersection
						System.out.println(find1.get(i));
					}
					
				}
				
			}
			
			
			
		
		
	}

}
