package home.application.teai_pracadomowatydzien6.service;

import home.application.teai_pracadomowatydzien6.model.Movie;

import java.util.List;

public interface MovieService {
    void addMovie(Movie movie);
    List<Movie> getMovieList();

}
