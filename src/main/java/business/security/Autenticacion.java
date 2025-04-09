/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import model.Usuario;

/**
 *
 * @author avila
 */
public class Autenticacion {
    
    public long signin(String usuario, String contra) {
        long iduser = -1;
        
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            File file = new File("src/main/java/data/Usuario.json");
            
            Usuario user = objectMapper.readValue(file, Usuario.class);
            
            if (user.getUsername().equals(usuario) && user.getPassword().equals(contra)) {
                iduser = user.getId();
            }
        } catch (IOException ex) {
            System.out.println("[json] Problema de acceso a los datos");
        }
        
        return iduser;
    }

}