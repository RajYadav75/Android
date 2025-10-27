package in.raj.androidproj06_uiwidget_alertseekbarprogressbaranditsdialogs;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ProgressBarDemo1 extends AppCompatActivity {
    ProgressBar myProgressBar;
    int progressValue = 0;

    Button progressBarButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_progress_bar_demo1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        myProgressBar = (ProgressBar) findViewById(R.id.myProgressBar);
        progressBarButton = (Button) findViewById(R.id.progressBarButton);
    }

    public void startProgressBar(View view) {
        progressBarButton.setVisibility(View.GONE);
        setProgressBarValue(progressValue);
    }

    void setProgressBarValue(int i){

        Thread thread   =   new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(100);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                myProgressBar.setProgress(i);
                setProgressBarValue(i+1);
            }
        });
        thread.start();
    }
}