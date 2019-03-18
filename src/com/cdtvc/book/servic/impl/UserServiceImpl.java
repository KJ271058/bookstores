package com.cdtvc.book.servic.impl;

import com.cdtvc.book.dao.UserDAO;
import com.cdtvc.book.dao.impl.UserDAOImpl;
import com.cdtvc.book.servic.UserService;
import com.cdtvc.book.vo.UserEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    private UserDAO userDAO;

    public UserServiceImpl() {
        this.userDAO = new UserDAOImpl();
    }

    @Override
    public int saveUser(UserEntity userEntity) {
        return userDAO.saveUser(userEntity);
    }

    @Override
    public UserEntity loginUser(String account, String password) {
        return userDAO.loginUser(account, password);
    }

    public void setUserDAO(UserDAOImpl userDAO) {
        this.userDAO = userDAO;
    }
}
