package blog_example.repeat_phrase;

import java.util.List;

public class While {
    public static void main(String[] args) {

    }

    public void example(List<String> words) {
        boolean flag = true;
        int index = 0;
        while (flag) {
            if (words.get(index++).equals("book")) {
                flag = false;
            }
            // ...
        }
    }
}
