package com.grzegorz.jurkiewicz.weather.view;

import com.grzegorz.jurkiewicz.weather.model.WeatherModel;

import java.time.LocalDateTime;
import java.util.Scanner;

public class GUI {
    Scanner scanner = new Scanner(System.in);
    private String showWeather;

    public void showGUI() {
        System.out.println("Witaj,");
        System.out.println("wpisz nazwę miasta a poznasz jaka pogoda w nim obecnie panuje.\n" +
                "Dane pochodza ze strony https://openweathermap.org .\n" +
                "Aby zakończyć działanie programu wpisz literę ( e ) ");
        System.out.println();
        System.out.println("Podaj wybrane miasto:");
    }

    public void showWeather(WeatherModel weatherModel) {

        System.out.println("Pogoda dla " + weatherModel.getName() + "," + weatherModel.getSys().getCountry() + " dnia " + LocalDateTime.of(1970, 1, 1, 0, 0, 0).plusSeconds(weatherModel.getDt()));
        System.out.println("Temeperatura: " + ((weatherModel.getMain().getTemp() - 273.15)) + " C");
        System.out.println("Temperatura maksymalna: " + (weatherModel.getMain().getTemp_max() - 273.15) + " C");
        System.out.println("Temperatura minimalna: " + (weatherModel.getMain().getTemp_min() - 273.15) + " C");
        System.out.println("Ciśnienie " + weatherModel.getMain().getPressure() + " hPa");
        System.out.println("Wilgotność " + weatherModel.getMain().getHumidity() + " %");
        System.out.println("Prędkość wiatru: " + weatherModel.getWind().getSpeed() + " km/h");
        System.out.println("Zachmurzenie: " + weatherModel.getCloud().getAll() + " %");
        System.out.println("Wschód słońca o: " + LocalDateTime.of(1970, 1, 1, 0, 0, 0).plusSeconds(weatherModel.getSys().getSunrise()));
        System.out.println("Zachód słońca o: " + LocalDateTime.of(1970, 1, 1, 0, 0, 0).plusSeconds(weatherModel.getSys().getSunset()));
    }
}
