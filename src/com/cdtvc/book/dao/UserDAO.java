package com.cdtvc.book.dao;

import com.cdtvc.book.vo.UserEntity;

public interface UserDAO {
    int saveUser(UserEntity userEntity);

    UserEntity loginUser(String account, String password);
}
