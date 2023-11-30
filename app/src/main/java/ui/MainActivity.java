package ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.reelreveal.app.R;

import models.MovieResponse;
import network.TmdbService;
import java.util.ArrayList;
import java.util.List;
import models.Movie;
import network.TmdbService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import utils.Constants;
public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MovieAdapter movieAdapter;
    private TmdbService tmdbService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        movieAdapter = new MovieAdapter(this, new ArrayList<>());
        recyclerView.setAdapter(movieAdapter);

        tmdbService = new TmdbService();
        loadPopularMovies();
    }
    private void loadPopularMovies() {
        tmdbService.getPopularMovies(Constants.TMDB_API_KEY, new Callback<MovieResponse>() {
            @Override
            public void onResponse(Call<MovieResponse> call, Response<MovieResponse> response) {
                if (response.isSuccessful() && response.body() != null) {
                    movieAdapter.setMovies(response.body().getResults());
                }
            }

            @Override
            public void onFailure(Call<MovieResponse> call, Throwable t) {
                // Loguear el error para depuración
                Log.e("MainActivity", "Error al llamar a la API", t);

                // Mostrar un mensaje de error al usuario

                Toast.makeText(MainActivity.this, "Error al cargar películas: " + t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
    }
}