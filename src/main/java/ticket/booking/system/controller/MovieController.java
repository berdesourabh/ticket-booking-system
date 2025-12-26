package ticket.booking.system.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ticket.booking.system.model.Movie;
import ticket.booking.system.service.MovieService;

import java.util.List;

@RestController
@RequestMapping("v1/movies")
@Slf4j
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/")
    public List<Movie> getAllMovies() {
        log.info("Fetching all movies");
        return movieService.getAll();
    }
}
