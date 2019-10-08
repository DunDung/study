import java.util.*;

public class test {
	static int a,b,c;
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			double v = (Math.random()) ;
			System.out.println(v);
		}
	}
	static void prnt() {
		while(a < b) {
			System.out.println(a);
			++a;
			c= c+a;
			prnt();
		}
	}
	
}
