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
public class Descendente extends Thread{
    
    @Override
    public void run(){
        for(int i=5000; i>=0; i--){
            System.out.println("Descendente"+i);
        }
    }
}
