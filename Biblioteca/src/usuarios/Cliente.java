/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarios;
import biblioteca.*;

public class Cliente {
    private String nombre;
    private String cedula;
    private Recurso[] recursos;
    
    public Cliente(String nombre, String cedula){
        this.nombre=nombre;
        this.cedula=cedula;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getCedula(){
        return this.cedula;
    }
    
    public String toString(){
             
        return "%%---------------- CLIENTE ----------------%%\nNombre: "+this.nombre+"\nCedula: "+this.cedula+"\n-------------------------------------------\n\n";
    }
}
