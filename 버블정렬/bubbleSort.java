import java.util.Scanner;

public class bubbleSort {

	public static void main(String[] args) {
		System.out.println("lab11_1 : 홍준성\n");

		Scanner input = new Scanner(System.in);

		System.out.print("정수 개수 입력: ");
		int num = input.nextInt();
		int [] array = new int[num];

		System.out.print(num + "개의 정수값 입력: ");
		for(int i=0; i<num; i++) 
			array[i] = input.nextInt();

		System.out.print("정렬 전: ");
		for(int i=0; i<num; i++) 
			System.out.print(array[i] + " ");

		System.out.println("\n");
		bubbleSort(array);

		System.out.print("정렬 후: ");
		for(int i=0; i<num; i++) 
			System.out.print(array[i] + " ");

	}
	public static void bubbleSort(int []a) {
		for(int i=a.length-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
}
