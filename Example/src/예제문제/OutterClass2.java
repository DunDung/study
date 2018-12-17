package 예제문제;

public class OutterClass2 {
    int a;

    static class InnerClass {

        int b;

        void method2() {
            b = 5;
            this.b = 6;
            // a = 7;                               컴파일 에러
            // OutterClass2.this.a = 8;             컴파일 에러
            // instanceMethod();                    컴파일 에러
            // this.instanceMethod();               컴파일 에러
            // OutterClass2.this.instanceMethod();  컴파일 에러
            main(null);
        }
    }

    public void instanceMethod() {
        InnerClass obj = new InnerClass();
        a = 1;
        this.a = 2;
        obj.method2();
    }

    public static void main(String[] args) {
        InnerClass obj = new InnerClass();
        obj.method2();
        // this.a = 4;                          컴파일 에러
    }
}

