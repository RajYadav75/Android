package in.raj;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class OptionMenubarImplementation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_menubar_implementation);
    }

    //    @SuppressLint("RestrictedApi")
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.optionmenubar, menu);
        /*if (menu instanceof MenuBuilder){
            MenuBuilder menuBuilder = (MenuBuilder) menu;
            menuBuilder.setOptionalIconsVisible(true);
        }*/
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int menuId = item.getItemId();
        if (menuId == R.id.optionOne) {
            Toast.makeText(this, "Option 1 Clicked", Toast.LENGTH_SHORT).show();
            return true;
        } else if (menuId == R.id.optionTwo) {
            Toast.makeText(this, "Option 2 Clicked", Toast.LENGTH_SHORT).show();
            return true;
        } else if (menuId == R.id.optionThree) {
            Toast.makeText(this, "Option 3 Clicked", Toast.LENGTH_SHORT).show();
            return true;
        } else if (menuId == R.id.optionFour) {
            Toast.makeText(this, "Option 4 Clicked", Toast.LENGTH_SHORT).show();
            return true;
        } else if (menuId == R.id.home) {
            Toast.makeText(this, "Home  Clicked", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }
}