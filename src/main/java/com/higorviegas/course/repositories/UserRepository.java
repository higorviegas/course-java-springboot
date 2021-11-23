package com.higorviegas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.higorviegas.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
