package in.raj.simpleadaptorOne;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.HashMap;

import in.raj.R;

public class MainActivityOne extends AppCompatActivity {

    ListView listViewOne;

    int[] animalImage = {R.drawable.bear,R.drawable.elephant,R.drawable.lion,R.drawable.rabbit,R.drawable.zebra,R.drawable.bear,R.drawable.elephant,R.drawable.lion,R.drawable.rabbit,R.drawable.zebra,R.drawable.bear,R.drawable.elephant,R.drawable.lion,R.drawable.rabbit,R.drawable.zebra};

    String[] animalName = {"Bear","Elephant","Lion","Rabbit","Zebra","Bear","Elephant","Lion","Rabbit","Zebra","Bear","Elephant","Lion","Rabbit","Zebra"};




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

        ListView listViewOne =(ListView) findViewById(R.id.listViewOne);

        ArrayList<HashMap<String,?>> arrayList = new ArrayList<HashMap<String,?>>();

        for (int i = 0; i<animalImage.length; i++){
            HashMap hm1 = new HashMap();
            hm1.put("Image",animalImage[i]);
            hm1.put("Name",animalName[i]);
            arrayList.add(hm1);
        }

        String[] from = {"Image","Name"};
        int[] to = {R.id.imageViewOne,R.id.textViewOne};

        SimpleAdapter simpleAdapter = new SimpleAdapter(this,arrayList,R.layout.uiviewone,from,to);
        listViewOne.setAdapter(simpleAdapter);


        listViewOne.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivityOne.this, animalName[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}