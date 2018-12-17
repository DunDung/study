package 예제문제;

import java.util.Arrays;

class Data3 implements Comparable<Data3> {
    int a;

    public Data3(int a) {
        this.a = a;
    }

    @Override
    public int compareTo(Data3 data) {
    	return this.a-data.a;
    }
    //Data3클래스는 사용자가 정의한 클래스이기 때문에 새로 comparTo를 재정의해서
    //비교할 멤버변수 등을 정해주지 않으면 Array.sort가 작동하지 않는다.
    @Override
    public String toString() {
    	return ""+this.a;
    }
}

public class Example12 {

    public static void main(String[] args) {
        Data3[] a = new Data3[] { new Data3(3), new Data3(5), new Data3(1) };
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
