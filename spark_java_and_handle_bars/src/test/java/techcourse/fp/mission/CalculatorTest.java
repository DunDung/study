package techcourse.fp.mission;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {
    private List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

    @Test
    public void sumAll() {
        int sum = Calculator.sum(numbers, ((num) -> true));
        assertThat(sum).isEqualTo(21);
    }

    @Test
    public void sumAllEven() {
        int sum = Calculator.sum(numbers, ((num) -> num % 2 == 0));
        assertThat(sum).isEqualTo(12);
    }

    @Test
    public void sumAllOverThree() {
        int sum = Calculator.sum(numbers, ((num) -> num > 3));
        assertThat(sum).isEqualTo(15);
    }
}