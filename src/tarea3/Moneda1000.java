
package tarea3;
import java.awt.*;

public class Moneda1000 extends Moneda {
    public Moneda1000(){
        super();
        this.setBounds(0,0,20,20);
    }

    @Override
    public int getValor() {
        return 1000;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.yellow);
        g.fillOval(getX(),getY(),getWidth(),getHeight());
    }
    
}
