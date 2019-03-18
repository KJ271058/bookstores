package com.cdtvc.book.vo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "user", schema = "book station", catalog = "")
public class UserEntity {
    private int userId;
    private String userName;
    private String userAccount;
    private String userPasswd;
    private String userMobile;

    @Override
    public String toString() {
        return "UserEntity{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userAccount='" + userAccount + '\'' +
                ", userPasswd='" + userPasswd + '\'' +
                ", userMobile='" + userMobile + '\'' +
                '}';
    }

    @Id
    @Column(name = "User_ID")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "User_name")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "User_account")
    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    @Basic
    @Column(name = "User_passwd")
    public String getUserPasswd() {
        return userPasswd;
    }

    public void setUserPasswd(String userPasswd) {
        this.userPasswd = userPasswd;
    }

    @Basic
    @Column(name = "User_mobile")
    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return userId == that.userId &&
                Objects.equals(userMobile, that.userMobile) &&
                Objects.equals(userName, that.userName) &&
                Objects.equals(userAccount, that.userAccount) &&
                Objects.equals(userPasswd, that.userPasswd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userName, userAccount, userPasswd, userMobile);
    }
}
