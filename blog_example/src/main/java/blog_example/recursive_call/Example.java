package blog_example.recursive_call;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        print(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15));

    }

    public static void print(List<Integer> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; ++j) {
                for (int k = j + 1; k < size; ++k) {
                    for (int l = k + 1; l < size; ++l) {
                        System.out.println(i + " " + j + " " + k + " " + l);
                    }
                }
            }
        }
    }

}
