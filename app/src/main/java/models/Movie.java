package models;

import com.google.gson.annotations.SerializedName;

public class Movie {
    private String title; // Título de la película
    private String overview; // Descripción o sinopsis de la película
    @SerializedName("poster_path")
    private String posterPath; // Nombres diferentes en JSON y Java

    @SerializedName("vote_average")
    private double rating; // Nombres diferentes en JSON y Java

    // Constructor
    public Movie(String title, String overview, String posterPath, double rating) {
        this.title = title;
        this.overview = overview;
        this.posterPath = posterPath;
        this.rating = rating;
    }

    // Getters y Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getImageUrl() {
        return "https://image.tmdb.org/t/p/w500" + posterPath;
    }
}
