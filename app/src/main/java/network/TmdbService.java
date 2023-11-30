package network;

import network.ITmdbApi;
import models.MovieResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class TmdbService {

    private ITmdbApi tmdbApi;

    public TmdbService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.themoviedb.org/3/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        tmdbApi = retrofit.create(ITmdbApi.class);
    }

    public void getPopularMovies(String apiKey, Callback<MovieResponse> callback) {
        Call<MovieResponse> call = tmdbApi.getPopularMovies(apiKey);
        call.enqueue(callback);
    }
}

