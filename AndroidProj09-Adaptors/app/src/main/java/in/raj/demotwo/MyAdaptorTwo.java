package in.raj.demotwo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import in.raj.R;

public class MyAdaptorTwo extends BaseAdapter {
    Context context;
    int[] animalImg;
    String[] animalName;

    LayoutInflater inflater;

    public MyAdaptorTwo(Context context,int[] animalImg,String[] animalName) {
        this.context = context;
        this.animalImg = animalImg;
        this.animalName = animalName;
        inflater= (LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return animalImg.length;
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
        convertView = inflater.inflate(R.layout.uiviewtwo,null);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageIdTwo);
        TextView textView = (TextView) convertView.findViewById(R.id.textViewIdone);

        imageView.setImageResource(animalImg[position]);
        textView.setText(animalName[position]);

        return convertView;
    }
}
