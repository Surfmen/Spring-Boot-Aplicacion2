package es.peonadas.aplicacionspring.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import es.peonadas.aplicacionspring.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
