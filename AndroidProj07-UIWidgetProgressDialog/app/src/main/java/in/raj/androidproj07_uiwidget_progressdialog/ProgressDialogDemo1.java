package in.raj.androidproj07_uiwidget_progressdialog;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ProgressDialogDemo1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_progress_dialog_demo1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void openProgressDialogHorizental(View view) {
        ProgressDialog progressDialog = new ProgressDialog(ProgressDialogDemo1.this);
        progressDialog.setTitle("New Title");
        progressDialog.setMessage("Progress......");
        progressDialog.setIcon(R.drawable.home);
        progressDialog.setMax(100);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setCancelable(false);
        progressDialog.show();

        Handler handler = new Handler(){
            @Override
            public void handleMessage(@NonNull Message msg) {
                super.handleMessage(msg);
                progressDialog.incrementProgressBy(1);
            }
        };

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                   while (progressDialog.getProgress()<=progressDialog.getMax()){
                       Thread.sleep(100);
                       handler.sendMessage(handler.obtainMessage());
                       if (progressDialog.getProgress() == progressDialog.getMax()){
                           progressDialog.dismiss();
                       }
                   }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}