import java.util.List;

public class WinningLotto extends Lotto {
    private final BonusBall bonusBall;

    public WinningLotto(List<Integer> lottoNumbers, BonusBall bonusBall) {
        super(lottoNumbers);
        this.bonusBall = bonusBall;
    }

    public long compare(Lotto lotto) {
        return lottoNumbers.stream()
            .filter(lotto::contains)
            .count();
    }
}
