package me.bemind.customfont;

import android.app.Application;

import me.bemind.customfontlibrary.FontUtil;

/**
 * Created by angelomoroni on 16/08/17.
 */

public class CustomApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        FontUtil.getInstance()
                .setFont(FontUtil.FontStyle.LIGHT,"Muli-Light.ttf")
                .setFont(FontUtil.FontStyle.REGULAR,"Muli-Regular.ttf")
                .setFont(FontUtil.FontStyle.SEMIBOLD,"Muli-SemiBold.ttf")
                .setFont(FontUtil.FontStyle.BOLD,"Muli-Bold.ttf")
                .setFont(FontUtil.FontStyle.LIGHT_ITALIC,"Muli-LightItalic.ttf")
                .setFont(FontUtil.FontStyle.REGULAR_ITALIC,"Muli-Italic.ttf")
                .setFont(FontUtil.FontStyle.BLACK,"Muli-Black.ttf")
                .setFont(FontUtil.FontStyle.EXTRABOLD,"Muli-ExtraBold.ttf");
    }
}
