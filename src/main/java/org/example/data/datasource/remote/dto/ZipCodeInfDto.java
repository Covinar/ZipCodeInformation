package org.example.data.datasource.remote.dto;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ZipCodeInfDto {
    @SerializedName("post code")
    private int postCode;
    private String country;
    @SerializedName("country abbreviation")
    private String countryAbbreviation;
    private List<PlaceDto> places;

    public int getPostCode() {
        return postCode;
    }

    public String getCountry() {
        return country;
    }

    public String getCountryAbbreviation() {
        return countryAbbreviation;
    }

    public List<PlaceDto> getPlaces() {
        return places;
    }
}
