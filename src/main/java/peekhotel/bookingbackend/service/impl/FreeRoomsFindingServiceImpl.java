package peekhotel.bookingbackend.service.impl;
import peekhotel.bookingbackend.models.Room;
import peekhotel.bookingbackend.repository.BookingRepository;
import peekhotel.bookingbackend.service.FreeRoomsFindingService;

import java.time.LocalDate;
import java.util.List;

public class FreeRoomsFindingServiceImpl implements FreeRoomsFindingService {
    private final BookingRepository bookingRepository;

    public FreeRoomsFindingServiceImpl(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    @Override
    public List<Room> freeRoomsFinding(LocalDate start, LocalDate end) {
        return null;
    }
}
