package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UsingSetRemoveDuplicate {

	public static void main(String[] args) {
		// "We learn JAVA in week3 Java"
String input = "We learn JAVA in week3 Java";
String[] split=input.split(" ");
Set<String> dupset=new LinkedHashSet<String>(Arrays.asList(split));
//Convert Set into List
List<String> list = new ArrayList<String>();
for (int i = 0; i < list.size()-1; i++) {
	if (list.get(i)==list.get(i+1)) {
			System.out.println(list.get(i));
		
		
	}
}
/*
 * for (String output : split) { dupset.add(output);
 * 
 * }
 */
System.out.println(dupset);
	}

}
