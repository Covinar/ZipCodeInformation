package org.example.data.repository;

import org.example.data.datasource.remote.dto.ZipCodeInfDto;
import org.example.data.datasource.remote.ZipCodeInfRemoteDataSource;
import org.example.data.mapper.ZipCodeInfoMapper;
import org.example.domain.entity.ZipCodeInfEntity;

public class ZipCodeInfoRepositoryImpl implements ZipCodeInfoRepository{
    private final ZipCodeInfRemoteDataSource remoteDataSource;
    private final ZipCodeInfoMapper mapper;

    public ZipCodeInfoRepositoryImpl(ZipCodeInfRemoteDataSource remoteDataSource, ZipCodeInfoMapper mapper) {
        this.remoteDataSource = remoteDataSource;
        this.mapper = mapper;
    }

    @Override
    public ZipCodeInfEntity getInformation(int code) {
        ZipCodeInfDto dto = remoteDataSource.getInformation(code);
        return mapper.map(dto);
    }
}
