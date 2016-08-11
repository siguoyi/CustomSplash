package com.buptant.customsplash.SplashUtils;


import android.content.Context;

import com.buptant.customsplash.pagertransformer.Fragment4;
import com.buptant.customsplash.pagertransformer.ViewPagerActivity;

/**
 * Created by lei on 2016/8/11.
 */
public class SplashConfiguration {

    public static final int ROATTE_TRANSFORM = 0;
    public static final int ZOOM_TRANSFORM = 1;

    private Context context;
    private int transformType;
    private int[] imgId;

    public SplashConfiguration(Context context, int transformType, int[] imgId){
        this.context = context;
        this.transformType = transformType;
        this.imgId = imgId;
    }

    public void init(){
        Fragment4.context = context;
        ViewPagerActivity.transformType = transformType;
        ViewPagerActivity.imgId = imgId;
    }
}
