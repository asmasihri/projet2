package com.example.projet2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projet2.Repo.modulerepo;
import com.example.projet2.entity.module;

@Service
public class moduleservice {
   @Autowired 
   modulerepo modulerepo ; 

   public module addmodule(module module) {
      return modulerepo.save(module) ;  
   }
   public List<module> getmodule(){
      return modulerepo.findAll() ; 
   }
   public void deletemodule(Long id ){
      module deletemodule = modulerepo.findById(id).orElseThrow(null); 
      modulerepo.delete(deletemodule);
      
   }
   public module updtaModule(module module , Long id) {
      module moduleupdate = modulerepo.findById(id).orElseThrow(null); 
      moduleupdate.setNamemodule(module.getNamemodule());
      return modulerepo.save(moduleupdate) ; 
      
   }

   
}
