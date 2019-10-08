package com.example.android.tourguideapp;

import android.app.Activity;
import android.util.Log;
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

        int imageId = currentAttraction.getImageResourceId();
        ImageView locationImage = listItemView.findViewById(R.id.attraction_image_view);
        if (imageId != -1){
            locationImage.setImageResource(imageId);
        } else {
            locationImage.setVisibility(View.GONE);
        }

        TextView locationName = listItemView.findViewById(R.id.location_text_view);
        locationName.setText(currentAttraction.getLocationName());

        TextView locationAddress = listItemView.findViewById(R.id.address_text_view);
        if (currentAttraction.getAddress() != null) {
            locationAddress.setText(currentAttraction.getAddress());
        } else{
            //if there is no address (or rating), we don't need a divisor line
            locationAddress.setVisibility(View.GONE);
            View divisorLine = listItemView.findViewById(R.id.divisor_line_view);
            divisorLine.setVisibility(View.GONE);
        }
        TextView locationDesc = listItemView.findViewById(R.id.description_text_view);
        locationDesc.setText(currentAttraction.getDescription());

        return listItemView;
    }
}
