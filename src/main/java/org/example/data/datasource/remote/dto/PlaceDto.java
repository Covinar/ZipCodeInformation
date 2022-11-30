package org.example.data.datasource.remote.dto;

import com.google.gson.annotations.SerializedName;

public class PlaceDto {
    @SerializedName("place name")
    private String placeName;
    private double longitude;

    public String getPlaceName() {
        return placeName;
    }

    public double getLongitude() {
        return longitude;
    }
}
