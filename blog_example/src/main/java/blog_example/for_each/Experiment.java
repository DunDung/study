package blog_example.for_each;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Experiment {
    public static void main(String[] args) {
        List<Integer> nums = IntStream.rangeClosed(1, 3)
                .boxed()
                .collect(Collectors.toList());
        List<Integer> actual = new ArrayList<>();
        nums.stream()
                .forEach(actual::add);
        print();
    }

    public static void print() {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        nums.forEach(System.out::println);
        nums.parallelStream().forEach(System.out::println);
        // 출력 결과가 다르다.
    }
}
