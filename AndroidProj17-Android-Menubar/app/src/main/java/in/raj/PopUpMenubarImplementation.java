package in.raj;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PopUpMenubarImplementation extends AppCompatActivity {

    Button buttonOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pop_up_menubar_implementation);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        buttonOne = (Button)findViewById(R.id.buttonOne);

        /*buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(PopUpMenubarImplementation.this,buttonOne);
                popupMenu.getMenuInflater().inflate(R.menu.popupmenubar,popupMenu.getMenu());
                popupMenu.show();
            }
        });*/
    }

    public void openPopupMenu(View view) {
        PopupMenu popupMenu = new PopupMenu(PopUpMenubarImplementation.this,buttonOne);
        popupMenu.getMenuInflater().inflate(R.menu.popupmenubar,popupMenu.getMenu());

        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            /*@Override
            public boolean onMenuItemClick(MenuItem item) {
                Toast.makeText(PopUpMenubarImplementation.this, item.getTitle(), Toast.LENGTH_SHORT).show();
                return true;
            }*/

            @Override
            public boolean onMenuItemClick(MenuItem item) {
                int id = item.getItemId();
                if (id == R.id.optionFive){
                    Toast.makeText(PopUpMenubarImplementation.this, "Option 5 Clicked", Toast.LENGTH_SHORT).show();
                    return true;
                } else if (id == R.id.optionSix) {
                    Toast.makeText(PopUpMenubarImplementation.this,"Option 6 Clicked", Toast.LENGTH_SHORT).show();
                    return true;
                }else if (id == R.id.optionSeven) {
                    Toast.makeText(PopUpMenubarImplementation.this,"Option 7 Clicked", Toast.LENGTH_SHORT).show();
                    return true;
                }else {
                    Toast.makeText(PopUpMenubarImplementation.this,"Nothing",Toast.LENGTH_SHORT).show();
                    return true;
                }
            }
        });
        popupMenu.show();
    }
}