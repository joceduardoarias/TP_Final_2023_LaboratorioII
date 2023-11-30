package models;

public class Movie {
    private String title; // Título de la película
    private String overview; // Descripción o sinopsis de la película
    private String posterPath; // Ruta del póster de la película
    private double rating; // Calificación de la película

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

    // Puedes agregar aquí cualquier otro campo relevante que quieras incluir
}
