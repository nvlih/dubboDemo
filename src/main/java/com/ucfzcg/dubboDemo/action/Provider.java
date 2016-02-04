package com.ucfzcg.dubboDemo.action;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by nvlih on 2016/2/1 0001.
 */
public class Provider {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"mvc-config.xml"});
        context.start();

        System.in.read(); // 为保证服务一直开着，利用输入流的阻塞来模拟
    }

}
