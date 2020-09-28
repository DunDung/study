package 예제문제;

public class Example4 {

    int a = 3, b = 4;
    
    class InnerClass {
    	
    	int temp = 0;
    	
    	public void swap() {
    		temp = a;
    		a = b;
    		b = temp;
    	}
    }

    void doSomethoing() {
        new InnerClass().swap();
        System.out.printf("%d %d\n", a, b);
    }

    public static void main(String[] args) {
        new Example4().doSomethoing();
    }
}
