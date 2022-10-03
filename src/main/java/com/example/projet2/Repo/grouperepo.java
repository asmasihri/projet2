package com.example.projet2.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.projet2.entity.groupe;

@Repository
public interface grouperepo extends JpaRepository<groupe , Long > {
   
}
