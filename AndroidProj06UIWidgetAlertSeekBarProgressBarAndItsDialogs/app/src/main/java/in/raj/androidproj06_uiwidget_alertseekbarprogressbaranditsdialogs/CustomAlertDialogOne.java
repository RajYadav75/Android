package in.raj.androidproj06_uiwidget_alertseekbarprogressbaranditsdialogs;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CustomAlertDialogOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_custom_alert_dialog_one);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void openCustomAlertDialog(View view) {
        Dialog dialog = new Dialog(CustomAlertDialogOne.this);
        dialog.setContentView(R.layout.custom_alert_dialog);
        Button customAlertButton = (Button) dialog.findViewById(R.id.customAlertButton);
        customAlertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                Toast.makeText(CustomAlertDialogOne.this, "Custom Dialog Opened ....!!", Toast.LENGTH_SHORT).show();
            }
        });
        dialog.show();
    }
}