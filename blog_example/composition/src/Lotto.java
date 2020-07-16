import java.util.Arrays;
import java.util.Objects;

public class Lotto {
    protected int[] lottoNumbers;

    public Lotto(int[] lottoNumbers) {
        this.lottoNumbers = lottoNumbers;
    }

    public boolean contains(Integer integer) {
        return Arrays.stream(lottoNumbers)
            .anyMatch(lottoNumber -> Objects.equals(lottoNumber, integer));
    }
}