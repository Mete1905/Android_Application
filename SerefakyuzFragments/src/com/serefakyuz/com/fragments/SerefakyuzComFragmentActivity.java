package com.serefakyuz.com.fragments;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class SerefakyuzComFragmentActivity extends FragmentActivity {


	Button btnSignup;
	
	UserInfosFragment userInfosFragment;
	UserDetailsFragment userDetailsFragment;
	
	String firstName = "";
	String secondName = "";
	String age = "";
	String location = "";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.serefakyuz_com_main_activity);
		
		// Fragment yer değişimi için gerekli nesneler oluşturuluyor
		FragmentManager fragmentManager = getSupportFragmentManager();
		FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
		
		userInfosFragment = new UserInfosFragment();
		//serefakyuz_com_main_activity içinde bulunan linearlayout içine fragment nesnesinin aktarılması işlemi tanımlanıyor
		fragmentTransaction.replace(R.id.user_infosFragment, userInfosFragment);
		
		userDetailsFragment = new UserDetailsFragment();
		//serefakyuz_com_main_activity içinde bulunan linearlayout içine fragment nesnesinin aktarılması işlemi tanımlanıyor
		fragmentTransaction.replace(R.id.user_detailsFragment, userDetailsFragment);
		// yer değiştirme işlemleri uygulanıyor
		fragmentTransaction.commit();

		btnSignup = (Button) findViewById(R.id.btn_signup);
		btnSignup.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(getFieldStrings())
				{
					setDetailsFieldStrings();
				}else{
					Toast.makeText(getApplicationContext(), getString(R.string.fields_should_be_filled), Toast.LENGTH_SHORT).show();
				}
			}
		});
	}

	private boolean getFieldStrings()
	{
		firstName = userInfosFragment.etFirstName.getText().toString();
		secondName = userInfosFragment.etSecondName.getText().toString();
		age = userInfosFragment.etAge.getText().toString();
		location = userInfosFragment.etLocation.getText().toString();
		if(firstName.equals("") || secondName.equals("") || age.equals("") || location.equals("")){
			return false;
		}else{
			return true;
		}
	}
	private void setDetailsFieldStrings()
	{
		userDetailsFragment.tvFirstName.setText(firstName);
		userDetailsFragment.tvSecondName.setText(secondName);
		userDetailsFragment.tvAge.setText(age);
		userDetailsFragment.tvLocation.setText(location);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.serefakyuz_com, menu);
		return true;
	}
	
}
