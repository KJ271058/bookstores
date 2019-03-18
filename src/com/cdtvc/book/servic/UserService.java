package com.cdtvc.book.servic;

import com.cdtvc.book.vo.UserEntity;

public interface UserService {
    int saveUser(UserEntity userEntity);
    UserEntity loginUser(String account,String password);
}
