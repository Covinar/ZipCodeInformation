package org.example.data.mapper;

import org.example.data.datasource.remote.dto.ZipCodeInfDto;
import org.example.domain.entity.ZipCodeInfEntity;

public class ZipCodeInfoMapper {

    public ZipCodeInfEntity map(ZipCodeInfDto dto) {
        ZipCodeInfEntity entity = new ZipCodeInfEntity(dto.getPostCode(),
                dto.getCountry(),
                dto.getCountryAbbreviation(),
                dto.getPlaces().get(0).getPlaceName(),
                dto.getPlaces().get(0).getLongitude()
        );
        return entity;
    }

}
