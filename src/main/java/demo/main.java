/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package demo;

import business.security.Autenticacion;
import gui.FormSignin;

/**
 *
 * @author avila
 */
public class main {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
//         Autenticacion auth = new Autenticacion();
//
//        // Datos de prueba
//        String usuario = "admin";
//        String contra = "#123456$";
//
//        long resultado = auth.signin(usuario, contra);
//
//        if (resultado != -1) {
//            System.out.println("Inicio de sesión exitoso. ID del usuario: " + resultado);
//        } else {
//            System.out.println("Usuario o contra incorrectos.");
//        }
        FormSignin Ventana = new FormSignin(); //Crear ventana de inicio de Sesion
        
        Ventana.abrir(); //Abrir ventana

    }
}
