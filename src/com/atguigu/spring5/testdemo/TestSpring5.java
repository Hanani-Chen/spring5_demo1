package com.atguigu.spring5.testdemo;

import com.atguigu.spring5.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hanani
 * @create 2021-07-26-1:30
 */
public class TestSpring5 {
    @Test
    public void testAdd(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
        User user = applicationContext.getBean("user", User.class);
        System.out.println(user);
        user.add();
    }
}
