package com.example.azia.menu_burgerbtn;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.am_drLayout);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        NavigationView navigationView = findViewById(R.id.am_nav_view);
        navigationView.setNavigationItemSelectedListener(this);


    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {

            return true;
        }


        return super.onOptionsItemSelected(item);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.dm_about_name:
                Toast.makeText(getApplicationContext(), item.getTitle(), Toast.LENGTH_SHORT).show();
                drawerLayout.closeDrawers();
                break;
            case R.id.dm_settings_name:
                Toast.makeText(getApplicationContext(), item.getTitle(), Toast.LENGTH_SHORT).show();
                drawerLayout.closeDrawers();
                break;
        }
        return false;
    }
}
