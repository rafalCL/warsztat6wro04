package pl.coderslab.warsztat6wro04.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.coderslab.warsztat6wro04.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
