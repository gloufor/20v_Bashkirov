package com.example.bashkirov_v_20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements OnClickListener {


    ImageView Perehod;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Perehod =  findViewById(R.id.Perehod);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, gallery.class);
        startActivity(intent);
    }
}