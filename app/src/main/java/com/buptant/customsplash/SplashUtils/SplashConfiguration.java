package com.buptant.customsplash.SplashUtils;


import com.buptant.customsplash.pagertransformer.Fragment4;
import com.buptant.customsplash.pagertransformer.ViewPagerActivity;

/**
 * Created by lei on 2016/8/11.
 */
public class SplashConfiguration {

    public static final int ROATTE_TRANSFORM = 0;
    public static final int ZOOM_TRANSFORM = 1;

    private Class clazz;
    private int transformType;
    private int[] imgId;

    public SplashConfiguration(Class clazz, int transformType, int[] imgId){
        this.clazz = clazz;
        this.transformType = transformType;
        this.imgId = imgId;
    }

    public void init(){
        Fragment4.clazz = clazz;
        ViewPagerActivity.transformType = transformType;
        ViewPagerActivity.imgId = imgId;
    }
}
