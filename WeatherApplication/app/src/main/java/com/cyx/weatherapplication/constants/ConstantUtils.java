package com.cyx.weatherapplication.constants;

import com.cyx.weatherapplication.entity.TheCurrentWeatherConditionsThinkPageBean;

/**
 * Created by cyx623823 on 2017/3/7.
 */

// NOTICE 常量工具类

public class ConstantUtils {
    //当前天气情况(OpenWeatherMap)：
    public static final String THE_CURRENT_WEATHER_CONDITIONS_OPENWEATHERMAP_URL = "http://api.openweathermap.org/data/2.5/weather?units=metric&lang=zh_cn&id=1809858&appid=8556d7f9e242732ab0c2671cc31a3379";
    //天气预报(OpenWeatherMap)：
    public static final String THE_WEATHER_FORECAST_OPENWEATHERMAP_URL = "http://api.openweathermap.org/data/2.5/forecast?units=metric&lang=zh_cn&id=1809858&appid=8556d7f9e242732ab0c2671cc31a3379";

    //当前天气情况(ThinkPage)：
    public static final String THE_CURRENT_WEATHER_CONDITIONS_THINKPAGE_URL = "https://api.thinkpage.cn/v3/weather/now.json?key=zkkgfmq8ranbbl8h&location=guangzhou&language=zh-Hans&unit=c";
    //天气预报(ThinkPage): 广州今天和未来4天的预报
    public static final String THE_WEATHER_FORECAST_THINKPAGE_URL = "https://api.thinkpage.cn/v3/weather/daily.json?key=zkkgfmq8ranbbl8h&location=guangzhou&language=zh-Hans&unit=c&start=0&days=5";




    public static final String POST_URL = "http://zhushou.72g.com/app/gift/gift_list/";

private static class SingletonHolder {
    private static final ConstantUtils INSTANCE = new ConstantUtils();
}

    public static final ConstantUtils getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
