package in.raj;

import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Calendar;

public class DatePickerDemo2 extends AppCompatActivity {
    DatePicker datapicker_two;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_date_picker_demo2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        datapicker_two = findViewById(R.id.datapicker_two);
    }

    public void getDate(View view) {
        /*int month = datapicker_two.getMonth();
        int year = datapicker_two.getYear();
        int dayOfMonth = datapicker_two.getDayOfMonth();
        Toast.makeText(this, "Month is "+(month+1), Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Year is "+year, Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Date is "+dayOfMonth, Toast.LENGTH_SHORT).show();*/

        Calendar c = Calendar.getInstance();
        int day = c.get(Calendar.DAY_OF_MONTH);
        int month = c.get(Calendar.MONTH);
        int year = c.get(Calendar.YEAR);
        Toast.makeText(this, "Month is "+(month+1), Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Year is "+year, Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Date is "+day, Toast.LENGTH_SHORT).show();

        Toast.makeText(this, "Calculated Date"+day+" "+month+" "+year, Toast.LENGTH_SHORT).show();
    }
}