package assignments;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class largestNum {
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array value");
		String str=sc.nextLine();
		String str1[]=str.split(" ");
		Arrays.parallelSort(str1,Collections.reverseOrder());
		String num="";
		for(int i=0;i<str1.length;i++) {
			num=num+str1[i];
		}
		long large=Long.parseLong(num);
		System.out.println(large);
	}
}
