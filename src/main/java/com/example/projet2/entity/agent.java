package com.example.projet2.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class agent {

   @Id
   @GeneratedValue(strategy =  GenerationType.IDENTITY)
   private Long id ; 
   @NotBlank
   private String nom ; 
   private String prenom  ; 
   private String role ; 
   @Email
   private String email ; 



   
}
