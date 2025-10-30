package in.raj.searchViewsOne;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SearchView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

import in.raj.R;

public class SearchViewOne extends AppCompatActivity {

    SearchView searchViewTwo;
    ListView listViewFour;

    ArrayList names;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_search_view_one);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        listViewFour = (ListView)findViewById(R.id.listViewFour);
        searchViewTwo = (SearchView) findViewById(R.id.searchViewTwo);

        names = new ArrayList<>();
        names.add("Raj");
        names.add("Amit");
        names.add("Deepak");
        names.add("Ambrikesh");
        names.add("Rishikesh");
        names.add("Ankita");
        names.add("Pranshu");
        names.add("aaa");
        names.add("bbb");

        SearchAdaptor searchAdaptor = new SearchAdaptor(this,names);
        listViewFour.setAdapter(searchAdaptor);
        searchViewTwo.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextChange(String newText) {
                searchAdaptor.myFilter(newText);
                return false;
            }

            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }
        });
    }
}