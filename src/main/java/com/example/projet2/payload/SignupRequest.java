package com.example.projet2.payload;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class SignupRequest {
   @NotBlank 
   @Size(min = 3, max = 20)

   private String username ; 
   @NotBlank
   @Size( max = 50)

   private String email ; 
   @NotBlank
   @Size(min = 6, max = 20)
   

   private String password ; 

}
