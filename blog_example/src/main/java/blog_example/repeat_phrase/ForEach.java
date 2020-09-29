package blog_example.repeat_phrase;

import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        example2(new String[]{"a", "b", "c", "d"});
    }

    public static void example(List<String> words) {
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void example2(String[] words) {
        for (String word : words) {
            System.out.println(word);
        }
    }
}
