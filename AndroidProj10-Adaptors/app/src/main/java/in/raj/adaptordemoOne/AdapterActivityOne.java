package in.raj.adaptordemoOne;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import in.raj.R;

public class AdapterActivityOne extends AppCompatActivity {

    String[] names={"Raj Yadav","Ankita Tiwari","Deepak Kumar","Ambrikesh Gour","Ramayan Yadav","Raj Yadav","Ankita Tiwari","Deepak Kumar","Ambrikesh Gour","Ramayan Yadav","Raj Yadav","Ankita Tiwari","Deepak Kumar","Ambrikesh Gour","Ramayan Yadav","Raj Yadav","Ankita Tiwari","Deepak Kumar","Ambrikesh Gour","Ramayan Yadav","Raj Yadav","Ankita Tiwari","Deepak Kumar","Ambrikesh Gour","Ramayan Yadav","Raj Yadav","Ankita Tiwari","Deepak Kumar","Ambrikesh Gour","Ramayan Yadav"};

    ListView listViewOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_adapter_one);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ListView listViewOne = (ListView) findViewById(R.id.listViewOne);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,R.layout.uiviewone,R.id.textViewOne,names);
        listViewOne.setAdapter(arrayAdapter);
    }
}