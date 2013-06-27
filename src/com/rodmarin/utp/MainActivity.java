package com.rodmarin.utp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.net.Uri;
import android.content.Intent;


public class MainActivity extends Activity {

	    
private ImageButton imageButton1;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		imageButton1 = (ImageButton) findViewById(R.id.imageButton1);
		imageButton1.setOnClickListener(new OnClickListener() 
		{

		    @Override
		    public void onClick(View v) 
		    {
		    	Intent browserIntent = 
		    		new Intent(Intent.ACTION_VIEW, 
		    				Uri.parse("https://www.facebook.com/utpcolon?fref=ts"));
		    	startActivity(browserIntent);
		    }
		 });

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}


}

