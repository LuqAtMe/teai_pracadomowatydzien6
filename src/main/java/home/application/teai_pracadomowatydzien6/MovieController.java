package home.application.teai_pracadomowatydzien6;

import home.application.teai_pracadomowatydzien6.aspect.AspectServiceAnnotation;
import home.application.teai_pracadomowatydzien6.model.Movie;
import home.application.teai_pracadomowatydzien6.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {

    MovieService movieServiceImpl;

    @Autowired
    public MovieController(MovieService movieServiceImpl) {
        this.movieServiceImpl = movieServiceImpl;
    }

    @GetMapping
    public List<Movie> movieList() {
        return movieServiceImpl.getMovieList();
    }

    @PostMapping
    @AspectServiceAnnotation
    public String addMovie(@RequestBody Movie movie) {
        movieServiceImpl.addMovie(movie);
        return "Movie added. Mail was sent to your email address";
    }

}
