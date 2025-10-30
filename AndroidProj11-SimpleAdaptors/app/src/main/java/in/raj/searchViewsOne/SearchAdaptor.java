package in.raj.searchViewsOne;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import in.raj.R;

public class SearchAdaptor extends BaseAdapter {
    Context context;
    ArrayList names;

    LayoutInflater layoutInflater;

    ArrayList searchedName;

    public SearchAdaptor(Context context, ArrayList names) {
        this.context = context;
        this.names = names;
        layoutInflater = LayoutInflater.from(context);
        searchedName = new ArrayList();
        searchedName.addAll(names);
    }

    @Override
    public int getCount() {
        return names.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView= layoutInflater.inflate(R.layout.uiviewsearch,null);
        TextView textView = (TextView) convertView.findViewById(R.id.textViewThree);
        textView.setText(names.get(position).toString());
        return convertView;
    }

    public void myFilter(String query){
        names.clear();
        for (Object search : searchedName){
            if (search.toString().contains(query)){
                names.add(search.toString());
            }
        }

        notifyDataSetChanged();
    }

}
