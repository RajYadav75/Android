package in.raj.androidproj19_animationandthirdpartylibrary.batterylayout;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import in.raj.androidproj19_animationandthirdpartylibrary.R;

public class BatteryAnimationActivity extends AppCompatActivity {

    ImageView batteryImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_battery_animation);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        batteryImg = (ImageView) findViewById(R.id.batteryImg);
        batteryImg.setBackgroundResource(R.drawable.battery_items);


        AnimationDrawable animationDrawable = (AnimationDrawable) batteryImg.getBackground();

        animationDrawable.start();
    }
}