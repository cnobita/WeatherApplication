package com.cyx.weatherapplication.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by cyx623823 on 2017/4/20.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
