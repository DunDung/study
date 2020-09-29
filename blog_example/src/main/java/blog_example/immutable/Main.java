package blog_example.immutable;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> temp = new ArrayList<>();
		for (int i = 1; i <= 6; i++) {
			temp.add(i);
		}
		Lotto lotto = new Lotto(temp);
		System.out.println(lotto);
		lotto.getLottoNos().clear();
		System.out.println(lotto);
	}
}
