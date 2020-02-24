package peekhotel.bookingbackend.repository;

import org.springframework.data.repository.CrudRepository;
import peekhotel.bookingbackend.models.RoomType;

public interface RoomTypeRepository extends CrudRepository<RoomType, Long> {
}
