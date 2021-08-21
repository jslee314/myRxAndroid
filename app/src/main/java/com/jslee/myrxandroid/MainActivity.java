package com.jslee.myrxandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.jslee.myrxandroid.fragments.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(android.R.id.content, new MainFragment(), MainFragment.TAG)
                    .commit();

        }

    }
}