package bd.edu.seu.myfragmentexample.personFragment;


import android.os.Bundle;

import android.app.Fragment;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import bd.edu.seu.myfragmentexample.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PersonFragment extends Fragment {


    public PersonFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_person, container, false);
    }

}
