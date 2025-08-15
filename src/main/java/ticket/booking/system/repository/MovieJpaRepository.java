package ticket.booking.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ticket.booking.system.model.Movie;

@Repository
public interface MovieJpaRepository extends JpaRepository<Movie, Long> {

}
