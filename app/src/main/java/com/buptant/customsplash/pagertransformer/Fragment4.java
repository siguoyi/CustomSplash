package com.buptant.customsplash.pagertransformer;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.buptant.customsplash.CustomSplashActivity;
import com.buptant.customsplash.R;

public class Fragment4 extends Fragment {

	private TextView textView;
	private RelativeLayout relativeLayout;
	public static Context context;
	private Class clazz;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		super.onCreateView(inflater, container, savedInstanceState);
		View view = inflater.inflate(R.layout.fragment_4, container, false);
		return view;
	}

	@Override
	public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		textView = (TextView) view.findViewById(R.id.tvInNew);
		relativeLayout = (RelativeLayout) view.findViewById(R.id.rl_fragment4);
		relativeLayout.setBackgroundResource(ViewPagerActivity.bg4);
		textView.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				StartMainActivity();
			}
		});
	}

	private void StartMainActivity(){
		if(context != null){
			clazz = context.getClass();
		}else {
			clazz = CustomSplashActivity.class;
		}
		Intent intent = new Intent(getActivity(), clazz);
		startActivity(intent);
	}
}
