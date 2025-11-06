package in.raj;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class ContextMenuBarImplementation extends AppCompatActivity {

    ListView listViewOne;
    String[] contacts = {"Raj","Ankita","Pallavi","Kanishq","Deepak"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context_menu_bar_implementation);

        listViewOne = findViewById(R.id.listViewOne);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, contacts);
        listViewOne.setAdapter(adapter);
        registerForContextMenu(listViewOne);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        getMenuInflater().inflate(R.menu.contextmenubar,menu);
    }


    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.call){
            Toast.makeText(this, "Calling ", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.msg) {
            Toast.makeText(this, "Message ", Toast.LENGTH_SHORT).show();
            return true;
        }else {
            return super.onContextItemSelected(item);
        }
    }
}