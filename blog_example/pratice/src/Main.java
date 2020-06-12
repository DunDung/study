import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] a = solution(new int[] {3, 2, 4, 4, 2, 5, 2, 5, 5});
        System.out.println(Arrays.toString(a));
    }

    public static int[] solution(int[] arr) {
        int[] counts = new int[101];
        for (int k : arr) {
            counts[k]++;
        }
        return null;
    }

}
