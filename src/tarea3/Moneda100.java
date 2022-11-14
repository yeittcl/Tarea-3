
package tarea3;
import java.awt.*;

public class Moneda100 extends Moneda{
    public Moneda100(){
        super();
        this.setBounds(0,0,20,20);
    }

    @Override
    public int getValor() {
        return 100;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.green);
        g.fillOval(getX(),getY(),getWidth(),getHeight());
    }
}
