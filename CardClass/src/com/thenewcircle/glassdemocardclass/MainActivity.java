package com.thenewcircle.glassdemocardclass;

import android.app.Activity;
import android.os.Bundle;

import com.google.android.glass.app.Card;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
    	final Card card = new Card(this);
    	card.setText("Hello World!");
    	card.addImage(R.drawable.ic_launcher);
    	setContentView(card.getView()); 
	}
}
