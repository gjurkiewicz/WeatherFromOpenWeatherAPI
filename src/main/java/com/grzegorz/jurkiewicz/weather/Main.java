package com.grzegorz.jurkiewicz.weather;

import com.grzegorz.jurkiewicz.weather.controller.WeatherController;
import com.grzegorz.jurkiewicz.weather.model.WeatherModel;
import com.grzegorz.jurkiewicz.weather.service.WeatherService;
import com.grzegorz.jurkiewicz.weather.view.GUI;

public class Main {
    WeatherModel weatherModel = new WeatherModel();
    public static void main(String[] args) {
        new WeatherController().run();

    }
}
