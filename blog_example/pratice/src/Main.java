import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static  void main(String[] args) {
        System.out.println(solution(new int[] {6, 10, 2}));
    }

    public static String solution(int[] numbers) {
        return  Arrays.stream(numbers)
            .boxed()
            .map(String::valueOf)
            .sorted((x, y) -> {
                int xIdx = 0;
                int yIdx = 0;
                int r = 0;
                while (r == 0) {
                    r = x.charAt(xIdx) - y.charAt(yIdx);
                    if (xIdx + 1 < x.length()) {
                        xIdx++;
                    }
                    if (yIdx + 1 < y.length()) {
                        yIdx++;
                    }
                }
                return  r * (-1);
            })
            .collect(Collectors.joining());
    }

}
