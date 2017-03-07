package com.cyx.weatherapplication.entity;

import java.util.List;

/**
 * Created by cyx623823 on 2017/3/7.
 */

//NOTICE 天气预报实体类

public class TheWeatherForecastBean {

    /**
     * cod : 200
     * message : 0.0086
     * cnt : 39
     * list : [{"dt":1488855600,"main":{"temp":14.82,"temp_min":13.89,"temp_max":14.82,"pressure":1023.32,"sea_level":1032.48,"grnd_level":1023.32,"humidity":100,"temp_kf":0.93},"weather":[{"id":501,"main":"Rain","description":"moderate rain","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":2.56,"deg":33.5081},"rain":{"3h":4.195},"sys":{"pod":"d"},"dt_txt":"2017-03-07 03:00:00"},{"dt":1488866400,"main":{"temp":15.54,"temp_min":14.93,"temp_max":15.54,"pressure":1021.44,"sea_level":1030.64,"grnd_level":1021.44,"humidity":100,"temp_kf":0.62},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":2.96,"deg":31.0011},"rain":{"3h":0.775},"sys":{"pod":"d"},"dt_txt":"2017-03-07 06:00:00"},{"dt":1488877200,"main":{"temp":14.64,"temp_min":14.33,"temp_max":14.64,"pressure":1020.92,"sea_level":1030.07,"grnd_level":1020.92,"humidity":100,"temp_kf":0.31},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":100},"wind":{"speed":3.36,"deg":38.0057},"rain":{"3h":1.04},"sys":{"pod":"d"},"dt_txt":"2017-03-07 09:00:00"},{"dt":1488888000,"main":{"temp":13.1,"temp_min":13.1,"temp_max":13.1,"pressure":1022.16,"sea_level":1031.45,"grnd_level":1022.16,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":3.27,"deg":38.5016},"rain":{"3h":0.66},"sys":{"pod":"n"},"dt_txt":"2017-03-07 12:00:00"},{"dt":1488898800,"main":{"temp":11.92,"temp_min":11.92,"temp_max":11.92,"pressure":1023.84,"sea_level":1033.08,"grnd_level":1023.84,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":3.31,"deg":25.0067},"rain":{"3h":0.6},"sys":{"pod":"n"},"dt_txt":"2017-03-07 15:00:00"},{"dt":1488909600,"main":{"temp":11.3,"temp_min":11.3,"temp_max":11.3,"pressure":1023.01,"sea_level":1032.36,"grnd_level":1023.01,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":2.59,"deg":28.5003},"rain":{"3h":0.58},"sys":{"pod":"n"},"dt_txt":"2017-03-07 18:00:00"},{"dt":1488920400,"main":{"temp":10.79,"temp_min":10.79,"temp_max":10.79,"pressure":1022.28,"sea_level":1031.63,"grnd_level":1022.28,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":2.81,"deg":21.5007},"rain":{"3h":1.53},"sys":{"pod":"n"},"dt_txt":"2017-03-07 21:00:00"},{"dt":1488931200,"main":{"temp":10.5,"temp_min":10.5,"temp_max":10.5,"pressure":1024.77,"sea_level":1034.1,"grnd_level":1024.77,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":4.14,"deg":18.5029},"rain":{"3h":1.35},"sys":{"pod":"d"},"dt_txt":"2017-03-08 00:00:00"},{"dt":1488942000,"main":{"temp":11.93,"temp_min":11.93,"temp_max":11.93,"pressure":1025.55,"sea_level":1034.85,"grnd_level":1025.55,"humidity":96,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":4.66,"deg":33.5013},"rain":{"3h":0.69},"sys":{"pod":"d"},"dt_txt":"2017-03-08 03:00:00"},{"dt":1488952800,"main":{"temp":14.41,"temp_min":14.41,"temp_max":14.41,"pressure":1023.36,"sea_level":1032.59,"grnd_level":1023.36,"humidity":80,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":80},"wind":{"speed":4.52,"deg":33.0014},"rain":{"3h":0.11},"sys":{"pod":"d"},"dt_txt":"2017-03-08 06:00:00"},{"dt":1488963600,"main":{"temp":15.16,"temp_min":15.16,"temp_max":15.16,"pressure":1022.26,"sea_level":1031.38,"grnd_level":1022.26,"humidity":74,"temp_kf":0},"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04d"}],"clouds":{"all":92},"wind":{"speed":3.75,"deg":50.5004},"rain":{},"sys":{"pod":"d"},"dt_txt":"2017-03-08 09:00:00"},{"dt":1488974400,"main":{"temp":13.21,"temp_min":13.21,"temp_max":13.21,"pressure":1023,"sea_level":1032.24,"grnd_level":1023,"humidity":83,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":2.91,"deg":52.0025},"rain":{"3h":0.039999999999999},"sys":{"pod":"n"},"dt_txt":"2017-03-08 12:00:00"},{"dt":1488985200,"main":{"temp":11.87,"temp_min":11.87,"temp_max":11.87,"pressure":1024.26,"sea_level":1033.55,"grnd_level":1024.26,"humidity":97,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":2.52,"deg":21.0031},"rain":{"3h":0.26},"sys":{"pod":"n"},"dt_txt":"2017-03-08 15:00:00"},{"dt":1488996000,"main":{"temp":11.23,"temp_min":11.23,"temp_max":11.23,"pressure":1023.24,"sea_level":1032.58,"grnd_level":1023.24,"humidity":99,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":1.62,"deg":28.0042},"rain":{"3h":0.17},"sys":{"pod":"n"},"dt_txt":"2017-03-08 18:00:00"},{"dt":1489006800,"main":{"temp":10.91,"temp_min":10.91,"temp_max":10.91,"pressure":1022.2,"sea_level":1031.47,"grnd_level":1022.2,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":1.67,"deg":40.0052},"rain":{"3h":0.36},"sys":{"pod":"n"},"dt_txt":"2017-03-08 21:00:00"},{"dt":1489017600,"main":{"temp":11.36,"temp_min":11.36,"temp_max":11.36,"pressure":1023.25,"sea_level":1032.51,"grnd_level":1023.25,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":100},"wind":{"speed":1.82,"deg":0.00439453},"rain":{"3h":0.37},"sys":{"pod":"d"},"dt_txt":"2017-03-09 00:00:00"},{"dt":1489028400,"main":{"temp":13.46,"temp_min":13.46,"temp_max":13.46,"pressure":1023.48,"sea_level":1032.6,"grnd_level":1023.48,"humidity":95,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":2.07,"deg":18.502},"rain":{"3h":0.29},"sys":{"pod":"d"},"dt_txt":"2017-03-09 03:00:00"},{"dt":1489039200,"main":{"temp":15.1,"temp_min":15.1,"temp_max":15.1,"pressure":1020.69,"sea_level":1029.77,"grnd_level":1020.69,"humidity":89,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":1.74,"deg":63.5056},"rain":{"3h":0.29},"sys":{"pod":"d"},"dt_txt":"2017-03-09 06:00:00"},{"dt":1489050000,"main":{"temp":15.33,"temp_min":15.33,"temp_max":15.33,"pressure":1019.62,"sea_level":1028.57,"grnd_level":1019.62,"humidity":99,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":1.62,"deg":351.009},"rain":{"3h":0.45},"sys":{"pod":"d"},"dt_txt":"2017-03-09 09:00:00"},{"dt":1489060800,"main":{"temp":13.28,"temp_min":13.28,"temp_max":13.28,"pressure":1020.34,"sea_level":1029.43,"grnd_level":1020.34,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":1.56,"deg":0},"rain":{"3h":0.95},"sys":{"pod":"n"},"dt_txt":"2017-03-09 12:00:00"},{"dt":1489071600,"main":{"temp":12.63,"temp_min":12.63,"temp_max":12.63,"pressure":1021.55,"sea_level":1030.77,"grnd_level":1021.55,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":1.57,"deg":10.0016},"rain":{"3h":1.34},"sys":{"pod":"n"},"dt_txt":"2017-03-09 15:00:00"},{"dt":1489082400,"main":{"temp":12.26,"temp_min":12.26,"temp_max":12.26,"pressure":1021.09,"sea_level":1030.27,"grnd_level":1021.09,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":1.56,"deg":12.0022},"rain":{"3h":1.14},"sys":{"pod":"n"},"dt_txt":"2017-03-09 18:00:00"},{"dt":1489093200,"main":{"temp":12.04,"temp_min":12.04,"temp_max":12.04,"pressure":1020.53,"sea_level":1029.67,"grnd_level":1020.53,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":1.58,"deg":355.001},"rain":{"3h":1.19},"sys":{"pod":"n"},"dt_txt":"2017-03-09 21:00:00"},{"dt":1489104000,"main":{"temp":12.38,"temp_min":12.38,"temp_max":12.38,"pressure":1021.88,"sea_level":1031,"grnd_level":1021.88,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":1.81,"deg":12.0041},"rain":{"3h":0.62},"sys":{"pod":"d"},"dt_txt":"2017-03-10 00:00:00"},{"dt":1489114800,"main":{"temp":14.58,"temp_min":14.58,"temp_max":14.58,"pressure":1022.15,"sea_level":1031.33,"grnd_level":1022.15,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":1.89,"deg":20.502},"rain":{"3h":0.32},"sys":{"pod":"d"},"dt_txt":"2017-03-10 03:00:00"},{"dt":1489125600,"main":{"temp":19.26,"temp_min":19.26,"temp_max":19.26,"pressure":1019.68,"sea_level":1028.7,"grnd_level":1019.68,"humidity":86,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":1.62,"deg":87.5078},"rain":{"3h":0.069999999999997},"sys":{"pod":"d"},"dt_txt":"2017-03-10 06:00:00"},{"dt":1489136400,"main":{"temp":20.86,"temp_min":20.86,"temp_max":20.86,"pressure":1017.75,"sea_level":1026.77,"grnd_level":1017.75,"humidity":83,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":3.01,"deg":141.505},"rain":{"3h":0.1},"sys":{"pod":"d"},"dt_txt":"2017-03-10 09:00:00"},{"dt":1489147200,"main":{"temp":18.7,"temp_min":18.7,"temp_max":18.7,"pressure":1018.29,"sea_level":1027.26,"grnd_level":1018.29,"humidity":92,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":3.81,"deg":137.001},"rain":{"3h":0.29},"sys":{"pod":"n"},"dt_txt":"2017-03-10 12:00:00"},{"dt":1489158000,"main":{"temp":17.9,"temp_min":17.9,"temp_max":17.9,"pressure":1019.52,"sea_level":1028.49,"grnd_level":1019.52,"humidity":94,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":4.02,"deg":136},"rain":{"3h":0.19},"sys":{"pod":"n"},"dt_txt":"2017-03-10 15:00:00"},{"dt":1489168800,"main":{"temp":17.38,"temp_min":17.38,"temp_max":17.38,"pressure":1019.01,"sea_level":1027.95,"grnd_level":1019.01,"humidity":95,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":3.46,"deg":131.006},"rain":{"3h":0.13},"sys":{"pod":"n"},"dt_txt":"2017-03-10 18:00:00"},{"dt":1489179600,"main":{"temp":16.83,"temp_min":16.83,"temp_max":16.83,"pressure":1017.61,"sea_level":1026.75,"grnd_level":1017.61,"humidity":96,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":88},"wind":{"speed":2.5,"deg":123.002},"rain":{"3h":0.1},"sys":{"pod":"n"},"dt_txt":"2017-03-10 21:00:00"},{"dt":1489190400,"main":{"temp":17.78,"temp_min":17.78,"temp_max":17.78,"pressure":1018.93,"sea_level":1027.87,"grnd_level":1018.93,"humidity":97,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":2.61,"deg":134.501},"rain":{"3h":0.32},"sys":{"pod":"d"},"dt_txt":"2017-03-11 00:00:00"},{"dt":1489201200,"main":{"temp":21.41,"temp_min":21.41,"temp_max":21.41,"pressure":1019.21,"sea_level":1028.11,"grnd_level":1019.21,"humidity":87,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":64},"wind":{"speed":3.92,"deg":140.003},"rain":{"3h":0.23},"sys":{"pod":"d"},"dt_txt":"2017-03-11 03:00:00"},{"dt":1489212000,"main":{"temp":25.11,"temp_min":25.11,"temp_max":25.11,"pressure":1016.44,"sea_level":1025.33,"grnd_level":1016.44,"humidity":72,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":24},"wind":{"speed":5.26,"deg":160.501},"rain":{"3h":0.029999999999998},"sys":{"pod":"d"},"dt_txt":"2017-03-11 06:00:00"},{"dt":1489222800,"main":{"temp":25.27,"temp_min":25.27,"temp_max":25.27,"pressure":1014.58,"sea_level":1023.37,"grnd_level":1014.58,"humidity":68,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"02d"}],"clouds":{"all":8},"wind":{"speed":5.27,"deg":177.002},"rain":{},"sys":{"pod":"d"},"dt_txt":"2017-03-11 09:00:00"},{"dt":1489233600,"main":{"temp":22.18,"temp_min":22.18,"temp_max":22.18,"pressure":1015.39,"sea_level":1024.19,"grnd_level":1015.39,"humidity":78,"temp_kf":0},"weather":[{"id":801,"main":"Clouds","description":"few clouds","icon":"02n"}],"clouds":{"all":24},"wind":{"speed":4.31,"deg":175},"rain":{},"sys":{"pod":"n"},"dt_txt":"2017-03-11 12:00:00"},{"dt":1489244400,"main":{"temp":20.03,"temp_min":20.03,"temp_max":20.03,"pressure":1016.28,"sea_level":1025.06,"grnd_level":1016.28,"humidity":92,"temp_kf":0},"weather":[{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03n"}],"clouds":{"all":36},"wind":{"speed":3.61,"deg":160.501},"rain":{},"sys":{"pod":"n"},"dt_txt":"2017-03-11 15:00:00"},{"dt":1489255200,"main":{"temp":20.01,"temp_min":20.01,"temp_max":20.01,"pressure":1015.21,"sea_level":1024.16,"grnd_level":1015.21,"humidity":96,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":1.87,"deg":157.501},"rain":{"3h":0.16},"sys":{"pod":"n"},"dt_txt":"2017-03-11 18:00:00"},{"dt":1489266000,"main":{"temp":20,"temp_min":20,"temp_max":20,"pressure":1014.39,"sea_level":1023.28,"grnd_level":1014.39,"humidity":97,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":68},"wind":{"speed":1.55,"deg":149.001},"rain":{"3h":0.26},"sys":{"pod":"n"},"dt_txt":"2017-03-11 21:00:00"}]
     * city : {"id":1809858,"name":"Guangzhou","coord":{"lat":23.1167,"lon":113.25},"country":"CN"}
     */

