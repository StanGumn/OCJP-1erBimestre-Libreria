package main;
import biblioteca.Dvd;
import biblioteca.Libro;
import biblioteca.Periodico;
import biblioteca.Recurso;
import biblioteca.Revista;
import java.util.Scanner;
import usuarios.*;
import javax.swing.JOptionPane;
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
        int opcion=-1,searchRecurso =0, aux=0;
        String libroSearch="", dvdSearch="", revistaSearch="", periodicoSearch="";
        Scanner scanner = new Scanner(System.in);
        
        Recurso[] recursos;
        recursos = new Recurso[8];
        recursos[0] = new Libro("Juego de Tronos", "George R. R. Martin", true, 500);
        recursos[1] = new Revista("Vistazo", "Ecuavisa", true, "Segunda");
        recursos[2] = new Dvd("tesis saew", "Little Jhony", true, 25);
        recursos[3] = new Periodico("El Comercio", "Grupo El Comercio", true, "Quinta");        
        recursos[4] = new Libro("OCJP", "Carlos Anchundia", true, 300);
        recursos[5] = new Revista("Pandilla", "Grupo El Comercio", true, "Tercera");
        recursos[6] = new Dvd("Proyecto de 1er Bimestre", "Angel & Stalin", true, 50);
        recursos[7] = new Periodico("Extra", "Grupo Extra", true, "Primera");  
        
        Cliente[] clientes;
        clientes = new Cliente[4];
        clientes[0]=new Cliente("Stalin Guaman","1719105262");
        clientes[1]=new Cliente("Angel Molina","0503087371");
                
        /*for (int i=0; i<recursos.length; i++){
           System.out.println(recursos[i]);
        }
        
        for (int i=0; i<clientes.length; i++){
           System.out.println(clientes[i]);
        }*/
        do{
            opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"Elige opción:\n1.- Buscar Recursos" +
				"\n2.- Ver Datos de los clientes" +
				"\n0.- Salir"));
            //opcion=JOptionPane.showInputDialog(null, scannerpcion);
            //opcion= Integer.parseInt(scanner.nextLine());
            switch(opcion){
                case 1:
                    searchRecurso=Integer.parseInt(JOptionPane.showInputDialog(null,"Elige opción:\n1.- Buscar Libros" +
				"\n2.- Buscar DVD" +
                                "\n3.- Buscar Revista" +
                                "\n4.- Buscar Periodico" +
                                "\n0.- Salir"));
                    switch(searchRecurso){
                        case 1:
                            libroSearch=JOptionPane.showInputDialog(null,"Ingresa el nombre del Libro que deseas buscar");
                            for (int i=0;i<recursos.length ;i++){
                                if (libroSearch.equals(recursos[i].getNombre())){
                                    JOptionPane.showMessageDialog(null,recursos[i].toString());
                                    aux=1;
                                    break;
                                } 
                            }
                            
                            if (aux!=1){
                                JOptionPane.showMessageDialog(null,"El Libro no se encuentra en la Biblioteca");
                                
                            }
                            aux=0;
                            break;
                        case 2:
                            dvdSearch=JOptionPane.showInputDialog(null,"Ingresa el nombre del DVD que deseas buscar");
                            for (int i=0;i<recursos.length;i++){
                                if (dvdSearch.equals(recursos[i].getNombre())){
                                    JOptionPane.showMessageDialog(null,recursos[i].toString());
                                    aux=1;
                                    break;
                                }   
                            }
                            
                            if (aux!=1){
                                JOptionPane.showMessageDialog(null,"El DVD no se encuentra en la Biblioteca");
                                
                            }
                            aux=0;
                            break;
                            
                        case 3:
                            revistaSearch=JOptionPane.showInputDialog(null,"Ingresa el nombre de la REVISTA que deseas buscar");
                            for (int i=0;i<recursos.length;i++){
                                if (revistaSearch.equals(recursos[i].getNombre())){
                                    JOptionPane.showMessageDialog(null,recursos[i].toString());
                                    aux=1;
                                    break;
                                } 
                                
                            }
                            
                            if (aux!=1){
                                JOptionPane.showMessageDialog(null,"La Revista no se encuentra en la Biblioteca");
                               
                            }
                            aux=0;
                            break;
                        case 4:
                            periodicoSearch=JOptionPane.showInputDialog(null,"Ingresa el nombre del PERIODICO que deseas buscar");
                            for (int i=0;i<recursos.length;i++){
                                if (periodicoSearch.equals(recursos[i].getNombre())){
                                    JOptionPane.showMessageDialog(null,recursos[i].toString());
                                    aux=1;
                                    break;
                                } 
                                
                            }
                            
                            if (aux!=1){
                                JOptionPane.showMessageDialog(null,"El Periodico no se encuentra en la Biblioteca");
                                
                            }
                            aux=0;
                            break;  
                    }
                    
                    break;
                case 2:
                    break;
                    
            }
        }while (opcion!=0);
        
        
     
    }
    
}
