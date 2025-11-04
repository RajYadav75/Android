package in.raj;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("LifeCycle");
                builder.setMessage("Testing activity life cycle (Pause State)");
                builder.setCancelable(false);
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Yes Clicked", Toast.LENGTH_SHORT).show();
                    }
                });

                builder.show();
            }
        });

        Log.d("LifeCtyle1","onCreate() method Executed");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCtyle1","onStart() method Executed");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifeCtyle1","onResume() method Executed");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LifeCtyle1","onRestart() method Executed");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCtyle1","onStop() method Executed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeCtyle1","onPause() method Executed");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifeCtyle1","onDestroy() method Executed");
    }
}