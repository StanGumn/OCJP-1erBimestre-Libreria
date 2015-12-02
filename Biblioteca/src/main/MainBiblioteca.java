package main;
import biblioteca.Dvd;
import biblioteca.Libro;
import biblioteca.Periodico;
import biblioteca.Recurso;
import biblioteca.Revista;
import usuarios.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USRBDD
 */
public class MainBiblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Recurso[] recursos;
        recursos = new Recurso[4];
        recursos[0] = new Libro("Maria", "Jose", true, 50);
        recursos[1] = new Revista("Vistazo", "Pedro", true, "Segunda");
        recursos[2] = new Dvd("Tesis", "Yolanda", true, 25);
        recursos[3] = new Periodico("El Comercio", "DRA", true, "Quinta");        
        
        Cliente[] clientes;
        
        for (int i=0; i<recursos.length; i++){
            System.out.println(recursos[i]);
        }
        
     
    }
    
}
