package in.raj.androidproj04_uiwidget_usingform;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ToggleBtnSwitchDemo extends AppCompatActivity {
    ToggleButton wifi_tglbtn;
    Switch wifi_stch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_toggle_btn_switch_demo);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        wifi_tglbtn = (ToggleButton) findViewById(R.id.wifi_tglbtn);
        wifi_stch = (Switch) findViewById(R.id.wifi_stch);
    }

    public void getValueFromToggleButton(View view) {
        if (wifi_tglbtn.isChecked()){
            Toast.makeText(this, "Wifi On", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Wifi OFF", Toast.LENGTH_SHORT).show();
        }
    }

    public void getValueFromSwitch(View view) {
        if (wifi_stch.isChecked()){
            Toast.makeText(this, "Wifi On Using Switch", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Wifi OFF Using Switch", Toast.LENGTH_SHORT).show();
        }
    }
}