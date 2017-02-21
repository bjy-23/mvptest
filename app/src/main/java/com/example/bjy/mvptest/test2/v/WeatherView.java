package com.example.bjy.mvptest.test2.v;

import com.example.bjy.mvptest.test2.m.entity.Weather;

/**
 * Created by bjy on 2017/2/21.
 */

public interface WeatherView {
    void showLoading();

    void hideLoading();

    void showError();

    void setWeatherInfo(Weather weather);
}
