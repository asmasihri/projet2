package com.example.projet2.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class etudiant {
   @Id 
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id ; 
   private String nom ; 
   private String prenom ; 
   private Date datedenaissance ; 
   private String departement ; 
   private Integer note ; 
   
   

   

   



   
}
