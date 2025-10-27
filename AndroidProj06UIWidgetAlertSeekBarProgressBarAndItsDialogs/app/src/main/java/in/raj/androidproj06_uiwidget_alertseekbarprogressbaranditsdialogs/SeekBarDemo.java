package in.raj.androidproj06_uiwidget_alertseekbarprogressbaranditsdialogs;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SeekBarDemo extends AppCompatActivity {

    SeekBar seekBarId;
    TextView textViewId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_seek_bar_demo);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        seekBarId = (SeekBar) findViewById(R.id.seekBarId);
        textViewId = (TextView) findViewById(R.id.textViewId);

        int progressValue = 0;

        seekBarId.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressValue = 0;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressValue  =  progress;
                textViewId.setText(progressValue+" ");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
//                textViewId.setText(progressValue+" ");
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
//                textViewId.setText(progressValue+" ");
            }
        });



    }
}