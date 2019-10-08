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
    //This constructor also works for ratings instead of addresses
    public Attraction(String locationName, String address, String description, int imageResourceId){
        mLocationName = locationName;
        mAddress = address;
        mDescription = description;
        mImageResourceId = imageResourceId;
    }

    public Attraction(String locationName, String description, int imageResourceId){
        mLocationName = locationName;
        mDescription = description;
        mImageResourceId = imageResourceId;
    }


    public String getLocationName(){return mLocationName;}

    public String getAddress(){return mAddress;}

    public String getDescription(){return mDescription;}

    public int getImageResourceId(){return mImageResourceId;}



}
