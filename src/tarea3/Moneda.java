
package tarea3;
import java.awt.*;
import javax.swing.*;

abstract class Moneda extends JPanel{
    public  Moneda(){}
    public abstract int getValor();
    
    @Override
    public void paintComponent(Graphics g){}
    
}
