package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.pojo.User;

public interface RegisRepositary extends JpaRepository<User, Integer>{

	User findByNameAndPassword(String name, String password);

}
