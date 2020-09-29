package blog_example.immutable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto {
	private final List<Integer> lottoNos;

	public Lotto(List<Integer> lottoNos) {
		this.lottoNos = new ArrayList<>(lottoNos);
	}

	public List<Integer> getLottoNos() {
		return Collections.unmodifiableList(lottoNos);
	}

	@Override
	public String toString() {
		return lottoNos.toString();
	}
}
