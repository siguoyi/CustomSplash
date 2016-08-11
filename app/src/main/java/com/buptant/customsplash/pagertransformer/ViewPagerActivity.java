package com.buptant.customsplash.pagertransformer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Window;
import android.widget.ImageView;

import com.buptant.customsplash.R;
import com.buptant.customsplash.SplashUtils.SplashConfiguration;
import com.buptant.customsplash.animation.RotateDownPageTransformer;
import com.buptant.customsplash.animation.ZoomOutPageTransformer;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * ViewPager 引导
 */
public class ViewPagerActivity extends FragmentActivity {

    private static final int TAB_1 = 0;
    private static final int TAB_2 = 1;
    private static final int TAB_3 = 2;
    private static final int TAB_4 = 3;
    @BindView(R.id.iv_select1)
    ImageView ivSelect1;
    @BindView(R.id.iv_select2)
    ImageView ivSelect2;
    @BindView(R.id.iv_select3)
    ImageView ivSelect3;
    @BindView(R.id.iv_select4)
    ImageView ivSelect4;

    private ViewPager mVPActivity;
    private Fragment1 mFragment1;
    private Fragment2 mFragment2;
    private Fragment3 mFragment3;
    private Fragment4 mFragment4;
    private List<Fragment> mListFragment = new ArrayList<Fragment>();
    private PagerAdapter mPgAdapter;

    private int mCurrentTab = TAB_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_viewpager);
        ButterKnife.bind(this);
        initView();
        initFragment();
        initTransformType();
    }

    private void initView() {
        ivSelect1.setImageResource(R.drawable.select_selected);
    }

    private void initTransformType() {
        SplashConfiguration.transformType = SplashConfiguration.ZOOM_TRANSFORM;
    }

    private void initFragment() {
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
        mVPActivity.addOnPageChangeListener(new PageChangeListener());
        mVPActivity.setAdapter(mPgAdapter);
        String type = SplashConfiguration.transformType;
        if (type != null) {
            if (type.equals(SplashConfiguration.ROATTE_TRANSFORM)) {
                mVPActivity.setPageTransformer(true, new RotateDownPageTransformer());

            } else if (type.equals(SplashConfiguration.ZOOM_TRANSFORM)) {
                mVPActivity.setPageTransformer(true, new ZoomOutPageTransformer());
            }
        }
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

    private class PageChangeListener implements ViewPager.OnPageChangeListener {

        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        }

        @Override
        public void onPageSelected(int position) {
            mCurrentTab = position;
            changeSelectStatus(mCurrentTab);
        }

        @Override
        public void onPageScrollStateChanged(int state) {
        }

    }

    private void changeSelectStatus(int tabId) {
        ivSelect1.setImageResource(R.drawable.select_normal);
        ivSelect2.setImageResource(R.drawable.select_normal);
        ivSelect3.setImageResource(R.drawable.select_normal);
        ivSelect4.setImageResource(R.drawable.select_normal);

        switch (tabId){
            case TAB_1:
                ivSelect1.setImageResource(R.drawable.select_selected);
                break;
            case TAB_2:
                ivSelect2.setImageResource(R.drawable.select_selected);
                break;
            case TAB_3:
                ivSelect3.setImageResource(R.drawable.select_selected);
                break;
            case TAB_4:
                ivSelect4.setImageResource(R.drawable.select_selected);
                break;
        }
    }
}


