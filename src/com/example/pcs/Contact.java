package com.example.pcs;

import com.actionbarsherlock.app.SherlockFragment;
import com.example.pcs.R;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Contact extends SherlockFragment{

	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.contacts, container, false);
		return view;
	}

}