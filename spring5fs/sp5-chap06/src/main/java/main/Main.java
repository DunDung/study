package main.java.main;

import main.java.config.AppCtx;
import main.java.spring.Client;
import main.java.spring.Client2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import java.io.IOException;

public class Main {

    public static void main(String [] args) throws IOException{
        AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        Client client = ctx.getBean(Client.class);
        Client2 client2 = ctx.getBean(Client2.class);
        client.send();
        client2.send();

        ctx.close();
    }
}
