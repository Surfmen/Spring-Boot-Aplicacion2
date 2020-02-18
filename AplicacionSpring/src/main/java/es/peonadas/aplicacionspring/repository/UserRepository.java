package es.peonadas.aplicacionspring.repository;


import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import es.peonadas.aplicacionspring.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	public Optional<User> findByUsername(String name);

}
