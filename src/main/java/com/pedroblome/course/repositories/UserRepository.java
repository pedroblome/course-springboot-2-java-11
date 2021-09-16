package com.pedroblome.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedroblome.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
