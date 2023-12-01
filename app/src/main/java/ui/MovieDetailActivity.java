package ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.reelreveal.app.R;
import com.squareup.picasso.Picasso;

import models.Movie;

public class MovieDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);

        // Obtener los datos del intent
        String title = getIntent().getStringExtra("MOVIE_TITLE");
        String overview = getIntent().getStringExtra("MOVIE_OVERVIEW");
        String posterPath = getIntent().getStringExtra("MOVIE_POSTER_PATH");
        double rating = getIntent().getDoubleExtra("MOVIE_RATING", 0);
        String originalLanguage = getIntent().getStringExtra("MOVIE_ORIGINAL_LANGUAGE");
        String releaseDate = getIntent().getStringExtra("MOVIE_RELEASE_DATE");

        // Configurar los datos en la UI
        TextView titleTextView = findViewById(R.id.movieTitleTextView);
        TextView ratingTextView = findViewById(R.id.movieRatingTextView);
        TextView languageTextView = findViewById(R.id.movieLanguageTextView);
        TextView releaseDateTextView = findViewById(R.id.movieReleaseDateTextView);
        ImageView posterImageView = findViewById(R.id.moviePosterImageView);
        TextView overviewTextView = findViewById(R.id.movieOverviewTextView);

        titleTextView.setText(title);
        ratingTextView.setText("Rating: " + rating);
        languageTextView.setText("Idioma: " + originalLanguage);
        releaseDateTextView.setText("Lanzamiento: " + releaseDate);
        overviewTextView.setText(overview);
        // Cargar la imagen del póster usando Picasso
        Picasso.get().load(posterPath).into(posterImageView);
    }

}