package in.raj.demoone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import in.raj.R;

public class AnimalAdaptor extends BaseAdapter {
    Context context;
    int[] data;

    LayoutInflater layoutInflater;

    public AnimalAdaptor(Context context, int[] data) {
        this.context = context;
        this.data = data;
        layoutInflater= (LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return data.length;
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
        convertView = layoutInflater.inflate(R.layout.uiviewone, null);
        ImageView imageIdOne = (ImageView) convertView.findViewById(R.id.imageIdOne);
        imageIdOne.setImageResource(data[position]);
        return convertView;
    }
}
