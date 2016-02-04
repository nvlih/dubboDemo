package com.ucfzcg.dubboDemo.action;

import com.ucfzcg.dubboDemo.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by nvlih on 2016/2/1 0001.
 */
public class Consumer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationContext.xml" });
        context.start();

        DemoService demoService = (DemoService) context.getBean("demoService"); //
        String hello = demoService.sayHello("tom"); // ִ
        System.out.println(hello); //

        //
        List list = demoService.getUsers();
        if (list != null && list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        }
        // System.out.println(demoService.hehe());
        System.in.read();
    }
}
