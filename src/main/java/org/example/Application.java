package org.example;

import org.example.data.datasource.remote.ZipCodeInfRemoteDataSource;
import org.example.data.datasource.remote.ZipCodeInfRemoteDataSourceImpl;
import org.example.data.datasource.remote.api.ApiService;
import org.example.data.datasource.remote.api.RetrofitClient;
import org.example.data.mapper.ZipCodeInfoMapper;
import org.example.data.repository.ZipCodeInfoRepository;
import org.example.data.repository.ZipCodeInfoRepositoryImpl;
import org.example.domain.usecase.GetZipCodeInformationUseCase;
import org.example.domain.usecase.GetZipCodeInformationUseCaseImpl;
import org.example.presentation.PostCodeScreen;

public class Application {
    public static void main(String[] args) {
        ApiService apiService = RetrofitClient.getClient().create(ApiService.class);
        ZipCodeInfRemoteDataSource dataSource = new ZipCodeInfRemoteDataSourceImpl(apiService);
        ZipCodeInfoMapper mapper = new ZipCodeInfoMapper();
        ZipCodeInfoRepository repository = new ZipCodeInfoRepositoryImpl(dataSource, mapper);
        GetZipCodeInformationUseCase useCase = new GetZipCodeInformationUseCaseImpl(repository);
        PostCodeScreen screen = new PostCodeScreen(useCase);
        screen.start();
    }
}