package models;

import com.google.gson.annotations.SerializedName;

public class Movie {
    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public void setOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    private String title; // Título de la película
    private String overview; // Descripción o sinopsis de la película
    @SerializedName("poster_path")
    private String posterPath; // Nombres diferentes en JSON y Java
    @SerializedName("vote_average")
    private double rating; // Nombres diferentes en JSON y Java
    @SerializedName("original_language")
    private String originalLanguage; // Nombres diferentes en JSON y Java
    @SerializedName("release_date")
    private String releaseDate; // Nombres diferentes en JSON y Java

    // Constructor
    public Movie(String title, String overview, String posterPath, double rating, String originalLanguage, String releaseDate) {
        this.title = title;
        this.overview = overview;
        this.posterPath = posterPath;
        this.rating = rating;
        this.originalLanguage = originalLanguage;
        this.releaseDate = releaseDate;
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
