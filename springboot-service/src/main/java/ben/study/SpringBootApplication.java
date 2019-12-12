package ben.study;

import ben.study.data.entity.Guest;
import ben.study.data.entity.Reservation;
import ben.study.data.entity.Room;
import ben.study.data.repository.GuestRepository;
import ben.study.data.repository.ReservationRepository;
import ben.study.data.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@org.springframework.boot.autoconfigure.SpringBootApplication
public class SpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplication.class, args);
    }
}
