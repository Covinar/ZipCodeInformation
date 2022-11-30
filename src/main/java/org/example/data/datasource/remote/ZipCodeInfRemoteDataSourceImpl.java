package org.example.data.datasource.remote;

import org.example.data.datasource.remote.api.ApiService;
import org.example.data.datasource.remote.dto.ZipCodeInfDto;

import java.io.IOException;

public class ZipCodeInfRemoteDataSourceImpl implements ZipCodeInfRemoteDataSource{
    private final ApiService apiService;

    public ZipCodeInfRemoteDataSourceImpl(ApiService apiService) {
        this.apiService = apiService;
    }

    @Override
    public ZipCodeInfDto getInformation(int code) {
        try {
            ZipCodeInfDto dto = apiService.getInformation(code).execute().body();
            return dto;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
