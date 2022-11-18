package tarea3;
import java.awt.*;
import javax.swing.*;

public class PanelCentral extends JPanel{
    private Expendedora expend;
    private Comprador comp;
    
    public PanelCentral(){
        expend = new Expendedora(5,500);
        comp = new Comprador();
        
        setLayout(null);
        setBackground(Color.WHITE);
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        expend.paintComponent(g);
        comp.paintComponent(g);
        
    }
    
    public Comprador getComprador(){
        return comp;
    }
    public Expendedora getExpendedora(){
        return expend;
    }
}
