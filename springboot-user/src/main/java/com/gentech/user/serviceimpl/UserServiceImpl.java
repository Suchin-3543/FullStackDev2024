package com.gentech.user.serviceimpl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gentech.user.entity.User;
import com.gentech.user.exception.ResourceNotFoundException;
import com.gentech.user.repository.UserRepository;
import com.gentech.user.service.UserService;


@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository useRepository;
	
	@Override
	public User createUser(User user) {
		return useRepository.save(user);
	}

	@Override
	public List<User> getUsers() {
		return useRepository.findAll();
	}

	@Override
	public User getUser(Long id) {
		return useRepository.findById(id).orElseThrow(() -> 
		new ResourceNotFoundException("User", "id", id));
	}

	
	@Override
	public User updateUser(User user, Long id) {
	    User existingUser = useRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User", "id", id));
	    existingUser.setFirstName(user.getFirstName());
	    existingUser.setLastName(user.getLastName());
	    existingUser.setEmailId(user.getEmailId());
	    existingUser.setPassword(user.getPassword());
	    return useRepository.save(existingUser);
	}
	
	@Override
	public void deleteUser(Long id) {
		 useRepository.findById(id).orElseThrow(() -> 
			new ResourceNotFoundException("User", "id", id));
		 
		 useRepository.deleteById(id);
		
	}

}
