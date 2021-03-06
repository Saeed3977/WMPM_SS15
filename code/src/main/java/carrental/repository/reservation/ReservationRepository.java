package carrental.repository.reservation;

import carrental.Constants;
import carrental.model.reservation.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.PersistenceContext;

/**
 * Created by Michael on 13.05.2015.
 */
@Repository
@PersistenceContext(unitName= Constants.RESERVATION_PU)
public interface ReservationRepository extends CrudRepository<carrental.model.reservation.Reservation, Long> {
}
