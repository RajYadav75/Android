package in.raj;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ExplicitIntentActivity extends AppCompatActivity {

    Button buttonTwo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_explicit_intent);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button buttonTwo = findViewById(R.id.buttonTwo);
        Bundle bundle = getIntent().getExtras();
        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Intent intent = new Intent(getApplicationContext(), ExplicitIntentActivityCommunication.class);
                startActivity(intent);*/
                //TODO : Get Data from another activity
                String name = bundle.getString("Key_name");
                String email = bundle.getString("key_email");
                String phone = bundle.getString("Key_phone");
                Toast.makeText(ExplicitIntentActivity.this, name  + email  + phone, Toast.LENGTH_SHORT).show();
            }
        });
    }
}