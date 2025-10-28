package in.raj.demoone;

import android.os.Bundle;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import in.raj.R;

public class MainActivityOne extends AppCompatActivity {

    GridView gridViewIdOne;

    //TODO:- This is DataSource
    int[] animalArr = {R.drawable.bear, R.drawable.elephant, R.drawable.lion, R.drawable.rabbit,R.drawable.zebra};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_one);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        gridViewIdOne =(GridView) findViewById(R.id.gridViewIdOne);

        AnimalAdaptor animalAdaptor = new AnimalAdaptor(getApplicationContext(), animalArr);
        gridViewIdOne.setAdapter(animalAdaptor);

    }
}