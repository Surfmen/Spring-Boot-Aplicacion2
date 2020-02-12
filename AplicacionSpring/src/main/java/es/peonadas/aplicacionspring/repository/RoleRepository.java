package es.peonadas.aplicacionspring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import es.peonadas.aplicacionspring.entity.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {

}
