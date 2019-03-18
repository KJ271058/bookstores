package com.cdtvc.book.action;

import com.cdtvc.book.servic.UserService;
import com.cdtvc.book.servic.impl.UserServiceImpl;
import com.cdtvc.book.vo.UserEntity;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.stereotype.Controller;

import java.util.Map;

@Controller
public class UserAction extends ActionSupport {

    private UserEntity userEntity;
    protected UserService userService;
    private String confirmPassword;

    public UserAction() {
        this.userService = new UserServiceImpl();
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public String register() throws Exception {
        Map session = ActionContext.getContext().getSession();
        int f = userService.saveUser(userEntity);
        if (f == 1) {
            session.put("error", "注册成功，请登录！！！！");
            return SUCCESS;
        }
        session.put("error", "注册失败，请重试！！！！");
        return ERROR;
    }

    @Override
    public String execute() throws Exception {
        UserEntity userEntity1 = userService.loginUser(userEntity.getUserAccount(), userEntity.getUserPasswd());
        if (userEntity1 != null) {
            Map session = ActionContext.getContext().getSession();
            session.put("user", userEntity1);
            return SUCCESS;
        }
        return ERROR;
    }
}
