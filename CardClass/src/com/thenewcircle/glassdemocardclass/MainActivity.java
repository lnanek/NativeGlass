package com.thenewcircle.glassdemocardclass;

import com.google.android.glass.app.Card;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
    	final Card card = new Card(this);
    	card.setText("Hello World!");
    	setContentView(card.getView()); 
	}
}
