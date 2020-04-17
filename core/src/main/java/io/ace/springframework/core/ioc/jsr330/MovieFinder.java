package io.ace.springframework.core.ioc.jsr330;

public class MovieFinder {
    private String movie;

    public MovieFinder(String movie) {
        this.movie = movie;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    @Override
    public String toString() {
        return "MovieFinder{" +
                "movie='" + movie + '\'' +
                '}';
    }
}
