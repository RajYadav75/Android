package in.raj.adaptordemothree;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

import in.raj.R;

public class CustomAdaptorDemo extends AppCompatActivity {

    ListView listViewTwo;

    ArrayList animalList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_custom_adaptor_demo);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ListView listViewTwo = (ListView) findViewById(R.id.listViewTwo);
        //TODO:- --------------------Below is custom arrayList--------------------------------------
        animalList = new ArrayList();
        animalList.add(new Animal("Bear", R.drawable.bear));
        animalList.add(new Animal("Elephant", R.drawable.elephant));
        animalList.add(new Animal("Lion", R.drawable.lion));
        animalList.add(new Animal("Rabbit", R.drawable.rabbit));
        animalList.add(new Animal("Zebra", R.drawable.zebra));
        animalList.add(new Animal("Bear", R.drawable.bear));
        animalList.add(new Animal("Elephant", R.drawable.elephant));
        animalList.add(new Animal("Lion", R.drawable.lion));
        animalList.add(new Animal("Rabbit", R.drawable.rabbit));
        animalList.add(new Animal("Zebra", R.drawable.zebra));
        animalList.add(new Animal("Bear", R.drawable.bear));
        animalList.add(new Animal("Elephant", R.drawable.elephant));
        animalList.add(new Animal("Lion", R.drawable.lion));
        animalList.add(new Animal("Rabbit", R.drawable.rabbit));
        animalList.add(new Animal("Zebra", R.drawable.zebra));
        animalList.add(new Animal("Bear", R.drawable.bear));
        animalList.add(new Animal("Elephant", R.drawable.elephant));
        animalList.add(new Animal("Lion", R.drawable.lion));
        animalList.add(new Animal("Rabbit", R.drawable.rabbit));
        animalList.add(new Animal("Zebra", R.drawable.zebra));
        animalList.add(new Animal("Bear", R.drawable.bear));
        animalList.add(new Animal("Elephant", R.drawable.elephant));
        animalList.add(new Animal("Lion", R.drawable.lion));
        animalList.add(new Animal("Rabbit", R.drawable.rabbit));
        animalList.add(new Animal("Zebra", R.drawable.zebra));
        animalList.add(new Animal("Bear", R.drawable.bear));
        animalList.add(new Animal("Elephant", R.drawable.elephant));
        animalList.add(new Animal("Lion", R.drawable.lion));
        animalList.add(new Animal("Rabbit", R.drawable.rabbit));
        animalList.add(new Animal("Zebra", R.drawable.zebra));
        animalList.add(new Animal("Bear", R.drawable.bear));
        animalList.add(new Animal("Elephant", R.drawable.elephant));
        animalList.add(new Animal("Lion", R.drawable.lion));
        animalList.add(new Animal("Rabbit", R.drawable.rabbit));
        animalList.add(new Animal("Zebra", R.drawable.zebra));
        animalList.add(new Animal("Bear", R.drawable.bear));
        animalList.add(new Animal("Elephant", R.drawable.elephant));
        animalList.add(new Animal("Lion", R.drawable.lion));
        animalList.add(new Animal("Rabbit", R.drawable.rabbit));
        animalList.add(new Animal("Zebra", R.drawable.zebra));
        animalList.add(new Animal("Bear", R.drawable.bear));
        animalList.add(new Animal("Elephant", R.drawable.elephant));
        animalList.add(new Animal("Lion", R.drawable.lion));
        animalList.add(new Animal("Rabbit", R.drawable.rabbit));
        animalList.add(new Animal("Zebra", R.drawable.zebra));
        animalList.add(new Animal("Bear", R.drawable.bear));
        animalList.add(new Animal("Elephant", R.drawable.elephant));
        animalList.add(new Animal("Lion", R.drawable.lion));
        animalList.add(new Animal("Rabbit", R.drawable.rabbit));
        animalList.add(new Animal("Zebra", R.drawable.zebra));
        animalList.add(new Animal("Bear", R.drawable.bear));
        animalList.add(new Animal("Elephant", R.drawable.elephant));
        animalList.add(new Animal("Lion", R.drawable.lion));
        animalList.add(new Animal("Rabbit", R.drawable.rabbit));
        animalList.add(new Animal("Zebra", R.drawable.zebra));
        //--------------------------------------------------------------------

        MyCustomAdapter adapter = new MyCustomAdapter(this, R.layout.uiviewtwo, animalList);
        listViewTwo.setAdapter(adapter);

    }
}