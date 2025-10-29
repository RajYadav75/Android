package in.raj.adaptordemothree;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

import in.raj.R;

public class MyCustomAdapter extends ArrayAdapter<Animal> {

    ArrayList<Animal> animalList;
    LayoutInflater layoutInflater;
    public MyCustomAdapter(Context context, int resource, ArrayList<Animal> objects) {
        super(context, resource, objects);
        animalList=objects;
        layoutInflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return animalList.size();
    }


    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        convertView = layoutInflater.inflate(R.layout.uiviewtwo,null);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageViewOne);
        TextView textView = (TextView) convertView.findViewById(R.id.textViewTwo);
        imageView.setImageResource(animalList.get(position).getAnimalImage());
        textView.setText(animalList.get(position).getAnimalName());
        return convertView;
    }
}
