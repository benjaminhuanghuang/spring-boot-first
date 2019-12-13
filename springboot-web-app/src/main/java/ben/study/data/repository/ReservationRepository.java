package ben.study.data.repository;

import ben.study.data.entity.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long> {
    /*
        Spring data build query based on the name of the method
     */
    Iterable<Reservation> findReservationByReservationDate(Date date);
}
