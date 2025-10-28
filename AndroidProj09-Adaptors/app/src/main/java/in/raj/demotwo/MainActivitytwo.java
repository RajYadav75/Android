package in.raj.demotwo;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;


import in.raj.R;

public class MainActivitytwo extends AppCompatActivity {
    ListView listViewId;
    int[] animalImg = {R.drawable.zebra,R.drawable.lion,R.drawable.bear,R.drawable.elephant,R.drawable.rabbit,R.drawable.zebra,R.drawable.lion,R.drawable.bear,R.drawable.elephant,R.drawable.rabbit,R.drawable.zebra,R.drawable.lion,R.drawable.bear,R.drawable.elephant,R.drawable.rabbit};
    String[] animalName = {"Zebra","Lion","Bear","Elephant","Rabbit","Zebra","Lion","Bear","Elephant","Rabbit","Zebra","Lion","Bear","Elephant","Rabbit"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitytwo);

        listViewId =(ListView) findViewById(R.id.listViewId);

        MyAdaptorTwo adaptorTwo = new MyAdaptorTwo(getApplicationContext(),animalImg,animalName);
        listViewId.setAdapter(adaptorTwo);

    }
}