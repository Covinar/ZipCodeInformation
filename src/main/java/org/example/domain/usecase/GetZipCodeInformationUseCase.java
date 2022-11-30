package org.example.domain.usecase;

import org.example.domain.entity.ZipCodeInfEntity;

public interface GetZipCodeInformationUseCase {
    ZipCodeInfEntity getInformation(int code);
}
