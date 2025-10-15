package in.raj.uiwidgets;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ButtonClickEventOne extends AppCompatActivity {

    EditText et_my_name;
    Button my_btn_one;

    TextView tv_my_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_click_event_one);

        et_my_name=(EditText) findViewById(R.id.et_name);
        my_btn_one=(Button) findViewById(R.id.btn_one);
        tv_my_name=(TextView) findViewById(R.id.tv_name);

        my_btn_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = et_my_name.getText().toString();
                tv_my_name.setText("Name :: "+name);
            }
        });



    }
}