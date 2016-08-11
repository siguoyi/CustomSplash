package com.buptant.customsplash.pagertransformer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.buptant.customsplash.R;

public class Fragment1 extends Fragment {

	/**
	 * 是否将root附加到布局文件的根视图上
	 */
	private RelativeLayout relativeLayout;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		super.onCreateView(inflater, container, savedInstanceState);
		View view = inflater.inflate(R.layout.fragment_1, container, false);
		return view;
	}

	@Override
	public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		relativeLayout = (RelativeLayout) view.findViewById(R.id.rl_fragment1);
		relativeLayout.setBackgroundResource(ViewPagerActivity.bg1);
	}
}
