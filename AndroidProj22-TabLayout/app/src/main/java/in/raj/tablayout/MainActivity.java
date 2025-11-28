package in.raj.tablayout;

import android.os.Bundle;
import android.widget.FrameLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.tabs.TabLayout;

import in.raj.R;
import in.raj.fragment.FragmentOne;
import in.raj.fragment.FragmentThree;
import in.raj.fragment.FragmentTwo;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayoutOne;
    FrameLayout frameLayoutOne;


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

        tabLayoutOne =(TabLayout) findViewById(R.id.tabLayoutOne);
        frameLayoutOne =(FrameLayout) findViewById(R.id.frameLayoutOne);

        TabLayout.Tab firstTab = tabLayoutOne.newTab();
        firstTab.setText("Chat");
        firstTab.setIcon(R.drawable.chat);
        tabLayoutOne.addTab(firstTab);
        TabLayout.Tab secondTab = tabLayoutOne.newTab();
        secondTab.setText("Status");
        secondTab.setIcon(R.drawable.status);
        tabLayoutOne.addTab(secondTab);
        TabLayout.Tab thirdTab = tabLayoutOne.newTab();
        thirdTab.setText("Call");
        thirdTab.setIcon(R.drawable.call);
        tabLayoutOne.addTab(thirdTab);
        FragmentOne fragmentOne = new FragmentOne();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayoutOne, fragmentOne);
        fragmentTransaction.commit();

        tabLayoutOne.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Fragment fragment=null;
                switch (tab.getPosition()){
                    case 0:
                        fragment = new FragmentOne();
                        break;
                    case 1:
                        fragment = new FragmentTwo();
                        break;
                    case 2:
                        fragment = new FragmentThree();
                        break;
                    default:
                        fragment = new FragmentOne();
                        break;
                }
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayoutOne,fragment);
                fragmentTransaction.commit();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }
}