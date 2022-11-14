
package tarea3;
import java.awt.*;
import javax.swing.*;

abstract class Bebida extends JPanel{
    private int serie;
    public Bebida(int serie){
        this.serie = serie;
    }
    public int getSerie(){
        return serie;
    }
    public abstract String beber();
    public abstract String getSabor();
    @Override
    public void paintComponent(Graphics g){};
}
