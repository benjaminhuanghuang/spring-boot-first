package ben.study;

import ben.study.data.entity.Guest;
import ben.study.data.entity.Reservation;
import ben.study.data.entity.Room;
import ben.study.data.repository.GuestRepository;
import ben.study.data.repository.ReservationRepository;
import ben.study.data.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringBootDBApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDBApplication.class, args);
    }


    @RestController
    @RequestMapping("/rooms")
    public class RoomController{
        @Autowired
        private RoomRepository roomRepository;

        @GetMapping
        public Iterable<Room> getRooms(){
            return this.roomRepository.findAll();
        }
    }

    @RestController
    @RequestMapping("/guests")
    public class GuestController{
        @Autowired
        private GuestRepository guestRepository;

        @GetMapping
        public Iterable<Guest> getGuests(){return this.guestRepository.findAll();}
    }

    @RestController
    @RequestMapping("/reservations")
    public class ReservationController{
        @Autowired
        private ReservationRepository reservationRepository;

        @GetMapping
        public Iterable<Reservation> getReservations(){return this.reservationRepository.findAll();}
    }
}
