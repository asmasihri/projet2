package com.example.projet2.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.projet2.entity.module;

@Repository 
public interface modulerepo extends JpaRepository<module , Long >{
   
}
