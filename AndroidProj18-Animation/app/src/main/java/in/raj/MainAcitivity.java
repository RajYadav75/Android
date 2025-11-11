package in.raj;

import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainAcitivity extends AppCompatActivity {

    ImageView imageViewOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_acitivity);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        imageViewOne = findViewById(R.id.imageViewOne);

//        Animation animation = AnimationUtils.loadAnimation(MainAcitivity.this, R.anim.fadeinusingalpha);
        Animation animation = AnimationUtils.loadAnimation(MainAcitivity.this, R.anim.fadeoutusingalpha);
        imageViewOne.startAnimation(animation);
        // TODO:- Below code is for permanent fadeout
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                imageViewOne.setImageResource(ImageView.GONE);
            }
        },10000);
    }
}