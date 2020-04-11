package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zhaokai on 2020/4/9.
 */

public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Temperature temperature;
    public class Temperature{
        public String max;
        public String min;
    }
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
