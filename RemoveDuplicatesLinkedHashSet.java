package javaAssignment.week3.OOPS;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;


public class RemoveDuplicatesLinkedHashSet {

	public static void main(String[] args) {
		
		String input = "We learn java basics as part of java sessions in java week1";
		String[] split = input.split(" ");
		Set<String> duplicate = new LinkedHashSet<String>(Arrays.asList(split));
		System.out.println(duplicate);
		
		
	}

}
