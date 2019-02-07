package demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(new String[]{"META-INF/spring/consumer.xml"});
        classPathXmlApplicationContext.start();
        DemoService demoService = (DemoService) classPathXmlApplicationContext.getBean("demoService");
        String hello = demoService.sayHello("world");
        System.out.println(hello);
    }
}
