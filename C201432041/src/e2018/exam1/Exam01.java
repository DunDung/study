package e2018.exam1;

import java.lang.reflect.Array;

public class Exam01 {

	public static void main(String[] args) {
		int [] array = {1, 2, 3};
		for(int i = array.length-1; i>0; i--)
			array[i] = array[i-1];
		for(int i=0; i<array.length; i++)
			System.out.print(array[i]+" ");
	}
}