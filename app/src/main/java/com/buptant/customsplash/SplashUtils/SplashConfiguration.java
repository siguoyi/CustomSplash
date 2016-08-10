package com.buptant.customsplash.SplashUtils;

import android.support.v4.view.ViewPager;

import com.buptant.customsplash.animation.RotateDownPageTransformer;
import com.buptant.customsplash.animation.ZoomOutPageTransformer;

/**
 * Created by lei on 2016/8/11.
 */
public class SplashConfiguration {

    public static final String ROATTE_TRANSFORM = "rotateTransform";
    public static final String ZOOM_TRANSFORM = "zoomTransform";

    public ViewPager.PageTransformer transformType;

    public ViewPager.PageTransformer getTransformType() {
        return transformType;
    }

    public void setTransformType(String transformType) {
        if(transformType.equals(ROATTE_TRANSFORM)){
            this.transformType = new RotateDownPageTransformer();
        }else if(transformType.equals(ZOOM_TRANSFORM)){
            this.transformType = new ZoomOutPageTransformer();
        }
    }
}
