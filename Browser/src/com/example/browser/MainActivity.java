package com.example.browser;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_main);
	  }
	public void onClick(View view){
		 Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.google.com"));
		 startActivity(intent); 
	 }
}
