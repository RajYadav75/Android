package in.raj.uiwidgets;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CustomToast extends AppCompatActivity {

    EditText etMyPhone;
    TextView tvPhone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_toast);
        etMyPhone = (EditText) findViewById(R.id.et_phone);
    }

    public void openCustomToast(View view){
        LayoutInflater lf = getLayoutInflater();
        View layout = lf.inflate(R.layout.layout_custom_toast_design, (ViewGroup) findViewById(R.id.ct_id));

        tvPhone = (TextView) layout.findViewById(R.id.tv_fone);
        String phoneNumber = etMyPhone.getText().toString();
        tvPhone.setText(phoneNumber);
        Toast toast  = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER,0,0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();
    }
}