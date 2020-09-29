package blog_example.string;

public class Example {

    public static void main(String[] args) {
        String str = "Hello,";
        System.out.println(System.identityHashCode(str));
        str += "world!";
        System.out.println(System.identityHashCode(str));
    }

    public static String plusString() {
        String temp = "";
        for (int i = 1; i <= 1000; i++) {
            temp += i;
        }
        return temp;
    }
}
