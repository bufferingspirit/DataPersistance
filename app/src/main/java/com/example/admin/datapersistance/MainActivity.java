package com.example.admin.datapersistance;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String MY_PREF_FILE = "mypref_file";
    private static final String TAG = "LifeCycle_Main" ;
    EditText editText1, editText2;
    TextView tv1, tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = (EditText) findViewById(R.id.etVal1);
        editText2 = (EditText) findViewById(R.id.etVal2);
        tv1 = (TextView) findViewById(R.id.tvOne);
        tv2 = (TextView) findViewById(R.id.tvTwo);

        Log.d(TAG, "onCreate: ");

    }

    public void saveData(View view){
        SharedPreferences sharedPreferences = getSharedPreferences(MY_PREF_FILE, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString("value1", editText1.getText().toString());
        editor.putString("value2", editText2.getText().toString());
        editor.commit();

    }
    public void getData(View view){

        SharedPreferences sharedPreferences = getSharedPreferences(MY_PREF_FILE, Context.MODE_PRIVATE);
        tv1.setText(sharedPreferences.getString("value1", "default"));
        tv2.setText(sharedPreferences.getString("value2", "default"));
        Log.d(TAG, "getData: "+ sharedPreferences.getString("value1", "default"));
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        if(newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE)
            Toast.makeText(this, "Landscape", Toast.LENGTH_SHORT).show();
        if(newConfig.orientation == Configuration.ORIENTATION_PORTRAIT)
            Toast.makeText(this, "Potrait", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
