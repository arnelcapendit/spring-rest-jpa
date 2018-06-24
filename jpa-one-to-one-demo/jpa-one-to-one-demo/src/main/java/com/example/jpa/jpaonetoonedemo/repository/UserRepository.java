package com.example.jpa.jpaonetoonedemo.repository;

import com.example.jpa.jpaonetoonedemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
