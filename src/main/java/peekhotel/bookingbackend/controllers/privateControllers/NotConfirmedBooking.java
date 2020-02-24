package peekhotel.bookingbackend.controllers.privateControllers;

import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import peekhotel.bookingbackend.models.Booking;
import peekhotel.bookingbackend.repository.BookingRepository;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class NotConfirmedBooking {

    private final BookingRepository bookingRepository;

    public NotConfirmedBooking(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    @GetMapping(path = "/notConfirmedBooking")
    public List<Booking> getAllNotConfirmedBookings(){
        return bookingRepository.findAllByIsActive(false);
    }
}
