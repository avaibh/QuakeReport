package com.example.android.quakereport;
/**
 * Created by vaibhavagrawal on 21/06/17.
 */

public class Earthquake {
    private double mMagnitude;
    private String mLocation;
    private String mUrl;
    private long mTimeInMilliseconds;

    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url){
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    public double getMagnitude(){
        return mMagnitude;
    }

    public String getLocation(){
        return mLocation;
    }

    public String getUrl(){
        return mUrl;
    }

    public long getTimeInMilliseconds(){ return mTimeInMilliseconds;}
}




