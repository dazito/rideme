package com.dazito.android.rideme.webservices.uber.model;

/**
 * Created by Pedro on 20-01-2015.
 */
public class EndLocation {

    public final String address;
    public final float latitude;
    public final float longitude;

    public EndLocation(String address, float latitude, float longitude) {
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
