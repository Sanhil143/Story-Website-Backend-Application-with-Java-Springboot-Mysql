package com.storymanagement.storymanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.storymanagement.storymanagement.models.user;

public interface userRepo extends JpaRepository<user, Integer>{
      
}
