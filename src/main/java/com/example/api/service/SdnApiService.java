package com.example.api.service;

import com.example.api.api.APIConfiguration;
import com.example.api.api.ApiService;
import com.example.api.model.Sdn;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jaxb.JaxbConverterFactory;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

@Service
public class SdnApiService extends APIConfiguration {
    private static final String BASE_URL = "https://raw.githubusercontent.com/Bik-KrlvnOrg/Nov4-API-Building-Skills-using-Java-kelvin/main/";
    private ApiService service;

    public SdnApiService() {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor(message -> System.out.println("OkHttp"));
        int timeOut = 30;
        OkHttpClient okhttp = new OkHttpClient.Builder()
                .addInterceptor(logging)
                .connectTimeout(timeOut, TimeUnit.SECONDS)
                .readTimeout(timeOut, TimeUnit.SECONDS)
                .writeTimeout(timeOut, TimeUnit.SECONDS)
                .callTimeout(timeOut, TimeUnit.SECONDS)
                .build();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API_BASE_URL)
                .addConverterFactory(SimpleXmlConverterFactory.create())
                .client(okhttp)
                .build();

        service = retrofit.create(ApiService.class);
    }

    public Sdn getData() throws IOException {
        Call<Sdn> retrofitCall = service.getSdn();

        Response<Sdn> response = retrofitCall.execute();

        if (!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : "Unknown error");
        }

        return response.body();
    }
}
