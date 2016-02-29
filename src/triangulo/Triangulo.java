/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulo;

/**
 *
 * @author Estudiante
 */
public class Triangulo {
    
    private Punto p1;
    private Punto p2;
    private Punto p3;
    
    private Color colorRelleno;
    private Color colorLinea;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
    }

    public Triangulo(Punto p1, Punto p2, Punto p3, Color colorRelleno, Color colorLinea) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.colorRelleno = colorRelleno;
        this.colorLinea = colorLinea;
        
    }
    
}
