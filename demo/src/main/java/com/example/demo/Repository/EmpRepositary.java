package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.pojo.Employe;

public interface EmpRepositary extends JpaRepository<Employe, Integer> {

}
