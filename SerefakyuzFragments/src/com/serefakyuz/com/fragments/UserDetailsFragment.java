package com.serefakyuz.com.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class UserDetailsFragment extends Fragment{

	public TextView tvFirstName;
	public TextView tvSecondName;
	public TextView tvAge;
	public TextView tvLocation;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View viewUserDetails = inflater.inflate(R.layout.fragment_user_details, container, false);
		
		tvFirstName = (TextView)viewUserDetails.findViewById(R.id.TextViewName);
		tvSecondName = (TextView)viewUserDetails.findViewById(R.id.TextViewSecondName);
		tvAge = (TextView)viewUserDetails.findViewById(R.id.TextViewAge);
		tvLocation = (TextView)viewUserDetails.findViewById(R.id.TextViewLocation);
		
		return viewUserDetails;
	}
}
