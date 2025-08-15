package ticket.booking.system.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ticket.booking.system.model.Movie;
import ticket.booking.system.repository.MovieJpaRepository;
import ticket.booking.system.service.MovieService;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieJpaRepository movieJpaRepository;


    @Override
    public List<Movie> getAll() {
        return movieJpaRepository.findAll();
    }
}
