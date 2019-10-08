package com.example.android.tourguideapp;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class HistoricFragment extends Fragment {


    public HistoricFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_fun_for_free, container, false);

        ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction(getString(R.string.speicherstadt_location),
                getString(R.string.speicherstadt_desc),
                R.drawable.speicherstadt_pic));
        attractions.add(new Attraction(getString(R.string.rathaus_location),
                getString(R.string.rathaus_desc),
                R.drawable.rathaus_pic));
        attractions.add(new Attraction(getString(R.string.michel_location),
                getString(R.string.michel_desc),
                R.drawable.michel_pic));
        attractions.add(new Attraction(getString(R.string.elbtunnel_location),
                getString(R.string.elbtunnel_desc),
                R.drawable.elbtunnel_pic));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions);

        ListView listView = rootView.findViewById(R.id.attraction_list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
