package com.grzegorz.jurkiewicz.weather.model;

public class WeatherModel {
    private mainInfo main;
    private windInfo wind;
    private cloudsInfo clouds;
    private sysInfo sys;
    private String name;
    private double dt;

    public mainInfo getMain() {
        return main;
    }

    public void setMain(mainInfo main) {
        this.main = main;
    }

    public windInfo getWind() {
        return wind;
    }

    public void setWind(windInfo wind) {
        this.wind = wind;
    }

    public cloudsInfo getCloud() {
        return clouds;
    }

    public void setCloud(cloudsInfo cloud) {
        this.clouds = cloud;
    }

    public sysInfo getSys() {
        return sys;
    }

    public void setSys(sysInfo sys) {
        this.sys = sys;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDt() {
        return dt;
    }

    public void setDt(double dt) {
        this.dt = dt;
    }

    @Override
    public String toString() {
        return "WeatherModel{" +
                "main=" + main +
                ", wind=" + wind +
                ", cloud=" + clouds +
                ", sys=" + sys +
                ", name='" + name + '\'' +
                ", dt=" + dt +
                '}';
    }

    public class mainInfo {
        private int temp;
        private int pressure;
        private int humidity;
        private int temp_min;
        private int temp_max;

        public int getTemp() {
            return temp;
        }

        public void setTemp(int temp) {
            this.temp = temp;
        }

        public int getPressure() {
            return pressure;
        }

        public void setPressure(int pressure) {
            this.pressure = pressure;
        }

        public int getHumidity() {
            return humidity;
        }

        public void setHumidity(int humidity) {
            this.humidity = humidity;
        }

        public int getTemp_min() {
            return temp_min;
        }

        public void setTemp_min(int temp_min) {
            this.temp_min = temp_min;
        }

        public int getTemp_max() {
            return temp_max;
        }

        public void setTemp_max(int temp_max) {
            this.temp_max = temp_max;
        }

        @Override
        public String toString() {
            return "mainInfo{" +
                    "temp=" + temp +
                    ", pressure=" + pressure +
                    ", humidity=" + humidity +
                    ", temp_min=" + temp_min +
                    ", temp_max=" + temp_max +
                    '}';
        }
    }

    public class windInfo {
        private int speed;

        public int getSpeed() {
            return speed;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        @Override
        public String toString() {
            return "windInfo{" +
                    "speed=" + speed +
                    '}';
        }
    }

    public class cloudsInfo {
        private int clouds;

        public int getClouds() {
            return clouds;
        }

        @Override
        public String toString() {
            return "cloudsInfo{" +
                    "clouds=" + clouds +
                    '}';
        }

        public void setClouds(int clouds) {
            this.clouds = clouds;
        }
    }

    public class sysInfo {
        private String country;
        private double sunrise;
        private double sunset;

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public double getSunrise() {
            return sunrise;
        }

        public void setSunrise(double sunrise) {
            this.sunrise = sunrise;
        }

        public double getSunset() {
            return sunset;
        }

        public void setSunset(double sunset) {
            this.sunset = sunset;
        }

        @Override
        public String toString() {
            return "sysInfo{" +
                    "country='" + country + '\'' +
                    ", sunrise=" + sunrise +
                    ", sunset=" + sunset +
                    '}';
        }
    }
}
