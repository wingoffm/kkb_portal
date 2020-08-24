package de.wingo.kkb.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import de.wingo.kkb.entities.LoginUsers;

@Repository
public interface LoginUserDAO extends CrudRepository<LoginUsers, Long> {

	List<LoginUsers> findByUserName(String userName);
	
}
