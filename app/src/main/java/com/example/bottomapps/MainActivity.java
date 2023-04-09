package com.example.bottomapps;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.AdapterView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    HomeFragment homeFragment = new HomeFragment();
    MenuFragment menuFragment = new MenuFragment();
    KuponFragment kuponFragment = new KuponFragment();
    UserFragment userFragment = new UserFragment();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.btm_navi);

        getSupportFragmentManager().beginTransaction().replace(R.id.container, homeFragment).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, homeFragment).commit();
                        return true;

                    case R.id.menu:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, menuFragment).commit();
                        return true;

                    case R.id.kupon:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, kuponFragment).commit();
                        return true;

                    case R.id.user:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, userFragment).commit();
                        return true;


                }
                return false;
            }
        });
    }
}