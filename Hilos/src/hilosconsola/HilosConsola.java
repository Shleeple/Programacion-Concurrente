/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilosconsola;
import java.util.Scanner;

public class HilosConsola {
    
    public static void main(String[] args) { //static hace que todos los objetos de la clase HilosConsola compartan el mismo main
        
        Scanner entrada = new Scanner(System.in);
        int opc;
        do{
            System.out.println("1. Ascendente\n2. Descendente\n3. Salir\nElige una opción");
            opc = entrada.nextInt();
            switch(opc){
                case 1:
                    Ascendente hilo1;
                    hilo1 = new Ascendente();
                    hilo1.start();
                    break;
                case 2:
                    Descendente hilo2;
                    hilo2 = new Descendente();
                    hilo2.start();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }    
        }while(opc!=3);
        
        
    }
    
}
