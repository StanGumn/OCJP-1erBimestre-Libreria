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
public class Revista extends Recurso{

    private String edicion;
    
    public Revista(String nombre, String autor, Boolean estado, String edicion) {
        super(nombre, autor, estado);
        this.edicion = edicion;
    }
    
    @Override
    public boolean isPrestable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String toString(){

        return "------- Revista -------\n"+super.toString()+"Edicion: "+this.edicion+"\n";
    }
    
}
