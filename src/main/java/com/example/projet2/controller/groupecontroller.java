package com.example.projet2.controller;

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

import com.example.projet2.entity.groupe;
import java.util.List;

import com.example.projet2.service.groupeservice;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/groupe")
public class groupecontroller {
   @Autowired 
   groupeservice groupeservice ; 
   @PostMapping("/add")
   public groupe addgroupe(@RequestBody groupe groupe) {
      return groupeservice.addgroupe(groupe); 

      
   }
   @GetMapping("/get")
   public List<groupe> getgroups() {
      return groupeservice.getgroupe(); 
      
   }
   @PutMapping("/update/{id}")
   public groupe updategroupe(@PathVariable Long id , @RequestBody groupe groupe ) {
      return groupeservice.updategroupe(groupe, id) ; 

      
   }
   @DeleteMapping("/delete/{id}")
   public void deletegroupe(@PathVariable Long id ) {
      groupeservice.deletegroupe(id);
      
   }
   

   
}
