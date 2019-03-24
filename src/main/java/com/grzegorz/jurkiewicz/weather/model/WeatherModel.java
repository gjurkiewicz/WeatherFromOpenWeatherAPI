package com.grzegorz.jurkiewicz.weather.model;

import java.time.LocalDateTime;

public class WeatherModel {
    private MainInfo main;
    private WindsInfo wind;
    private CloudInfo clouds;
    private SysInfo sys;
    private String name;
    private long dt;

    public MainInfo getMain() {
        return main;
    }

    public void setMain(MainInfo main) {
        this.main = main;
    }

    public WindsInfo getWind() {
        return wind;
    }

    public void setWind(WindsInfo wind) {
        this.wind = wind;
    }

    public CloudInfo getCloud() {
        return clouds;
    }

    public void setCloud(CloudInfo cloud) {
        this.clouds = cloud;
    }

    public SysInfo getSys() {
        return sys;
    }

    public void setSys(SysInfo sys) {
        this.sys = sys;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getDt() {
        return dt;
    }

    public void setDt(long dt) {
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
                ", dt=" + LocalDateTime.of(1970, 1, 1, 0, 0, 0).plusSeconds(dt) +
                '}';
    }

    public class MainInfo {
        private double temp;
        private double pressure;
        private double humidity;
        private double temp_min;
        private double temp_max;

        public double getTemp() {
            return temp;
        }

        public void setTemp(double temp) {
            this.temp = temp;
        }

        public double getPressure() {
            return pressure;
        }

        public void setPressure(double pressure) {
            this.pressure = pressure;
        }

        public double getHumidity() {
            return humidity;
        }

        public void setHumidity(double humidity) {
            this.humidity = humidity;
        }

        public double getTemp_min() {
            return temp_min;
        }

        public void setTemp_min(double temp_min) {
            this.temp_min = temp_min;
        }

        public double getTemp_max() {
            return temp_max;
        }

        public void setTemp_max(double temp_max) {
            this.temp_max = temp_max;
        }

        @Override
        public String toString() {
            return "mainInfo{" +
                    "temp=" + (temp) +
                    ", pressure=" + pressure +
                    ", humidity=" + humidity +
                    ", temp_min=" + (temp_min) +
                    ", temp_max=" + (temp_max) +
                    '}';
        }
    }

    public class WindsInfo {
        private double speed;

        public double getSpeed() {
            return speed;
        }

        public void setSpeed(double speed) {
            this.speed = speed;
        }

        @Override
        public String toString() {
            return "WindsInfo{" +
                    "speed=" + speed +
                    '}';
        }
    }

    public class CloudInfo {
        private double all;

        public double getAll() {
            return all;
        }


        public void setAll(double all) {
            this.all = all;
        }

        @Override
        public String toString() {
            return "CloudInfo{" +
                    "all=" + all +
                    '}';
        }
    }
        public class SysInfo {
            private String country;
            private long sunrise;
            private long sunset;

            public String getCountry() {
                return country;
            }

            public void setCountry(String country) {
                this.country = country;
            }

            public long getSunrise() {
                return sunrise;
            }

            public void setSunrise(long sunrise) {
                this.sunrise = sunrise;
            }

            public long getSunset() {
                return sunset;
            }

            public void setSunset(long sunset) {
                this.sunset = sunset;
            }

            @Override
            public String toString() {
                return "sysInfo{" +
                        "country='" + country + '\'' +
                        ", sunrise=" + LocalDateTime.of(1970, 1, 1, 0, 0, 0).plusSeconds(sunrise) +
                        ", sunset=" + LocalDateTime.of(1970, 1, 1, 0, 0, 0).plusSeconds(sunset) +
                        '}';
            }
        }
    }

