package in.raj.customSimpleAdaptor;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.HashMap;

import in.raj.R;

public class CustomActivity extends AppCompatActivity {
    ListView listViewTwo;

    int[] animalImage = {R.drawable.bear,R.drawable.elephant,R.drawable.lion,R.drawable.rabbit,R.drawable.zebra,R.drawable.bear,R.drawable.elephant,R.drawable.lion,R.drawable.rabbit,R.drawable.zebra,R.drawable.bear,R.drawable.elephant,R.drawable.lion,R.drawable.rabbit,R.drawable.zebra};

    String[] animalName = {"Bear","Elephant","Lion","Rabbit","Zebra","Bear","Elephant","Lion","Rabbit","Zebra","Bear","Elephant","Lion","Rabbit","Zebra"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_custom);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        listViewTwo =(ListView) findViewById(R.id.listViewTwo);

        ArrayList<HashMap<String,?>> arrayList = new ArrayList<HashMap<String,?>>();

        for (int i = 0; i<animalImage.length; i++){
            HashMap hm1 = new HashMap();
            hm1.put("Image",animalImage[i]);
            hm1.put("Name",animalName[i]);
            arrayList.add(hm1);
        }

        String[] from = {"Image","Name"};
        int[] to = {R.id.imageViewTwo,R.id.textViewTwo};

        CustomSimpleAdptr customSimpleAdptr = new CustomSimpleAdptr(CustomActivity.this,arrayList,R.layout.uiviewtwo,from,to);

        listViewTwo.setAdapter(customSimpleAdptr);


    }
}