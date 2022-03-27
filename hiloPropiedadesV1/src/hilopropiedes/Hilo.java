package hilopropiedes;


public class Hilo extends Thread{
    
    @Override
    public void run(){
        int x = 1000000;
        System.out.println("-------------- INICIA HILO " + getName() + " --------------");
        while(x>0){
            System.out.println(x + " ----->> " + getName());
            x--;
        }
    }
}
