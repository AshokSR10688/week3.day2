package week3.day2;

public class Junpstatement {

	public static void main(String[] args) {
	int num=10;
	for (int i = 0; i < num; i++) {
		if (i==3) {
			System.out.println(i);
			//break;//terminate the entire execution
			continue;//skip the particular value
		}	
		System.out.println(i);
	}
	}

}
