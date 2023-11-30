package ui;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.reelreveal.app.R;
import com.squareup.picasso.Picasso;

import java.util.List;

import models.Movie;

public class MovieAdapter extends RecyclerView.Adapter<MovieViewHolder> {
    private List<Movie> movies;
    private LayoutInflater inflater;

    // Constructor
    public MovieAdapter(Context context, List<Movie> movies) {
        this.inflater = LayoutInflater.from(context);
        this.movies = movies;
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = inflater.inflate(R.layout.activity_item_movie, parent, false);
        return new MovieViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {
        Movie currentMovie = movies.get(position);

        // Log para el path de la imagen y el rating
        Log.d("MovieAdapter", "Cargando película: " + currentMovie.getTitle());
        Log.d("MovieAdapter", "Path de la imagen: " + currentMovie.getPosterPath());
        Log.d("MovieAdapter", "Rating: " + currentMovie.getRating());

        holder.movieTitle.setText(currentMovie.getTitle());
        holder.movieRating.setText(String.valueOf(currentMovie.getRating()));
        Picasso.get().load(currentMovie.getImageUrl()).into(holder.movieImage);
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    // Método para actualizar la lista de películas
    public void setMovies(List<Movie> movies) {
        this.movies = movies;
        notifyDataSetChanged();
    }
}
