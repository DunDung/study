import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Example1 {

    static void add1(List<Integer> list, int from, int to) {
       // list 객체에 from <= value < to 값의 정수를 추가한다
    	for(int i=from; i<=to; i++)
    		list.add(i);
    }

    static void add2(List<Integer> list, int[] a) {
    	for(int n : a)
    		list.add(n);
    }

    static void add3(List<Integer> list, Collection<Integer> c) {
    	list.addAll(c);
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        List<Integer> list3 = new Vector<>();

        add1(list1, 11, 15);
        add2(list2, new int[] { 16, 17, 18, 19, 20 });
        add3(list3, list1);

        System.out.println(list1.toString());
        System.out.println(list2.toString());
        System.out.println(list3.toString());
    }
}
