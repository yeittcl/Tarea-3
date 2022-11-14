
package tarea3;
import java.awt.*;

public class Fanta extends Bebida{
    public Fanta(int serie){
        super(serie);

        setBounds(0,0,20,20);
        setOpaque(false);
    }
    @Override
    public String getSabor() {
        return "fanta";
    }

    @Override
    public String beber() {
        return "sabor: fanta";
    }
    
   @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.orange);
        g.fillRect(getX(),getY(),getWidth(),getHeight());
    }
}
