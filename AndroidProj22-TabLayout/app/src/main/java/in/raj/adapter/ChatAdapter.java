package in.raj.adapter;

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

public class ChatAdapter extends ArrayAdapter {

    ArrayList al ;
    public ChatAdapter(@NonNull Context context, int resource, @NonNull ArrayList objects) {
        super(context, resource, objects);
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.chatbox,null);


        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageViewOne);
        TextView textView = (TextView) convertView.findViewById(R.id.textViewOne);

        ChatItems chatItems = (ChatItems) al.get(position);
        imageView.setImageResource(chatItems.getPersonImage());
        textView.setText(chatItems.getPersonName());


        return convertView;
    }
}
