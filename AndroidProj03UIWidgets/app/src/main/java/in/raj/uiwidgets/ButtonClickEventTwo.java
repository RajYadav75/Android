package in.raj.uiwidgets;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ButtonClickEventTwo extends AppCompatActivity {

    EditText etMyText;
    Button myBtn;

    TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_click_event_two);
        etMyText = (EditText) findViewById(R.id.et_email);
        myBtn = (Button) findViewById(R.id.btn_two);
        myTextView = (TextView) findViewById(R.id.tv_email);
    }

    public void getUserEmail(View view){
        String email = etMyText.getText().toString();
        myTextView.setText("Email : "+email);
        //TODO:- Another Method
        //
        // यहाँ हम User को एक टोस्ट msg दिखा रहे हैं
        Toast.makeText(getApplicationContext(),"Email : "+email,Toast.LENGTH_LONG).show();
    }
}
