package com.storymanagement.storymanagement.services;

import java.util.List;

import com.storymanagement.storymanagement.payloads.userDto;

public interface userService {


     userDto createUser(userDto user);
     userDto updateUser(userDto user, Integer userId);
     userDto getUserById(Integer userId);
     List<userDto> getAllUser();
     void deleteUser(Integer userId);
      
}
