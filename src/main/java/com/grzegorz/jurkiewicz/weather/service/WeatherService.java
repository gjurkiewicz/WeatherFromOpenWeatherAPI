package com.grzegorz.jurkiewicz.weather.service;

import com.google.gson.Gson;
import com.grzegorz.jurkiewicz.weather.model.Utils;
import com.grzegorz.jurkiewicz.weather.model.WeatherModel;

public class WeatherService {
    private static WeatherService ourInstance = new WeatherService();

    public static WeatherService getInstance() {
        return ourInstance;
    }

    private WeatherService() {
    }
    public static WeatherModel getWeather(String city){
        //API adres + private key
        String websiteResponse = Utils.redWebsiteContent("http://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=5d4d3476c80e171f6d7b4f8b4f545718");

                Gson gson = new Gson();

        WeatherModel weather = gson.fromJson(websiteResponse,WeatherModel.class);

        return weather;
    }

}
