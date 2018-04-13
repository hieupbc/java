package com.qlsv.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.qlsv.entities.User;

//public interface UserRepository {
//	public boolean saveOrUpdate(User users);
//
//	public List<User> list();
//
//	public boolean delete(User users);
//
//}
@Repository
public interface UserRepository extends CrudRepository<User, String> {

	@Override
	public Iterable<User> findAll();
}