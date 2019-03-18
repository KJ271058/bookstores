package com.cdtvc.book.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static Configuration configuration=null;
    private static SessionFactory sf=null;
    private static Session session = null;
    private static Transaction transaction = null;

    /**
     * 工具类方法都是静态的不想让别的类调用构造函数构造对象所以构造对象写成私有的
     */
    private HibernateUtil() {
    }

    static {
        //读取配置信息
        configuration = new Configuration().configure();
        //获得SessionFactory对象要通过她获得session对象
        sf = configuration.buildSessionFactory();
        //获得session对象
        session = sf.openSession();
        //开启事务
        transaction = session.beginTransaction();
    }

    public static Session getSession(){
        return session;
    }

    public static Transaction getTransaction(){
        return transaction;
    }

    //关闭资源
    public static void close(Session session){
        session.close();
        sf.close();
    }
}