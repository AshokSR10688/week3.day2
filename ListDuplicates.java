package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDuplicates {

public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
				list.add("Adam");
				list.add("Ben");
				list.add("Zara");
				list.add("Adam");
				list.add("Charlie");
				list.add("James");
				list.add("Ben");	
			Collections.sort(list);				
for (int i = 0; i <list.size()-1; i++) {
	if (list.get(i)==list.get(i+1)) {
System.out.println(list.get(i));
}		
}
}
}
