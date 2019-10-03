package com.example.android.tourguideapp;

public class Attraction {

    private String mLocationName;
    private String mAddress;
    private String mDescription;
    private int mImageResourceId = -1;

    public Attraction(String locationName, String address, String description){
        mLocationName = locationName;
        mAddress = address;
        mDescription = description;
    }

    public String getLocationName(){return mLocationName;}

    public String getAddress(){return mAddress;}

    public String getDescription(){return mDescription;}

    public int getImageResourceId(){return mImageResourceId;}



}
