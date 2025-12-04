package in.raj.androidproj23_bottomnavigationmenu;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import in.raj.androidproj23_bottomnavigationmenu.fragment.Message;
import in.raj.androidproj23_bottomnavigationmenu.fragment.MyProfile;
import in.raj.androidproj23_bottomnavigationmenu.fragment.Setting;
import in.raj.androidproj23_bottomnavigationmenu.fragment.home;

public class MainActivity extends AppCompatActivity {

    FrameLayout frameLayoutOne;
    BottomNavigationView buttonNavigationOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        frameLayoutOne = (FrameLayout) findViewById(R.id.frameLayoutOne);
        buttonNavigationOne = (BottomNavigationView) findViewById(R.id.buttonNavigationOne);

        buttonNavigationOne.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment selectedFragment = null;
                int itemId = menuItem.getItemId();

                if (itemId == R.id.home) {
                    selectedFragment = new home();
                } else if (itemId == R.id.setting) {
                    selectedFragment = new Setting();
                } else if (itemId == R.id.myProfile) {
                    selectedFragment = new MyProfile();
                } else if (itemId == R.id.message) {
                    selectedFragment = new Message();
                }

                if (selectedFragment != null) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.frameLayoutOne, selectedFragment).commit();
                }

                return true;
            }
        });
    }
}