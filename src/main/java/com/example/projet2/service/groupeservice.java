package com.example.projet2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projet2.Repo.grouperepo;
import com.example.projet2.entity.groupe;

@Service
public class groupeservice {
   @Autowired
   grouperepo grouperepo ; 
   public groupe addgroupe(groupe groupe) {
      return grouperepo.save(groupe); 
   }
   public List<groupe> getgroupe() {
      return grouperepo.findAll() ; 
      
   }

   public  void deletegroupe(Long id ) {
           grouperepo.deleteById(id);   
   }
   public groupe updategroupe(groupe groupe , Long id ) {
      groupe groupe1 = grouperepo.findById(id).orElseThrow(null) ; 

      groupe1.setNamegroupe(groupe.getNamegroupe());
   
      return  grouperepo.save(null);

      
   }
   
}
