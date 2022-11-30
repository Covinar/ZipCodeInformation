package org.example.data.repository;

import org.example.domain.entity.ZipCodeInfEntity;

public interface ZipCodeInfoRepository {

    ZipCodeInfEntity getInformation(int code);

}
