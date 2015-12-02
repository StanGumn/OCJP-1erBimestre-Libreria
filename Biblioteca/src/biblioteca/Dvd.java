/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;


public class Dvd extends Recurso{

    private int capacidad;
    
    public Dvd(String nombre, String autor, Boolean estado, int capacidad) {
        super(nombre, autor, estado);
        this.capacidad = capacidad;
    }
    
    @Override
    public boolean isPrestable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String toString(){
        return "--------- DVD ---------\n"+super.toString()+"Capacidad: "+this.capacidad+"\n";
    }
}
