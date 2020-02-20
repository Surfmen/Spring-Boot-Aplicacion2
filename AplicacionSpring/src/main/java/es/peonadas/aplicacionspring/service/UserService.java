package es.peonadas.aplicacionspring.service;


import es.peonadas.aplicacionspring.entity.User;

public interface UserService {
<<<<<<< HEAD
=======
	
	public Iterable<User> getAllUsers();

	public User createUser(User user) throws Exception;
>>>>>>> branch 'master' of https://github.com/Surfmen/Spring-Boot-Aplicacion2.git
	
	public Iterable<User> getAllUsers();

	public User createUser(User user) throws Exception;
	
	public User getUserById(Long id) throws Exception;
	
	public User updateUser(User user) throws Exception;
}
