package com.cdtvc.book.dao;

import com.cdtvc.book.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

@Component
public class BaseDAO {

    public Session getSession() {
        return HibernateUtil.getSession();
    }

    public Transaction getTransaction() {
        return HibernateUtil.getTransaction();
    }

    public void sessionclose(Session session) {
        HibernateUtil.close(session);
    }
}
