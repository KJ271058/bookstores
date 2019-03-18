package com.cdtvc.book.text;

import com.cdtvc.book.dao.impl.UserDAOImpl;
import com.cdtvc.book.servic.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringText {

    @Test
    public void instanceSpring() {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImpl userService =(UserServiceImpl) ctx.getBean("userServiceImpl");
        UserDAOImpl userDAO =(UserDAOImpl) ctx.getBean("userDAOImpl");
        System.out.println(userService);
        System.out.println(userDAO);
        ctx.close();
    }
}
