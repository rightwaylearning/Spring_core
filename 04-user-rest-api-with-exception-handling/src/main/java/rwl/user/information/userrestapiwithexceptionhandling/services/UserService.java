package rwl.user.information.userrestapiwithexceptionhandling.services;

import java.util.Optional;

import rwl.user.information.userrestapiwithexceptionhandling.entity.User;


public interface UserService {
	
	// save single object if object is exits then update
		public User save(User user);
		
		// save bulk object
		public Iterable<User> saveAll(Iterable<User> lsit);
		
		// find by Id
		public Optional<User> findById(Integer id);
		
		// confirmation is exit ??
		public boolean existsById(Integer id);
		
		// select * from T
		public Iterable<User> findAll();
		
		// search bulk object & also pass bulk Id object 
		public Iterable<User> findAllById(Iterable<Integer> ids);
		
		// select count(*) from T
		public long count();
		
	   // single delete pass id as input
		public void deleteById(Integer id);
		
		// single delete pass object
		public void delete(User entity);
		
		// bulk delete pass input as Collection of ID
		public void deleteAllById(Iterable<Integer> ids);
		
		// bulk delete pass input as Collection of Customer object
		public void deleteAll(Iterable<User> entities);
		
		// delete from T
		public void deleteAll();


}
