package es.peonadas.aplicacionspring.service;


import es.peonadas.aplicacionspring.entity.User;

public interface UserService {
	
	public Iterable<User> getAllUsers();

	public User createUser(User user) throws Exception;
	
}
