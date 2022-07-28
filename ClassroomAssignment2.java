package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class ClassroomAssignment2 {

public static void main(String[] args) {
		String input = "TestLeaf";
		char[] charArray = input.toCharArray();
		Set<Character> unique=new LinkedHashSet<Character>();
		for (int i =0 ; i<=charArray.length-1; i++) {
			//System.out.println(charArray[i]);
			if (!unique.add(charArray[i])) {
				unique.remove(charArray[i]);
			}
						
						
				}
		System.out.println(unique);
		}
		}


