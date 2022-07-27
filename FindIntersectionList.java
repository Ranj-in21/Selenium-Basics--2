package javaAssignment.week3.OOPS;


import java.util.Arrays;
import java.util.List;

public class FindIntersectionList {

	public static void main(String[] args) {		
				
		List<Integer> find1 = Arrays.asList(3,2,11,4,6,7);	
			
			System.out.println("A= " +find1);
			
		List<Integer> find2 = Arrays.asList(1,2,8,4,9,7);
			
			System.out.println("B= " +find2);
			System.out.println("The intersecting elements are:"); 
		
			for (int i = 0; i < find1.size(); i++) {	
				
				for (int j = 0; j < find2.size(); j++) {
					
					if(find1.get(i)==find2.get(j)) {		
						System.out.println(find1.get(i));
					}
					
				}
				
			}
			
			
			
		
		
	}

}
