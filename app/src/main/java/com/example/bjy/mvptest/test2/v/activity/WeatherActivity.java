package com.example.bjy.mvptest.test2.v.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.bjy.mvptest.test2.m.entity.Weather;
import com.example.bjy.mvptest.test2.v.WeatherView;

/**
 * Created by bjy on 2017/2/21.
 */

public class WeatherActivity extends AppCompatActivity implements WeatherView {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showError() {

    }

    @Override
    public void setWeatherInfo(Weather weather) {

    }
}
