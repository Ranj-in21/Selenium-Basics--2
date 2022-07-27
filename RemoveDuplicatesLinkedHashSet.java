package javaAssignment.week3.OOPS;

import java.util.LinkedHashSet;
import java.util.Set;


public class RemoveDuplicatesLinkedHashSet {

	public static void main(String[] args) {
		
	System.out.println("Given String: We learn java basics as part of java sessions in java week1");
		Set<String> text = new LinkedHashSet<String>();
			text.add("We");
			text.add("learn");
			text.add("java");
			text.add("basics");
			text.add("as");
			text.add("part");
			text.add("of");
			text.add("java");
			text.add("sessions");
			text.add("in");
			text.add("java");
			text.add("week1");
			System.out.println("After removing duplicates:");
			System.out.println(text);
		

	}

}
