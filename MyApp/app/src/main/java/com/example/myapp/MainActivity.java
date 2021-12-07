package com.example.myapp;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;


import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    private Button button;

    public static final String EXTRA_TEXT = "com.example.myapp.EXTRA_TEXT";
    FirstFragment firstFragment = new FirstFragment();
    SecondFragment secondFragment = new SecondFragment();
    ThirdFragment thirdFragment = new ThirdFragment();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.firstFragment);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView, new FirstFragment()).commit();

        View v = findViewById(R.id.coordinatorLayout);


        ViewTreeObserver vto = v.getViewTreeObserver();
        vto.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                    v.getViewTreeObserver()
                            .removeOnGlobalLayoutListener(this);
                }else{
                    v.getViewTreeObserver()
                            .removeOnGlobalLayoutListener(this);
                }
                Snackbar snackbar = Snackbar.make(v, "Welkom terug gebruiker!", Snackbar.LENGTH_LONG);
                snackbar.setAnchorView(bottomNavigationView);
                snackbar.show();

            }

        });


    }


    public void openSecondActivity(View view) {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
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


            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView, firstFragment).commit();
            return true;

    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.settings_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                Intent launchNewIntent = new Intent(MainActivity.this,SettingsActivity.class);
                startActivityForResult(launchNewIntent, 0);
                return true;
            case R.id.item2:
                Toast.makeText(this, "Item 2 selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item3:
                Toast.makeText(this, "Item 3 selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.subitem1:
                Toast.makeText(this, "Sub Item 1 selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.subitem2:
                Toast.makeText(this, "Sub Item 2 selected", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public class array {


        public void main(String[] args)
        {

            ArrayList<String> array = new ArrayList<String>();
            EditText editTextArray = (EditText) findViewById(R.id.editText);
            String editText = editTextArray.getText().toString();
            array.add(editText);

            // je zou nu de array kunnen printen met System.out.print(array);
        }
    }

    public void whileLoop(){
        int w = 0;
        while (w < 5) {
            w++;
            // Hier zou je het kunnen uitprinten met System.out.println(w);
        }
    }

    public void forLoop(){
        for (int f = 0; f < 5; f++) {
            // Hier zou je het kunnen uitprinten met System.out.println(f);
        }
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
