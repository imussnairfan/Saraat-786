package com.example.project_saraat;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import static com.example.project_saraat.R.id.nav_home;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    FrameLayout frameLayout;
    BottomNavigationView bottomNavigationView;

    DrawerLayout drawerLayout;
    androidx.appcompat.widget.Toolbar toolbar;

    NavigationView navigationView;
    LinearLayout contentView;

    @SuppressLint("ResourceAsColor")
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setStatusBarColor(android.R.color.transparent);

        frameLayout = findViewById(R.id.container);
        bottomNavigationView = findViewById(R.id.bottom_nav_id);
        toolbar = findViewById(R.id.toolbar);
        navigationView = findViewById(R.id.drawer_nav_id);
        drawerLayout = findViewById(R.id.drawer_layout);
        contentView = findViewById(R.id.content);

        setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);

        getSupportFragmentManager().beginTransaction().add(R.id.container,new Home_frag()).commit();

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;
                switch(item.getItemId()){
                    case R.id.home_nav_id:
                        fragment = new Home_frag();
                        break;
                    case R.id.concepts_nav_id:
                        fragment = new Concepts_frag();
                        break;
                    case R.id.supplications_nav_id:
                        fragment = new Supplications_frag();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).commit();
                return true;
            }
        });

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;
        switch(item.getItemId()){
            case R.id.nav_home:
                drawerLayout.setScrimColor(getResources().getColor(R.color.grey_200));
                fragment = new Home_frag();
                break;
            case R.id.nav_concepts:
                drawerLayout.setScrimColor(getResources().getColor(R.color.grey_200));
                fragment = new Concepts_frag();
                break;
            case R.id.nav_supplications:
                drawerLayout.setScrimColor(getResources().getColor(R.color.grey_200));
                fragment = new Supplications_frag();
                break;
            case R.id.nav_about:
                Intent intent_1 = new Intent(this,onboarding.class);
                startActivity(intent_1);
                fragment = new Home_frag();
                break;
            case R.id.nav_contact:
                Intent intent_2 = new Intent(this,Contact_Us.class);
                startActivity(intent_2);
                fragment = new Home_frag();
                break;
        }
        getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).commit();

        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else {
            super.onBackPressed();
        }
    }
}