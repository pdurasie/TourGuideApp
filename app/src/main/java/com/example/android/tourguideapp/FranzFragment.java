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
        attractions.add(new Attraction(getString(R.string.landungsbr_location),
                getString(R.string.landungsbr_desc),
                R.drawable.landungsbr_pic));
        attractions.add(new Attraction(getString(R.string.planten_location),
                getString(R.string.planten_desc),
                R.drawable.planten_pic));
        attractions.add(new Attraction(getString(R.string.elbstrand_location),
                getString(R.string.elbstrand_desc),
                R.drawable.elbstrand_pic));
        attractions.add(new Attraction(getString(R.string.buecherhallen_location),
                getString(R.string.buecherhallen_desc),
                R.drawable.buecherhallen_pic));
        attractions.add(new Attraction(getString(R.string.stadtpark_location),
                getString(R.string.stadtpark_desc),
                R.drawable.stadtpark_pic));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions);

        ListView listView = rootView.findViewById(R.id.attraction_list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
