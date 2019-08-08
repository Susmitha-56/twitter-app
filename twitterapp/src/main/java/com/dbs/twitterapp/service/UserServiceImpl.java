package com.dbs.twitterapp.service;




import com.dbs.twitterapp.model.User;
import com.dbs.twitterapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
	@Transactional
	public User saveUser(User user) {
		 return userRepository.save(user);
		
	}

    @Override
    @Transactional
    public List<User> listAll() {
        return this.userRepository.findAll();
    }

	@Override
	 @Transactional
	public User findById(long userId) {
		return this.userRepository.findById(userId).get();
	}

	@Override
	 @Transactional
	public void deleteUser(long userId) {
		this.userRepository.delete(this.userRepository.findById(userId).get());
		
	}

   


}