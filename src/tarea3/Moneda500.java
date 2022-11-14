package tarea3;
import java.awt.*;

public class Moneda500 extends Moneda {
    public Moneda500(){
        super();
        this.setBounds(0,0,20,20);
    }

    @Override
    public int getValor() {
        return 500;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.magenta);
        g.fillOval(getX(),getY(),getWidth(),getHeight());
    }
}
