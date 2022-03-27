package hilopropiedes;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Hilo extends Thread{
    
    private JLabel label;

    public void setLabel(JLabel label) {
        this.label = label;
    }
    
    @Override
    public void run(){
        int x = 10000000;
        
        label.setText("-------------- INICIA HILO " + getName() + " --------------");
        while(x>0){
            label.setText(x + " ----->> " + getName());
            x--;
            try{
                sleep(100);
            }
            catch(InterruptedException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
                break;
            }
        }
    }
}