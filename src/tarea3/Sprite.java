package tarea3;
import java.awt.*;

public class Sprite extends Bebida{
    public Sprite(int serie){
        super(serie);

        setBounds(0,0,20,20);
        setOpaque(false);
    }
    @Override
    public String getSabor() {
        return "sprite";
    }

    @Override
    public String beber() {
        return "sabor: sprite";
    }
    
   @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.green);
        g.fillRect(getX(),getY(),getWidth(),getHeight());
    }
}
