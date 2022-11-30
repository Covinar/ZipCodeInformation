package org.example.domain.entity;

public class ZipCodeInfEntity {
    private final int postCode;
    private final String country;
    private final String countryAbbreviation;
    private final String placeName;
    private final double longitude;

    public ZipCodeInfEntity(int postCode, String country, String countryAbbreviation, String placeName, double longitude) {
        this.postCode = postCode;
        this.country = country;
        this.countryAbbreviation = countryAbbreviation;
        this.placeName = placeName;
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "ZipCodeInfEntity{" +
                "postCode=" + postCode +
                ", country='" + country + '\'' +
                ", countryAbbreviation='" + countryAbbreviation + '\'' +
                ", placeName='" + placeName + '\'' +
                ", longitude=" + longitude +
                '}';
    }
}
