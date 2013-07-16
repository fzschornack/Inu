package com.fbd.inu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class BuscaPalestraActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_busca_palestra);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.busca_palestra, menu);
		return true;
	}

}
