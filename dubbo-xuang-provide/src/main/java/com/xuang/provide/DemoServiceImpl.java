package com.xuang.provide;

import com.xuang.dubbo.DemoService;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name + ", request from consumer: ");
        System.out.println("服务启动");
        return "Hello " + name + ", response from provider: ";
    }
}
