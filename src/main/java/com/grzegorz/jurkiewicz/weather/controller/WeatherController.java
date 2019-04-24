package com.grzegorz.jurkiewicz.weather.controller;

import com.grzegorz.jurkiewicz.weather.model.WeatherModel;
import com.grzegorz.jurkiewicz.weather.service.WeatherService;
import com.grzegorz.jurkiewicz.weather.view.GUI;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static javafx.scene.input.KeyCode.Z;

public class WeatherController {
    private WeatherService weatherService = WeatherService.getInstance();

    public void run() {
        Scanner scanner = new Scanner(System.in);
        String city;
        boolean flag = true;
        GUI gui = new GUI();
        gui.showGUI();
        do {
            city = scanner.nextLine();
            if (city.equals("e")) {
                break;
            }
            try {
                gui.showWeather(weatherService.getWeather(city));
                System.out.println();
                System.out.println("Podaj kolejne miasto lub zakończ wybierając ( e ).");
           } catch (NullPointerException e) {
                System.out.println("Nie ma takiego miasta.");
                System.out.println("Podaj kolejne miasto lub zakończ wybierając ( e ).");
          }
        }while (flag = true) ;
            System.out.println("Koniec programu.");
        }
    }






