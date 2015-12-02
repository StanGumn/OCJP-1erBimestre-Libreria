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
public class Periodico extends Recurso{

    private String edicion;
    
    public Periodico(String nombre, String autor, Boolean estado, String edicion) {
        super(nombre, autor, estado);
        this.edicion = edicion;
    }
    
    @Override
    public boolean isPrestable() {
        return false;
    }
    
}
