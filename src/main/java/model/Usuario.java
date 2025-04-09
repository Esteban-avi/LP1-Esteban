/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author avila
 */
public class Usuario {
    private long id;
    private String usuario;
    private String contra;

    public Usuario(){
    
    } // Constructor vacío para Jackson

    public long getId(){ 
        return id; 
    }
    public void setId(long id){ 
        this.id = id; 
    }

    public String getUsuario(){ 
        return usuario; 
    }
    public void setUsuario(String usuario){ 
        this.usuario = usuario; 
    }

    public String getContra(){ 
        return contra; 
    }
    public void setContra(String contra){ 
        this.contra = contra; 
    }
    
}
