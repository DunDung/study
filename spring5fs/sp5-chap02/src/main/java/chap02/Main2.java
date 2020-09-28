package main.java.chap02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//싱글톤 객체 알아보기
public class Main2 {
    public static void main(String [] args) {
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(AppContext.class);
        Greeter g1 = ctx.getBean("greeter", Greeter.class);
        Greeter g2 = ctx.getBean("greeter", Greeter.class);
        System.out.println("(g1 == g2) = "+ (g1 == g2));
        ctx.close();
    }
}