    private String cod;
    private double message;
    private int cnt;
    private CityBean city;
    private List<ListBean> list;

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public double getMessage() {
        return message;
    }

    public void setMessage(double message) {
        this.message = message;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public CityBean getCity() {
        return city;
    }

    public void setCity(CityBean city) {
        this.city = city;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class CityBean {
        /**
         * id : 1809858
         * name : Guangzhou
         * coord : {"lat":23.1167,"lon":113.25}
         * country : CN
         */

        private int id;
        private String name;
        private CoordBean coord;
        private String country;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public CoordBean getCoord() {
            return coord;
        }

        public void setCoord(CoordBean coord) {
            this.coord = coord;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public static class CoordBean {
            /**
             * lat : 23.1167
             * lon : 113.25
             */

            private double lat;
            private double lon;

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLon() {
                return lon;
            }

            public void setLon(double lon) {
                this.lon = lon;
            }
        }
    }

    public static class ListBean {
        /**
         * dt : 1488855600
         * main : {"temp":14.82,"temp_min":13.89,"temp_max":14.82,"pressure":1023.32,"sea_level":1032.48,"grnd_level":1023.32,"humidity":100,"temp_kf":0.93}
         * weather : [{"id":501,"main":"Rain","description":"moderate rain","icon":"10d"}]
         * clouds : {"all":92}
         * wind : {"speed":2.56,"deg":33.5081}
         * rain : {"3h":4.195}
         * sys : {"pod":"d"}
         * dt_txt : 2017-03-07 03:00:00
         */

        private int dt;
        private MainBean main;
        private CloudsBean clouds;
        private WindBean wind;
        private RainBean rain;
        private SysBean sys;
        private String dt_txt;
        private List<WeatherBean> weather;

        public int getDt() {
            return dt;
        }

        public void setDt(int dt) {
            this.dt = dt;
        }

        public MainBean getMain() {
            return main;
        }

        public void setMain(MainBean main) {
            this.main = main;
        }

        public CloudsBean getClouds() {
            return clouds;
        }

        public void setClouds(CloudsBean clouds) {
            this.clouds = clouds;
        }

        public WindBean getWind() {
            return wind;
        }

        public void setWind(WindBean wind) {
            this.wind = wind;
        }

        public RainBean getRain() {
            return rain;
        }

        public void setRain(RainBean rain) {
            this.rain = rain;
        }

        public SysBean getSys() {
            return sys;
        }

        public void setSys(SysBean sys) {
            this.sys = sys;
        }

        public String getDt_txt() {
            return dt_txt;
        }

        public void setDt_txt(String dt_txt) {
            this.dt_txt = dt_txt;
        }

        public List<WeatherBean> getWeather() {
            return weather;
        }

        public void setWeather(List<WeatherBean> weather) {
            this.weather = weather;
        }

        public static class MainBean {
            /**
             * temp : 14.82
             * temp_min : 13.89
             * temp_max : 14.82
             * pressure : 1023.32
             * sea_level : 1032.48
             * grnd_level : 1023.32
             * humidity : 100
             * temp_kf : 0.93
             */

            private double temp;
            private double temp_min;
            private double temp_max;
            private double pressure;
            private double sea_level;
            private double grnd_level;
            private int humidity;
            private double temp_kf;

            public double getTemp() {
                return temp;
            }

            public void setTemp(double temp) {
                this.temp = temp;
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

            public double getPressure() {
                return pressure;
            }

            public void setPressure(double pressure) {
                this.pressure = pressure;
            }

            public double getSea_level() {
                return sea_level;
            }

            public void setSea_level(double sea_level) {
                this.sea_level = sea_level;
            }

            public double getGrnd_level() {
                return grnd_level;
            }

            public void setGrnd_level(double grnd_level) {
                this.grnd_level = grnd_level;
            }

            public int getHumidity() {
                return humidity;
            }

            public void setHumidity(int humidity) {
                this.humidity = humidity;
            }

            public double getTemp_kf() {
                return temp_kf;
            }

            public void setTemp_kf(double temp_kf) {
                this.temp_kf = temp_kf;
            }
        }

        public static class CloudsBean {
            /**
             * all : 92
             */

            private int all;

            public int getAll() {
                return all;
            }

            public void setAll(int all) {
                this.all = all;
            }
        }

        public static class WindBean {
            /**
             * speed : 2.56
             * deg : 33.5081
             */

            private double speed;
            private double deg;

            public double getSpeed() {
                return speed;
            }

            public void setSpeed(double speed) {
                this.speed = speed;
            }

            public double getDeg() {
                return deg;
            }

            public void setDeg(double deg) {
                this.deg = deg;
            }
        }

        public static class RainBean {
            /**
             * 3h : 4.195
             */

            @com.google.gson.annotations.SerializedName("3h")
            private double _$3h;

            public double get_$3h() {
                return _$3h;
            }

            public void set_$3h(double _$3h) {
                this._$3h = _$3h;
            }
        }

        public static class SysBean {
            /**
             * pod : d
             */

            private String pod;

            public String getPod() {
                return pod;
            }

            public void setPod(String pod) {
                this.pod = pod;
            }
        }

        public static class WeatherBean {
            /**
             * id : 501
             * main : Rain
             * description : moderate rain
             * icon : 10d
             */

            private int id;
            private String main;
            private String description;
            private String icon;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getMain() {
                return main;
            }

            public void setMain(String main) {
                this.main = main;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }
        }
    }
}
