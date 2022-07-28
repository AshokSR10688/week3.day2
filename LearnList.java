package week3.day2;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
	//to add items in list
		list.add(1);
		list.add(2);
		list.add(3);
		/* list.add(null); */
		list.add(5);
		list.add(4);
//		System.out.println(list);
//		System.out.println(list.remove(2));
//		System.out.println(list.contains(3));
//		System.out.println(list.size());
//		list.clear();
//		System.out.println(list);
//		System.out.println(list.isEmpty())
Collections.sort(list);
System.out.println(list);
for (int i = 0; i < list.size(); i++) {
	System.out.println(i);
}
	}

}
