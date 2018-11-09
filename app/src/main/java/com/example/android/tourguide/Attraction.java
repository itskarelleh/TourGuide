package com.example.android.tourguide;

public class Attraction {

    private int mLocationImg;
    private String mLocationName;
    private String mLocationAddress;
    private String mLocationDesc;

    //Contains primary location img, location, name, address, description and two additional images
    public Attraction(int locationImg, String locationName, String locationAddress, String locationDesc){
        mLocationImg = locationImg;
        mLocationName = locationName;
        mLocationAddress = locationAddress;
        mLocationDesc = locationDesc;
    }
    public int getmLocationImg(){
        return mLocationImg;
    }

    public String getmLocationName(){
        return mLocationName;
    }

    public String getmLocationAddress(){
        return mLocationAddress;
    }

    public String getmLocationDesc(){
        return mLocationDesc;
    }
}
