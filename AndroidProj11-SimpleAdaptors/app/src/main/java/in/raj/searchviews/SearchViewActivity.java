package in.raj.searchviews;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

import in.raj.R;

public class SearchViewActivity extends AppCompatActivity {

    ListView listViewThree;
    SearchView searchViewOne;

    ArrayList names;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_search_view);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        listViewThree = (ListView)findViewById(R.id.listViewThree);
        searchViewOne = (SearchView) findViewById(R.id.searchViewOne);

        names = new ArrayList<>();
        names.add("Raj");
        names.add("Amit");
        names.add("Deepak");
        names.add("Ambrikesh");
        names.add("Rishikesh");
        names.add("Ankita");
        names.add("Pranshu");

        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,names);
        listViewThree.setAdapter(adapter);

        searchViewOne.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }

            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }
        });
    }
}