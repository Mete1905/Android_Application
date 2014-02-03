package com.serefakyuz.com.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class UserInfosFragment extends Fragment{

	public EditText etFirstName;
	public EditText etSecondName;
	public EditText etAge;
	public EditText etLocation;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View viewUserInfos = inflater.inflate(R.layout.fragment_user_infos, container, false);
		
		etFirstName = (EditText) viewUserInfos.findViewById(R.id.et_name);
		etSecondName = (EditText) viewUserInfos.findViewById(R.id.et_secondName);
		etAge = (EditText) viewUserInfos.findViewById(R.id.et_age);
		etLocation = (EditText) viewUserInfos.findViewById(R.id.et_location);
		
		return viewUserInfos;
	}
}
