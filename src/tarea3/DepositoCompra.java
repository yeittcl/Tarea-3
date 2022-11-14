package tarea3;
import java.awt.*;
import javax.swing.*;

public class DepositoCompra extends JPanel{
    private Bebida bebidaComprada;
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        setBounds(710,565,100,80);
        setOpaque(false);
        
        g.setColor(Color.white);
        g.fillRect(getX(), getY(), getWidth(), getHeight());
        
        if(bebidaComprada != null){
            bebidaComprada.setBounds(getX()+20, getY()+20, 60,30);
            bebidaComprada.paintComponent(g);
        }
    }
    
    public void addBebida(Bebida bebida){
        bebidaComprada = bebida;
    }
    public Bebida getBebida(){
        Bebida aux_bebida = bebidaComprada;
        bebidaComprada = null;
        return aux_bebida;
    }
    public Boolean isEmpty(){
        if(bebidaComprada!= null){
            return false;
        }else{
            return true;
        }
    }
}
