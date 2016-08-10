package com.buptant.customsplash.pagertransformer;

import java.util.ArrayList;
import java.util.List;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Window;

import com.buptant.customsplash.R;
import com.buptant.customsplash.SplashUtils.SplashConfiguration;
import com.buptant.customsplash.animation.RotateDownPageTransformer;
import com.buptant.customsplash.animation.ZoomOutPageTransformer;

/**
 * ViewPager 引导
 *
 */
public class ViewPagerActivity extends FragmentActivity {

	private ViewPager mVPActivity;
	private Fragment1 mFragment1;
	private Fragment2 mFragment2;
	private Fragment3 mFragment3;
	private Fragment4 mFragment4;
	private List<Fragment> mListFragment = new ArrayList<Fragment>();
	private PagerAdapter mPgAdapter;

	private SplashConfiguration splashConfiguration;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_viewpager);

		splashConfiguration = new SplashConfiguration();

		initView();
		initTransformType();
	}

	private void initTransformType(){
		splashConfiguration.setTransformType(SplashConfiguration.ROATTE_TRANSFORM);
	}

	private void initView() {
		mVPActivity = (ViewPager) findViewById(R.id.vp_activity);
		mFragment1 = new Fragment1();
		mFragment2 = new Fragment2();
		mFragment3 = new Fragment3();
		mFragment4 = new Fragment4();
		mListFragment.add(mFragment1);
		mListFragment.add(mFragment2);
		mListFragment.add(mFragment3);
		mListFragment.add(mFragment4);
		/**
		 * 传递两个参数
		 */
		mPgAdapter = new ViewPagerAdapter(getSupportFragmentManager(),
				mListFragment);
		mVPActivity.setAdapter(mPgAdapter);
		mVPActivity.setPageTransformer(true, splashConfiguration.getTransformType());
//		mVPActivity.setPageTransformer(true, new ZoomOutPageTransformer());
//		mVPActivity.setPageTransformer(true, new RotateDownPageTransformer());
//		mVPActivity.setPageTransformer(false, new ViewPager.PageTransformer() {
//
//			@Override
//			public void transformPage(View page, float position) {
//				final float normalizedposition = Math.abs(Math.abs(position) - 1);
//			    page.setScaleX(normalizedposition / 2 + 0.5f);
//			    page.setScaleY(normalizedposition / 2 + 0.5f);
//			}
//		});
	}
}


