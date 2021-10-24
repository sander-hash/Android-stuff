package com.example.myapp;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;



import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;


public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    private Button button;

    public static final String EXTRA_TEXT = "com.example.myapp.EXTRA_TEXT";
    FirstFragment firstFragment = new FirstFragment();
    SecondFragment secondFragment = new SecondFragment();
    ThirdFragment thirdFragment = new ThirdFragment();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        FloatingActionButton fab = findViewById(R.id.bottomNavigationView);
//        final View v = findViewById(android.R.id.content);
//        Snackbar snackbar = Snackbar.make(v, "Welkom terug gebruiker!", Snackbar.LENGTH_LONG);
//        snackbar.setAnchorView(fab);
//        snackbar.show();


        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.firstFragment);

    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.home:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView, firstFragment).commit();
                return true;

            case R.id.games:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView, secondFragment).commit();
                return true;

            case R.id.maps:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView, thirdFragment).commit();
                return true;
        }
        return false;

    }























    public void openSecondActivity() {
//        EditText editTextTextPersonName = (EditText) findViewById(R.id.editTextTextPersonName);
//        String text = editTextTextPersonName.getText().toString();
//        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
//        intent.putExtra(EXTRA_TEXT, text);
//
//        startActivity(intent);

    }



    }
