package in.raj;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ExplicitIntentActivityCommunication extends AppCompatActivity {
    Button buttonThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_explicit_intent_communication);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button buttonThree = findViewById(R.id.buttonThree);
        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Intent intent = new Intent(getApplicationContext(), ExplicitIntentActivity.class);
                startActivity(intent);*/

                //TODO:- Send Data
                Intent intent = new Intent(getApplicationContext(), ExplicitIntentActivity.class);
                intent.putExtra("key_email","rajYadav@gmail.com");
                intent.putExtra("Key_city","Gorakhpur");
                intent.putExtra("Key_name","Raj Yadav");
                intent.putExtra("Key_age",22);
                intent.putExtra("Key_phone","8115605569");
                startActivity(intent);

            }
        });
    }
}