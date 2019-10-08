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
public class FranzFragment extends Fragment {


    public FranzFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_fun_for_free, container, false);

        ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction(getString(R.string.schanzenbaecker_location),
                getString(R.string.schanzenbaecker_rating), getString(R.string.schanzenbaecker_desc)));
        attractions.add(new Attraction(getString(R.string.friends_location),
                getString(R.string.friends_rating), getString(R.string.friends_desc)));
        attractions.add(new Attraction(getString(R.string.junge_location),
                getString(R.string.junge_rating), getString(R.string.junge_desc)));
        attractions.add(new Attraction(getString(R.string.subway_location),
                getString(R.string.subway_rating), getString(R.string.subway_desc)));
        attractions.add(new Attraction(getString(R.string.penny_location),
                getString(R.string.penny_rating), getString(R.string.penny_desc)));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions);

        ListView listView = rootView.findViewById(R.id.attraction_list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
