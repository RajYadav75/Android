package in.raj;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivityTwo extends AppCompatActivity {
    ImageView imageViewTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_two);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        imageViewTwo = findViewById(R.id.imageViewTwo);

//        Animation animation = AnimationUtils.loadAnimation(MainAcitivity.this, R.anim.fadeinusingalpha);
//        Animation animation = AnimationUtils.loadAnimation(MainActivityTwo.this, R.anim.blink);
//        Animation animation = AnimationUtils.loadAnimation(MainActivityTwo.this, R.anim.zoomin);
//        Animation animation = AnimationUtils.loadAnimation(MainActivityTwo.this, R.anim.zoomout);
//        Animation animation = AnimationUtils.loadAnimation(MainActivityTwo.this, R.anim.rotate);
//        Animation animation = AnimationUtils.loadAnimation(MainActivityTwo.this, R.anim.righttoleft);
        Animation animation = AnimationUtils.loadAnimation(MainActivityTwo.this, R.anim.mixanimation);
        imageViewTwo.startAnimation(animation);
    }
}