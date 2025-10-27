package in.raj;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ImageSwitcherDemo extends AppCompatActivity {

    ImageSwitcher imageSwitcherId;

    int[] imagesId ={R.drawable.nature,R.drawable.yadavgod,R.drawable.chakra};
    int imageLength;
    int imageIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_image_switcher_demo);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        imageSwitcherId = (ImageSwitcher) findViewById(R.id.imageSwitcherId);
        imageLength = imagesId.length;

        imageSwitcherId.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(getApplicationContext());
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                return imageView;
            }
        });
        imageSwitcherId.setImageResource(imagesId[0]);
    }

    public void nextBtn(View view) {
        imageIndex=imageIndex+1;
        if (imageIndex == imagesId.length){
            imageIndex=0;
        }
        imageSwitcherId.setImageResource(imagesId[imageIndex]);
    }

    public void previousBtn(View view) {
        imageIndex=imageIndex-1;
        if (imageIndex < 0){
            imageIndex=imagesId.length-1;
        }
        imageSwitcherId.setImageResource(imagesId[imageIndex]);
    }
}