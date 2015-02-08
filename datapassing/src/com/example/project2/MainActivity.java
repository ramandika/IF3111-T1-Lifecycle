package com.example.project2;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
	  private static final int REQUEST_CODE = 10;
	  @Override
	  public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_main);
	  }

	  public void onClick(View view) {
	    EditText text = (EditText) findViewById(R.id.inputforintent);
	    // used later
	    String value = text.getText().toString();
	    // TODO 1 create new Intent(context, class)
	    // use the activity as context parameter
	    // and "ResultActivity.class" for the class parameter
	    Intent inten=new Intent(this,ResultActivity.class);
	    inten.putExtra("yourkey", value);
	    /*// TODO 2 start second activity with
	    startActivity(inten);*/
	    
	    // TODO 2.. now use 
	    startActivityForResult(inten, REQUEST_CODE);
	  }
	  
	  // TODO 3 Implement this method
	  // assumes that "returnkey" is used as key to return the result
	  @Override
	  protected void onActivityResult(int requestCode, int resultCode, Intent data) {
	    if (resultCode == RESULT_OK && requestCode == REQUEST_CODE) {
	      if (data.hasExtra("return")) {
	        String result = data.getExtras().getString("return");
	        if (result != null && result.length() > 0) {
	          Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
	        }
	      }
	    }
	  }

}
