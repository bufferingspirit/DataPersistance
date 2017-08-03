package com.example.admin.datapersistance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    private static final String TAG = "lifecycle_Second";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        Toast.makeText(this, "Hold", Toast.LENGTH_SHORT).show();

    }
}
