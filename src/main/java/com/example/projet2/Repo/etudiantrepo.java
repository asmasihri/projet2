package com.example.projet2.Repo;

import javax.persistence.Entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.projet2.entity.etudiant;

@Repository
public interface etudiantrepo extends JpaRepository<etudiant , Long >{




   
}
