package com.example.android.tourguideapp;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class NightlifeFragment extends Fragment {


    public NightlifeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_nightlife, container, false);

        ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction("Sunset Billard",
                "Walddörferstraße 110\n22041 Hamburg",
                "Play billard here"));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions);

        ListView listView = rootView.findViewById(R.id.attraction_list);

        listView.setAdapter(adapter);

        return rootView;
    }

}