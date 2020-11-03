package ru.diasoft.security_demo.repository;

import org.springframework.data.repository.CrudRepository;
import ru.diasoft.security_demo.domain.User;

import java.util.Optional;

public interface UserRepo extends CrudRepository<User, Long> {

    Optional<User> findUserByUsername(String username);
}
