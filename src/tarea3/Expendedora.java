
package tarea3;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class Expendedora extends JPanel{
    private int numBebida, precioBebida;
    private DepositoBebida depositoCoca, depositoSprite, depositoFanta;
    private DepositoCompra depositoCompra;
    private ArrayList<Moneda> depositoMoneda;
    private DepositoVuelto depositoVuelto;
    
    public Expendedora(int numBebida, int precioBebida){
        this.numBebida = numBebida;
        this.precioBebida = precioBebida;
        depositoMoneda = new ArrayList();
        
        depositoCoca = new DepositoBebida();
        depositoSprite = new DepositoBebida();
        depositoFanta = new DepositoBebida();
        depositoCompra = new DepositoCompra();
        depositoVuelto = new DepositoVuelto();

        for(int i=0; i<numBebida; i++){
            CocaCola tempCoca = new CocaCola(100+i);
            Sprite tempSprite = new Sprite(200+i);
            Fanta tempFanta = new Fanta(300+i);
            depositoCoca.addBebida(tempCoca);
            depositoSprite.addBebida(tempSprite);
            depositoFanta.addBebida(tempFanta);
        }
        setBounds(500,150,400,500);
        setOpaque(false);
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.DARK_GRAY);
        g.fillRect(getX(),getY(),getWidth(),getHeight());

        g.setColor(Color.white);
        g.fillRect(getX()+10,getY()+10,getWidth()-100,getHeight()-100);
        g.setColor(Color.black);
        g.drawLine(getX()+110,getY()+10,getX()+110,getY()+410);
        g.drawLine(getX()+210,getY()+10,getX()+210,getY()+410);
        depositoCoca.paintComponent(g);
        depositoSprite.paintComponent(g);
        depositoFanta.paintComponent(g);
        
        g.setColor(Color.black);
        g.drawRect(900, 150, 50, 300);
        
        depositoCompra.paintComponent(g);
        depositoVuelto.paintComponent(g);
        
    }
}