package peekhotel.bookingbackend.repository;

import org.springframework.data.repository.CrudRepository;
import peekhotel.bookingbackend.models.User;

public interface UserRepository extends CrudRepository<User, Long> {
}
