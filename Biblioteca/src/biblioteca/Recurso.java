/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

public abstract class Recurso implements Prestable{
    
    private String nombre;
    private String autor;
    private boolean estado;

    public Recurso(String nombre, String autor, Boolean estado) {
        this.nombre = nombre;
        this.autor = autor;
        this.estado = estado;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getAutor(){
        return this.autor;
    }
    public boolean getEstado(){
        return this.estado;
    }
    
    public String toString(){
        return "Nombre del Recurso: "+this.nombre+"\nAutor: "+this.autor+"\n";
    }
           
}
