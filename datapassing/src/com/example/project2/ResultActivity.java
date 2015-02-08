package com.example.project2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ResultActivity extends Activity {

  @Override
  public void onCreate(Bundle bundle) {
	super.onCreate(bundle);
	setContentView(R.layout.activity_result);
    Bundle extras = getIntent().getExtras();
    String value1 = extras.getString("yourkey");
    TextView show=(TextView)findViewById(R.id.displayintentextra);
    show.setText(value1);
  }
  
  public void finish() {
	    
	  // TODO 1 create new Intent 
	  Intent intent = new Intent();
	    
	  // TODO 2 read the data of the EditText field
	  EditText temp=(EditText)findViewById(R.id.returnValue);
	  
	  // TODO 3 put the text from EditText
	  // as String extra into the intent
	  // use editText.getText().toString();
	  String value=temp.getText().toString();
	  intent.putExtra("return", value);
	    
	  // TODO 4 use setResult(RESULT_OK, intent); 
	  // to return the Intent to the application
	  setResult(RESULT_OK, intent);
	  super.finish();
	} 
} 