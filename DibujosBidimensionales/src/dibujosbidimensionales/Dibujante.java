/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujosbidimensionales;
import java.awt.Point;
import java.awt.Graphics2D;
import sun.java2d.loops.DrawRect;

/**
 *
 * @author juanj
 */
public class Dibujante {
    private Graphics2D pluma;

    public Dibujante(Graphics2D pluma) {
        this.pluma = pluma;
    }
    
    public void dibujarLinea(int ix, int iy, int fx, int fy){
        pluma.drawLine(ix, iy, fx, fy);
    }
    
    public void dibujarCirculo(int radio, Point center){
        pluma.drawOval(center.x-radio, center.y-radio, radio, radio);
    }
    
    public void dibujarRectangulo(int ancho, int alto, Point ubica){
        pluma.drawRect(ubica.x, ubica.y, ancho, alto);
    }
    
    
    
}