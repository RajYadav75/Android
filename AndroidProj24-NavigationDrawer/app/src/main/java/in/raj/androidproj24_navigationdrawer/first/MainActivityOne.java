package in.raj.androidproj24_navigationdrawer.first;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

import in.raj.androidproj24_navigationdrawer.R;

public class MainActivityOne extends AppCompatActivity {

    Toolbar toolBar;

    NavigationView navigationView;

    DrawerLayout drawerLayout;

    ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_one);

        toolBar =(Toolbar) findViewById(R.id.toolBar);
        setSupportActionBar(toolBar);
        navigationView =(NavigationView) findViewById(R.id.navigationView);
        drawerLayout =(DrawerLayout) findViewById(R.id.drawerLayout);

        toggle = new ActionBarDrawerToggle(this,drawerLayout,toolBar,R.string.open,R.string.close);

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int itemId = menuItem.getItemId(); // Get the ID once

                if (itemId == R.id.home) {
                    Toast.makeText(MainActivityOne.this, "Home Clicked....", Toast.LENGTH_SHORT).show();
                    drawerLayout.closeDrawer(GravityCompat.START);
                } else if (itemId == R.id.myProfile) {
                    Toast.makeText(MainActivityOne.this, "My Profile Clicked....", Toast.LENGTH_SHORT).show();
                    drawerLayout.closeDrawer(GravityCompat.START);
                } else if (itemId == R.id.message) {
                    Toast.makeText(MainActivityOne.this, "Message Clicked....", Toast.LENGTH_SHORT).show();
                    drawerLayout.closeDrawer(GravityCompat.START);
                } else if (itemId == R.id.settings) {
                    Toast.makeText(MainActivityOne.this, "Settings Clicked....", Toast.LENGTH_SHORT).show();
                    drawerLayout.closeDrawer(GravityCompat.START);
                }
                return false;
            }
        });

    }
}