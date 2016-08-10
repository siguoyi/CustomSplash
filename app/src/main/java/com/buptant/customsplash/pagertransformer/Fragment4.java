package com.buptant.customsplash.pagertransformer;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.buptant.customsplash.CustomSplashActivity;
import com.buptant.customsplash.R;

public class Fragment4 extends Fragment {

	private TextView textView;

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
		textView.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				StartMainActivity();
			}
		});
	}

	private void StartMainActivity(){
		Intent intent = new Intent(getActivity(), CustomSplashActivity.class);
		startActivity(intent);
	}
}
