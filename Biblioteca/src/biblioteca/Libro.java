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
public class Libro extends Recurso{

    private int numeroDePaginas;
    
    public Libro(String nombre, String autor, Boolean estado, int numeroPaginas) {
        super(nombre, autor, estado);
        this.numeroDePaginas = numeroPaginas;
    }

    @Override
    public boolean isPrestable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String toString(){
       // System.out.println("------- Libro -------\n");
        return "--------- Libro ---------\n"+super.toString()+"Nunero de Paginas: "+this.numeroDePaginas+"\n";
    }
    
    
}
