package ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.reelreveal.app.R;

public class MovieViewHolder extends RecyclerView.ViewHolder {
    // Vistas para mostrar la información de la película
    public TextView movieTitle;
    public ImageView movieImage;
    public TextView movieRating;

    public MovieViewHolder(View itemView) {
        super(itemView);

        // Inicializar las vistas usando el itemView
        movieTitle = itemView.findViewById(R.id.movie_title);
        movieImage = itemView.findViewById(R.id.movie_image);
        movieRating = itemView.findViewById(R.id.movie_rating);

    }
}
