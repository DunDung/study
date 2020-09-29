package blog_example.repeat_phrase;

import java.util.List;

public class For {
    public static void main(String[] args) {
    }

    public void example(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            // ...
        }
    }

    public void example2(List<Integer> numbers) {
        int numbersSize = numbers.size();
        for (int i = 0; i < numbersSize; i++) {
            // ...
        }
    }
}
