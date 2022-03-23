package com.example.notificationmoduledesign.NotificationApi;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    public static Retrofit retrofit = null;
    public static final String BASE_URL = "https://test.theclassroom.biz/api/";

    public static Retrofit getRetrofit() {
        if (retrofit == null) {
            HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
            httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

            OkHttpClient okHttpClient = new OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor).build();

            retrofit = new Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(okHttpClient)
                    .baseUrl(BASE_URL)
                    .build();
        }

        return retrofit;
    }

    public static ApiService getApiService() {
        ApiService apiService = getRetrofit().create(ApiService.class);
        return apiService;
    }
}
