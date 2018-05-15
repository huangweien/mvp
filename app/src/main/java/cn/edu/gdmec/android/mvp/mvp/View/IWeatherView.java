package cn.edu.gdmec.android.mvp.mvp.View;

import cn.edu.gdmec.android.mvp.mvp.WeatherBean;

/**
 * Created by apple on 18/5/15.
 */

public interface IWeatherView {
    void showProgress();
    void hideProgress();
    void showWeatherData(WeatherBean weatherBean);
    void showLoadFailMsg(Exception e);
}
