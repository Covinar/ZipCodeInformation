package org.example.data.datasource.remote.api;

import org.example.data.datasource.remote.dto.ZipCodeInfDto;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiService {

    @GET("us/{code}")
    Call<ZipCodeInfDto> getInformation(@Path(value = "code", encoded = true) int code);

}
