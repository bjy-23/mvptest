package com.example.bjy.mvptest;

/**
 * Created by bjy on 2017/2/21.
 */

public interface IUserBiz {
    void login(String username, String password, OnLoginListener loginListener);
}
