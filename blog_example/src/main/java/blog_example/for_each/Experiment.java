package blog_example.for_each;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Experiment {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        Consumer<Integer> removeIfEven = num -> {
            System.out.println(num);
            if (num % 2 == 0) {
                nums.set(5, 7);
            }
        };

        nums.forEach(removeIfEven);
        System.out.println(nums.toString());
    }


    private static void removeOnZero(List<Integer> nums) {
        for (int num : nums) {
            System.out.println(num);
            if (num == 0) {
                nums.remove(num);
            }
        }
    }

    public static void print() {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        nums.forEach(System.out::println);
        nums.parallelStream().forEach(System.out::println);
        // 출력 결과가 다르다.
    }

    public static Long qwe() {
        Long qwe = null;
        return qwe;
    }
}
