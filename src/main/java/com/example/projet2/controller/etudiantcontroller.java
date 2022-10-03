package com.example.projet2.controller;
import com.example.projet2.entity.etudiant;
import com.example.projet2.service.etudiantservice ;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/etudiant")
public class etudiantcontroller {
   @Autowired 
   etudiantservice etudiantservice ; 
  @PostMapping("/add")
  public etudiant addetudiant( @RequestBody etudiant etudiant) {
   return etudiantservice.addetudiant(etudiant); 
   
  }
  @GetMapping("/get")
  public List<etudiant > getetudiant(){
   return etudiantservice.getetudiant(); 
  }
  @PutMapping("/update/{id}")
  public etudiant updateetudiant(@RequestBody etudiant etudiant , @PathVariable Long id  ){
    return etudiantservice.updateetudiant(etudiant, id) ; 

  }

  @DeleteMapping("/delete/{id}")
  public void deleteetudiant(@PathVariable Long id){
    etudiantservice.deleteetudiant(id);
  }
   
}

