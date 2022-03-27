/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refuerzo;
import javax.swing.JFrame;

/**
 *
 * @author juanj
 */
public class EJGUI {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame v = new JFrame();
        v.setBounds(100,100,400,400);
        v.setTitle("Mi Objeto");
        v.setResizable(false);
        v.setVisible(true);
        
        Detalle v2[];
        v2 = new Detalle[5];
        for(int i=0; i<5; i++){
            v2[i]=new Detalle();
            v2[i].setTitle("Ventana " + (i+1));
            v2[i].setLocation(500,200+(i*100));
            v2[i].setVisible(true);
        }
    }
    
}
