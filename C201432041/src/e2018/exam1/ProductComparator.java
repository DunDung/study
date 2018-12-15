package e2018.exam1;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product>{

	@Override
	public int compare(Product a, Product b) {
		int r = a.name.compareTo(b.name);
		if(r != 0) return r;
		return a.price - b.price;
	}

}
