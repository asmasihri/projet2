package com.example.projet2.controller;

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

import com.example.projet2.entity.module;
import com.example.projet2.service.moduleservice;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/module")
public class modulecontroller {
   @Autowired 
   moduleservice moduleservice ; 
   @PostMapping("/add")
   public module addmodule(@RequestBody module module) {
      return moduleservice.addmodule(module) ;
      
      
   }
   @GetMapping("/get")
   public List<module >getmodule( ) {
      return moduleservice.getmodule(); 
      
   }
   @PutMapping("/update/{id}")
   public module updatemodule(@PathVariable Long id , @RequestBody module module ) {
      return moduleservice.updtaModule(module, id) ; 

      
   }
   @DeleteMapping("/delete/{id}")
   public void deleteModule(@PathVariable Long id ) {
       moduleservice.deletemodule(id);
      
   }
}
