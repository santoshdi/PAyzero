package com.example.payzero;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
private  CardView cardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);

    cardView=(CardView)findViewById(R.id.cardphone);
    cardView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent=new Intent(MainActivity.this,Mobile.class);
            startActivity(intent);

        }
    });
    }}