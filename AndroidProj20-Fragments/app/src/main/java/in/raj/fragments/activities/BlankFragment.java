package in.raj.fragments.activities;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import in.raj.fragments.R;

public class BlankFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        Button btnOne;
        btnOne = (Button) view.findViewById(R.id.btnOne);

        btnOne.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          Toast.makeText(getActivity(), "Fragment Btn Clicked", Toast.LENGTH_SHORT).show();
                                          btnOne.setText("Clicked");
                                      }
                                  }
        );

        // Inflate the layout for this fragment
        return view;
    }
}