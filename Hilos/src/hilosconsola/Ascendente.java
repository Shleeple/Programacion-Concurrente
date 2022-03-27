/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilosconsola;

/**
 *
 * @author juanj
 */
public class Ascendente extends Thread{
    
    @Override
    public void run(){ //Tarea del hilo
        for(int i=0; i<5000; i++){
            System.out.println("Ascendente"+i);
        }
    }
}
