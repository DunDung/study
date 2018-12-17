package 예제문제;

import java.util.Arrays;

public class ArraySort {
	
	public static void main(String [] args) {
		Integer [] a = new Integer [] {10, 3, 5, 2, 8};
		Arrays.sort(a);
		for(int i=0; i<a.length; i++)
			System.out.print(a[i]+ " ");
		System.out.println(binarySerch(a, 0, a.length-1, 4));
		
	}
	public static boolean binarySerch(Integer [] a, int start, int end,  int item) {
		int middle = (start + end) /2;
		if(start > end)
			return false;
		if(a[middle] == item)
			return true;
		else if (a[middle] < item)
			return binarySerch(a, middle+1, end, item);
		else
			return binarySerch(a, start, middle-1, item);
	}
}
