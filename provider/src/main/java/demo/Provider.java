package demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Provider {
    public static void main(String[] args) throws IOException {
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(new String[]{"META-INF/spring/provider.xml"});
        classPathXmlApplicationContext.start();
        System.out.println("Provider started.");
        System.in.read();
    }
}
