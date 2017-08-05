package com.example.admin.datapersistance;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    private static final String MY_PREF_FILE = "mypref_file";
    private static final String TAG = "lifecycle_Second";

    TextView tv1,tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv1 = (TextView) findViewById(R.id.tvOne);
        tv2 = (TextView) findViewById(R.id.tvTwo);

        SharedPreferences sharedPreferences = getSharedPreferences(MY_PREF_FILE, Context.MODE_PRIVATE);
        tv1.setText(sharedPreferences.getString("value1", "default"));
        tv2.setText(sharedPreferences.getString("value2", "default"));
        Log.d(TAG, "getData: "+ sharedPreferences.getString("value1", "default"));

        Toast.makeText(this, "Hold", Toast.LENGTH_SHORT).show();

    }
}
