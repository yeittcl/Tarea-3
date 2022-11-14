package tarea3;
import java.awt.*;
import javax.swing.*;

public class CocaCola extends Bebida{
   public CocaCola(int serie){
        super(serie);

        setBounds(0,0,20,20);
        setOpaque(false);
    }
    @Override
    public String getSabor() {
        return "cocacola";
    }

    @Override
    public String beber() {
        return "sabor: cocacola";
    }
    
   @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.red);
        g.fillRect(getX(),getY(),getWidth(),getHeight());
    }
}
