package org.example.domain.usecase;

import org.example.data.repository.ZipCodeInfoRepository;
import org.example.domain.entity.ZipCodeInfEntity;

public class GetZipCodeInformationUseCaseImpl implements GetZipCodeInformationUseCase {

    private final ZipCodeInfoRepository repository;

    public GetZipCodeInformationUseCaseImpl(ZipCodeInfoRepository repository) {
        this.repository = repository;
    }
    @Override
    public ZipCodeInfEntity getInformation(int code) {
        return repository.getInformation(code);
    }
}
