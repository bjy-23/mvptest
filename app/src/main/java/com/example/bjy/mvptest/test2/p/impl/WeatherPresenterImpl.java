package com.example.bjy.mvptest.test2.p.impl;

import com.example.bjy.mvptest.test2.m.WeatherModel;
import com.example.bjy.mvptest.test2.m.entity.Weather;
import com.example.bjy.mvptest.test2.m.impl.WeatherModelImpl;
import com.example.bjy.mvptest.test2.p.OnWeatherListener;
import com.example.bjy.mvptest.test2.p.WeatherPresenter;
import com.example.bjy.mvptest.test2.v.WeatherView;

/**
 * Created by bjy on 2017/2/21.
 */

public class WeatherPresenterImpl implements WeatherPresenter, OnWeatherListener {
    /*Presenter作为中间层，持有View和Model的引用*/
    private WeatherView weatherView;
    private WeatherModel weatherModel;

    public WeatherPresenterImpl(WeatherView weatherView) {
        this.weatherView = weatherView;
        weatherModel = new WeatherModelImpl();
    }

    @Override
    public void getWeather(String cityNO) {
        weatherView.showLoading();
        weatherModel.loadWeather(cityNO, this);
    }

    @Override
    public void onSuccess(Weather weather) {
        weatherView.hideLoading();
        weatherView.setWeatherInfo(weather);
    }

    @Override
    public void onError() {
        weatherView.hideLoading();
        weatherView.showError();
    }
}
