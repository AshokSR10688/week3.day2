package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;


public class LearnSet {

	public static void main(String[] args) {
		Set<String> data=new LinkedHashSet<String>();
		data.add("TCS");
		data.add("Tcs");
		data.add("Cts");
		data.add("Google");
		data.add("HP");
		data.add("HP");
		data.add("HCL");
		//System.out.println(data.remove("HP"));	
	
		/*
		 * System.out.println(data.add("Amazon")); System.out.println(data);
		 * System.out.println(data.size());
		 */
//iterate all data
for (String output : data) {
	System.out.println(output);
}
	}

}
