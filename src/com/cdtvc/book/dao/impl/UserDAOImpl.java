package com.cdtvc.book.dao.impl;

import com.cdtvc.book.dao.BaseDAO;
import com.cdtvc.book.dao.UserDAO;
import com.cdtvc.book.vo.UserEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAOImpl extends BaseDAO implements UserDAO {

    @Override
    public int saveUser(UserEntity userEntity) {
        Session session = getSession();
        Transaction transaction = getTransaction();
        String hql = "from UserEntity u order by u.userAccount desc";
        Query query = session.createQuery(hql);
        query.setFirstResult(1);
        query.setMaxResults(1);
        List userlist = query.list();
        if (userlist.size() != 0) {
            UserEntity userEntity1 = (UserEntity) userlist.get(0);
            userEntity.setUserAccount((Integer.parseInt(userEntity1.getUserAccount()) + 1) + "");
            session.save(userEntity);
            transaction.commit();
        }
        return userlist.size();
    }

    @Override
    public UserEntity loginUser(String account, String password) {
        String hql = "from UserEntity u WHERE (u.userAccount=?0 or u.userName=?1 or u.userMobile=?2) and u.userPasswd=?3";
        Session session = getSession();
        Query query = session.createQuery(hql);
        for (int i = 0; i < 4; i++) {
            query.setParameter(i, i < 3 ? account : password);
        }
        List users = query.list();
        if (users.size() != 0) {
            UserEntity userEntity = (UserEntity) users.get(0);
            return userEntity;
        }
        sessionclose(session);
        return null;
    }

    public static void main(String[] args) {
        UserDAO userDAO = new UserDAOImpl();
        UserEntity user = userDAO.loginUser("book", "123456");
        if (user != null) {
            System.out.print(user.getUserAccount() + "--" + user.getUserPasswd() + "");
        } else {
            System.out.print("失败！！！");
        }
    }
}
