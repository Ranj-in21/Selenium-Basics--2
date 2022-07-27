package javaAssignment.week3.OOPS;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesSet {

	public static void main(String[] args) {
		
		
		
		String word = "We learn java basics as part of java sessions in java week1";
		
		String[] text = word.split(" ");
		Set<String> sentence = new LinkedHashSet<String>();
					
				for (String duplicates : text) {
				sentence.add(duplicates);
				
			}
				System.out.println(sentence);
			
 		
			
		
		
		
		

	}

}
