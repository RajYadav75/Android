package in.raj.tablayout;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;

import in.raj.R;
import in.raj.adapter.WhatsappAdapter;

public class MainActivity2 extends AppCompatActivity {

    TabLayout tabLayoutTwo;
    ViewPager2 viewPagerTwo;

    String[] names= {"Raj","Deepak","Ambrikesh","Ankita","Baba Yaga"};
    int[] images={R.drawable.lion,R.drawable.elephant,R.drawable.bear,R.drawable.rabbit,R.drawable.zebra};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        tabLayoutTwo = (TabLayout) findViewById(R.id.tabLayoutTwo);
        viewPagerTwo = (ViewPager2) findViewById(R.id.viewPagerTwo);


        WhatsappAdapter whatsappAdapter = new WhatsappAdapter(getSupportFragmentManager(),getLifecycle());
        viewPagerTwo.setAdapter(whatsappAdapter);


    }
}