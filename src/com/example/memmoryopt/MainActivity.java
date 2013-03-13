package com.example.memmoryopt;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends Activity {
	
	public static LeakClass leak; 

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		if(leak == null){
			leak = new LeakClass();
		}
		ImageView imageView = new ImageView(this);
		imageView.setImageResource(R.drawable.about_company_log_buttom);
		setContentView(imageView);
	}
	
	class LeakClass{
		int someInt;
	}

}
