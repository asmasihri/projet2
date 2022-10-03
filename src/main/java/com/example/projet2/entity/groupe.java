package com.example.projet2.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor 
@AllArgsConstructor
public class groupe {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id ; 

   @ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(	name = "groupe_etudiant", 
				joinColumns = @JoinColumn(name = "groupe"), 
				inverseJoinColumns = @JoinColumn(name = "etudiant"))
 
   private Set<etudiant>  etudiant = new HashSet<>() ; 
   private String namegroupe ; 
   

   
}
