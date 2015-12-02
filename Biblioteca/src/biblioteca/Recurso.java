/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author USRBDD
 */
public abstract class Recurso implements Prestable{
    
    private String nombre;
    private String autor;
    private boolean estado;

    public Recurso(String nombre, String autor, Boolean estado) {
        this.nombre = nombre;
        this.autor = autor;
        this.estado = estado;
    }
           
}
