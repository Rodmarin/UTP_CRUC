package com.rodmarin.utp;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.net.Uri;
import android.content.Intent;
import android.widget.Button;


public class MainActivity extends Activity {
	
	Integer[] pics = {
    		R.drawable.images,
    		R.drawable.colon,
    		R.drawable.utp,
    };
    ImageView imageView;

	    
private ImageButton imageButton1;
private Button button2;
private Button button3;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		imageButton1 = (ImageButton) findViewById(R.id.imageButton1);
		imageButton1.setOnClickListener(new OnClickListener() 
		
			{
		    public void onClick(View v) 
		    {
		    	Intent browserIntent = 
		    		new Intent(Intent.ACTION_VIEW, 
		    				Uri.parse("https://www.facebook.com/utpcolon?fref=ts"));
		    	startActivity(browserIntent);
		    	
		    }
			 });			    		
		
		    	/*protected void onCreate(Bundle savedInstanceState) {
					super.onCreate(savedInstanceState);
					setContentView(R.layout.activity_main);*/
					
		    	button3 = (Button) findViewById(R.id.button3);
				button3.setOnClickListener(new OnClickListener()
				
			
					
				{
				    public void onClick(View v) 
				    {
		    	
				{
					Intent browserIntent = 
						new Intent(Intent.ACTION_VIEW, 
							Uri.parse("http://www.co.utp.ac.pa/contactenos"));
					startActivity(browserIntent);		
				}
		    }
		 });
			 	button2 = (Button) findViewById(R.id.button2);
				button2.setOnClickListener(new OnClickListener()
				
			
					
				{
				    public void onClick(View v) 
				    {
		    	
				{
					Intent browserIntent = 
						new Intent(Intent.ACTION_VIEW, 
							Uri.parse("http://www.co.utp.ac.pa/antecedentes"));
					startActivity(browserIntent);		
				}
		    }
		 });
		    }
		}

	
