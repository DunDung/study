package techcourse.fp.mission;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamStudy {
    public static long countWords() throws IOException {
        String contents = new String(Files.readAllBytes(Paths
                .get("src/main/resources/fp/war-and-peace.txt")), StandardCharsets.UTF_8);
        List<String> words = Arrays.asList(contents.split("[\\P{L}]+"));

        long count = 0;
        for (String w : words) {
            if (w.length() > 12) count++;
        }
        return count;
    }

    public static List<Integer> doubleNumbers(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        for(Integer number: numbers) {
            result.add(2 * number);
        }

        return result;
    }

    public static long sumAll(List<Integer> numbers) {
        int result = 0;

        for(Integer number: numbers) {
            result += number;
        }

        return result;
    }

    public static long sumOverThreeAndDouble(List<Integer> numbers) {
        return numbers.stream()
            .filter(v -> v > 3)
            .mapToInt(v -> v * 2).sum();
    }

    public static void printLongestWordTop100() throws IOException {
        String contents = new String(Files.readAllBytes(Paths
                .get("src/main/resources/fp/war-and-peace.txt")), StandardCharsets.UTF_8);
        List<String> words = Arrays.asList(contents.split("[\\P{L}]+"));

        words.stream()
            .filter(word -> word.length() > 12)
            .limit(100)
            .sorted(Comparator.comparing(String::length).reversed())
            .distinct()
            .map(String::toLowerCase)
            .forEach(System.out::println);
    }
}
