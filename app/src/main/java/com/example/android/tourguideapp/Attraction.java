package com.example.android.tourguideapp;

public class Attraction {

    private String mLocationName;
    private String mAddress;
    private String mDescription;
    private int mImageResourceId = -1;

    //This constructor also works with ratings instead of addresses
    //For brevity's sake, there is only one constructor for both
    public Attraction(String locationName, String address, String description){
        mLocationName = locationName;
        mAddress = address;
        mDescription = description;
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
