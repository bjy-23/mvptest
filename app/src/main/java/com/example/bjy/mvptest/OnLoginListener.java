package com.example.bjy.mvptest;

/**
 * Created by bjy on 2017/2/21.
 */

public interface OnLoginListener {

    void loginSuccess(User user);

    void loginFailed();
}
