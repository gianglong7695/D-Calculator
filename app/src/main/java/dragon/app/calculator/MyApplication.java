package dragon.app.calculator;

import android.app.Application;

import dragon.app.calculator.utils.TypefaceUtil;

/**
 * Created by VCCORP on 11/23/2017.
 */

public class MyApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        TypefaceUtil.overrideFont(getApplicationContext(), "SERIF", "OpenSans-Light.ttf"); // font from assets: "assets/Roboto-Regular.ttf
    }
}
