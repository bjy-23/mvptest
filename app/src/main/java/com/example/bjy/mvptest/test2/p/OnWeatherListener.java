package com.example.bjy.mvptest.test2.p;

import com.example.bjy.mvptest.test2.m.entity.Weather;

/**
 * Created by bjy on 2017/2/21.
 */

public interface OnWeatherListener {
    /**
     * 成功时回调
     *
     * @param weather
     */
    void onSuccess(Weather weather);
    /**
     * 失败时回调
     */
    void onError();
}
