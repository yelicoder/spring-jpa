package com.pluralsight.conference.repository;

import com.pluralsight.conference.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository{
	
	public User save(User user);

}
