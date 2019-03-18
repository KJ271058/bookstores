package com.cdtvc.book.text;

import com.cdtvc.book.servic.UserService;
import com.cdtvc.book.servic.impl.UserServiceImpl;
import com.cdtvc.book.vo.UserEntity;

public class Text {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        UserService userService = new UserServiceImpl();
        UserEntity userEntity = userService.loginUser("book", "123456");
        if(userEntity!=null)
        {
            System.out.print(userEntity.getUserAccount()+"--"+userEntity.getUserPasswd()+"");
        }else{
            System.out.print("失败！！！");
        }
    }
}
