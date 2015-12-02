/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarios;
import biblioteca.*;

/**
 *
 * @author stand
 */
public class Cliente {
    private String nombre;
    private String Cedula;
    private Recurso[] recursos;
    
    public String toString(){
        System.out.println("%%--Calificaciones--%%");
	System.out.println("NOMBRE: " + this.nombre);
	System.out.println("CEDULA: " + this.Cedula);
        
        return "-----------";
    }
}
