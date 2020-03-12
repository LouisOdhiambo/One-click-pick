package com.moringaschool.one_clickpick.network;

import com.moringaschool.one_clickpick.models.BestBuyProductSearchResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import static com.moringaschool.one_clickpick.Constants.api_key;

public interface EtsyApi {

    @GET("products?apiKey=BxaYUpnn8AUTWp69vYwpDi1V&format=json")
    Call<BestBuyProductSearchResponse> getProducts(
//            @Query("api key") String query api_key
    );
}

