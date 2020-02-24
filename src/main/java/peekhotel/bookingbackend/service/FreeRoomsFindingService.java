package peekhotel.bookingbackend.service;

import peekhotel.bookingbackend.models.Room;

import java.time.LocalDate;
import java.util.List;

public interface FreeRoomsFindingService {
    List<Room> freeRoomsFinding(LocalDate start, LocalDate end);
}
