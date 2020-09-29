package lab0_7;

public class MyList {

	private int[] array;
	private int capacity;
	private int count ;


	public MyList() {
		array = new int[10];
		capacity = 10;
		count = 0;
	}
	public void add(int a) {
		array[count] = a;
		count++;

		if(array.length < capacity)
			System.out.println("¹üÀ§¸¦ ¹ş¾î³µ½À´Ï´Ù.");
	}
	public void print() {

		System.out.print("[");
		for (int i=0; i < count; i++) {
			if(i>0) {
				System.out.print(", ");
			}
			System.out.print(array[i]);
		}
		System.out.println("]");
	}
}
