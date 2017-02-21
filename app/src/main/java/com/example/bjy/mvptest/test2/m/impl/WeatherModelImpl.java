package com.example.bjy.mvptest.test2.m.impl;

import com.example.bjy.mvptest.test2.m.WeatherModel;
import com.example.bjy.mvptest.test2.m.entity.Weather;
import com.example.bjy.mvptest.test2.p.OnWeatherListener;

/**
 * Created by bjy on 2017/2/21.
 */

public class WeatherModelImpl implements WeatherModel {
    @Override
    public void loadWeather(String cityNO, OnWeatherListener listener) {

        //模拟数据
        Weather weather = new Weather();
        listener.onSuccess(weather);
    }
}
