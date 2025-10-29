package in.raj.adaptordemotwo;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import in.raj.R;

public class MainActivityTwo extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    String[] names={"Raj Yadav","Ankita Tiwari","Deepak Kumar","Ambrikesh Gour","Ramayan Yadav","Raj Yadav","Ankita Tiwari","Deepak Kumar","Ambrikesh Gour","Ramayan Yadav","Raj Yadav","Ankita Tiwari","Deepak Kumar","Ambrikesh Gour","Ramayan Yadav","Raj Yadav","Ankita Tiwari","Deepak Kumar","Ambrikesh Gour","Ramayan Yadav","Raj Yadav","Ankita Tiwari","Deepak Kumar","Ambrikesh Gour","Ramayan Yadav","Raj Yadav","Ankita Tiwari","Deepak Kumar","Ambrikesh Gour","Ramayan Yadav"};

    Spinner spinnerOne;

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

        Spinner spinnerOne =(Spinner) findViewById(R.id.spinnerOne);
        spinnerOne.setOnItemSelectedListener(this);
        /*spinnerOne.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Name is "+names[position], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        //TODO:-This Way we can also do it.
        */

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,names);
        spinnerOne.setAdapter(arrayAdapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, "Name is "+names[position], Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}