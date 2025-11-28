package in.raj.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import in.raj.R;
import in.raj.adapter.ChatAdapter;
import in.raj.adapter.ChatItems;


public class Chat extends Fragment {

    ListView listViewOne;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_chat, container, false);

        listViewOne = (ListView) view.findViewById(R.id.listViewOne);
        ArrayList al = new ArrayList();
        al.add(new ChatItems(R.drawable.lion,"Raj"));
        al.add(new ChatItems(R.drawable.bear,"Yash"));
        al.add(new ChatItems(R.drawable.rabbit,"Ankita"));
        al.add(new ChatItems(R.drawable.zebra,"Deepak"));
        al.add(new ChatItems(R.drawable.elephant,"Ambrikesh"));

        ChatAdapter chatAdapter = new ChatAdapter(getActivity(),R.layout.chatbox,al);
        return  view;
    }
}