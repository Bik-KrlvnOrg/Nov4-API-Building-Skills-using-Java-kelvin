package com.example.api.api;

import com.example.api.model.Sdn;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;

public interface ApiService {

    @GET("sdn.xml")
    Call<Sdn> getSdn();
}
