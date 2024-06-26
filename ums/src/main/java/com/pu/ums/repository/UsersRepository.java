package com.pu.ums.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pu.ums.model.UsersModel;

public interface UsersRepository extends JpaRepository<UsersModel,Integer>{
	Optional<UsersModel> findByLoginAndPassword(String login,String password);
	Optional<UsersModel> findFirstByLogin(String login);
}
