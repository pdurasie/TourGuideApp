package com.example.android.tourguideapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class AttractionAdapter extends ArrayAdapter<Attraction> {

    public AttractionAdapter(Activity context, ArrayList<Attraction> attractions) {
        super(context, 0, attractions);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Attraction currentAttraction = getItem(position);

        ImageView locationImage = listItemView.findViewById(R.id.attraction_image_view);
        locationImage.setVisibility(View.GONE);

        TextView locationName = listItemView.findViewById(R.id.location_name_text_view);
        locationName.setText(currentAttraction.getLocationName());

        TextView locationAddress = listItemView.findViewById(R.id.address_text_view);
        locationAddress.setText(currentAttraction.getAddress());

        TextView locationDesc = listItemView.findViewById(R.id.description_text_view);
        locationDesc.setText(currentAttraction.getDescription());

        return listItemView;
    }
}
