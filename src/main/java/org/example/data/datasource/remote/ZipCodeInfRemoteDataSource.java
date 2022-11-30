package org.example.data.datasource.remote;

import org.example.data.datasource.remote.dto.ZipCodeInfDto;

public interface ZipCodeInfRemoteDataSource {
    ZipCodeInfDto getInformation(int code);
}
