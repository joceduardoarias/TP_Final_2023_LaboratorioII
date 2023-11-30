package network;

import network.ITmdbApi;
import models.MovieResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import utils.Constants;

public class TmdbService {

    private ITmdbApi tmdbApi;

    public TmdbService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        tmdbApi = retrofit.create(ITmdbApi.class);
    }

    public void getPopularMovies(String apiKey, Callback<MovieResponse> callback) {
        Call<MovieResponse> call = tmdbApi.getPopularMovies(apiKey);
        call.enqueue(callback);
    }
}

