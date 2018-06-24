package com.example.jpa.jpamanytomanydemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.jpa.jpamanytomanydemo.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}
