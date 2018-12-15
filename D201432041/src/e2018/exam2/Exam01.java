package e2018.exam2;

public class Exam01 {

    public static double average(int... a) {
    	double sum = 0;
    	int count = 0;
    	for(int n : a) {
    		sum += n;
    		count ++;
    	}
    	return sum/count;	
    }

    public static void main(String[] args) {
        int[] a = { 2, 3, 4, 5 };

        System.out.println(average(2, 3));
        System.out.println(average(2, 3, 4));
        System.out.println(average(a));
    }
}
