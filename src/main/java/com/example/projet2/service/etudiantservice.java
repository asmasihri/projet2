package com.example.projet2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projet2.Repo.etudiantrepo;
import com.example.projet2.entity.etudiant;

@Service
public class etudiantservice {
   @Autowired
   etudiantrepo etudiantrepo  ; 
   public etudiant addetudiant( etudiant etudiant) {
      return etudiantrepo.save(etudiant) ; 
      
   }
   public List<etudiant> getetudiant() {
      return etudiantrepo.findAll() ; 
      
   }
   public etudiant updateetudiant(etudiant etudiant , Long id) {
      etudiant findfournissuer = etudiantrepo.findById(id).orElseThrow(null) ; 
      findfournissuer.setNom(etudiant.getNom());
      findfournissuer.setDatedenaissance(etudiant.getDatedenaissance());
      findfournissuer.setPrenom(etudiant.getPrenom());
      findfournissuer.setDepartement(etudiant.getDepartement());

      return etudiantrepo.save(findfournissuer) ; 
   }
    public void deleteetudiant(Long id ) {
      etudiant etudiantfind = etudiantrepo.findById(id).orElseThrow(null) ; 
      etudiantrepo.delete(etudiantfind);
    

      
    }

}
