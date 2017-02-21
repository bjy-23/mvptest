package com.example.bjy.mvptest.test2.m;

import com.example.bjy.mvptest.test2.p.OnWeatherListener;

/**
 * Created by bjy on 2017/2/21.
 */

public interface WeatherModel {
    void loadWeather(String cityNO, OnWeatherListener listener);
}
