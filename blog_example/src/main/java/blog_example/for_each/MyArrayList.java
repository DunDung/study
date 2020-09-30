package blog_example.for_each;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyArrayList extends ArrayList<Integer> {

    @Override
    public Iterator<Integer> iterator() {
        int lastIndex = this.size() - 1;
        List<Integer> myList = this;

        return new Iterator<Integer>() {
            private int startIndex = lastIndex;

            @Override
            public boolean hasNext() {
                return startIndex >= 0;
            }

            @Override
            public Integer next() {
                return myList.get(startIndex--);
            }
        };
    }

}
