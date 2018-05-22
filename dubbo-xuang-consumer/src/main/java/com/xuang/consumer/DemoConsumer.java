package com.xuang.consumer;

import com.xuang.dubbo.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoConsumer {
    public static void main(String[] args) {


 System.setProperty("java.net.preferIPv4Stack", "true");
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"META-INF/spring/dubbo-demo-consumer.xml"});
        context.start();

    DemoService demoService = (DemoService) context.getBean("demoService"); // get remote service proxy

       try {
           Thread.sleep(3000);

           String hello = demoService.sayHello("world"); // call remote method
           System.out.println(hello); // get result
       }catch (Exception e){

       }

    }

}
