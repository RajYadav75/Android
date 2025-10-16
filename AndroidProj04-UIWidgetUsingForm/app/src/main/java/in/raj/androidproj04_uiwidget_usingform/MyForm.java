package in.raj.androidproj04_uiwidget_usingform;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MyForm extends AppCompatActivity {

    EditText et_name,et_password,et_phone;
    RadioButton rb_male,rb_female;
    CheckBox cb_android,cb_java,ch_python;

    Spinner sp_cities;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_form);

        et_name = (EditText) findViewById(R.id.et_name);
        et_password = (EditText) findViewById(R.id.et_password);
        et_phone = (EditText) findViewById(R.id.et_phone);

        rb_male = (RadioButton) findViewById(R.id.rb_male);
        rb_female = (RadioButton) findViewById(R.id.rb_female);

        cb_android = (CheckBox) findViewById(R.id.cb_android);
        cb_java = (CheckBox) findViewById(R.id.cb_java);
        ch_python = (CheckBox) findViewById(R.id.cb_python);

        sp_cities = (Spinner) findViewById(R.id.sp_cities);
    }

    public void getAllValues(View view) {
        //TODO- Get Values from Edit Text
        String name = et_name.getText().toString();
        String password = et_password.getText().toString();
        String phoneNumber = et_phone.getText().toString();

        //TODO- Get Values from Radio Buttons
        String gender = "";
        if (rb_male.isChecked()){
            gender = rb_male.getText().toString();
        }
        if (rb_female.isChecked()){
            gender = rb_female.toString();
        }
        //TODO- Get Values from CheckBox
        String interest = "";
        if (cb_android.isChecked()){
            interest += cb_android.getText().toString()+"\n";
        }
        if (cb_java.isChecked()){
            interest += cb_java.getText().toString()+"\n";
        }
        if (ch_python.isChecked()){
            interest += ch_python.getText().toString()+"\n";
        }
        //TODO- Get Values from Spinner
        String city = sp_cities.getSelectedItem().toString();

        //TODO- Print All Values in Toast
        String result = name +"\n"+phoneNumber+"\n"+password+"\n"+gender+"\n"+interest+"\n"+city;
        Toast.makeText(this,result,Toast.LENGTH_LONG).show();
    }
}