package home.application.teai_pracadomowatydzien6.service;

import home.application.teai_pracadomowatydzien6.model.Movie;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    private List<Movie> movieList;

    public MovieServiceImpl() {
        movieList = new ArrayList<>();
        Movie m1 = new Movie("OBCY - 8. PASAŻER \"NOSTROMO\"", "25 maja 1979 (świat)", "Ridley Scott");
        Movie m2 = new Movie("OBCY - DECYDUJĄCE STARCIE", "14 lipca 1986 (świat)", "James Cameron");
        Movie m3 = new Movie("OBCY 3", "19 maja 1992 (świat)", "David Fincher");
        Movie m4 = new Movie("OBCY: PRZEBUDZENIE", "6 listopada 1997 (świat)", "Jean-Pierre Jeunet");
        movieList.add(m1);
        movieList.add(m2);
        movieList.add(m3);
        movieList.add(m4);
    }

    @Override
    public void addMovie(Movie movie) {
        movieList.add(movie);
    }

    @Override
    public List<Movie> getMovieList() {
        return movieList;
    }
}
