package tarea3;

import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;

public class Comprador extends JPanel{
    private Moneda moneda;
    private Bebida mano;
    private ArrayList<Moneda> bolsillo;
    
    public Comprador(){
        setBounds(240,210,400,400);
        setOpaque(false);
        bolsillo = new ArrayList<>();
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        g.setColor(Color.cyan);
        int[] triang1_x = {340,365,315};
        int[] triang1_y = {240,210,210};
        g.fillPolygon(triang1_x,triang1_y,3);
        int[] triang2_x = {410,440,440};
        int[] triang2_y = {310,335,285};
        g.fillPolygon(triang2_x,triang2_y,3);
        int[] triang3_x = {340,365,315};
        int[] triang3_y = {380,410,410};
        g.fillPolygon(triang3_x,triang3_y,3);
        int[] triang4_x = {270,240,240};
        int[] triang4_y = {310,335,285};
        g.fillPolygon(triang4_x,triang4_y,3);
        
        if(moneda != null){
            moneda.setBounds(280,250, 120, 120);
            moneda.paintComponent(g);
        }
        if(mano != null){
            mano.setBounds(110,280,90,50);
            mano.paintComponent(g);
        }
        if(!bolsillo.isEmpty()){
            Moneda aux;
            for(int i=0; i<bolsillo.size() && i< 5; i++){
                aux = bolsillo.get(i);
                aux.setBounds(30, 200+(50*i), 40, 40);
                aux.paintComponent(g);
            }
        }
    }
    
    public void darMoneda(int select){
        switch(select){
            case 1: 
                moneda = new Moneda100();
                break;
            case 2: 
                moneda = new Moneda500();
                break;
            case 3: 
                moneda = new Moneda1000();
                break;
        }
    }
    public void comprarBebida(int select, Expendedora expend){
        expend.venderBebida(moneda, select);
        
    }
    
    public void setBebida(Bebida bebida){
        mano = bebida;
        moneda = null;
    }
    
    public void sacarVuelto(Expendedora expend){
        Moneda aux = expend.getVuelto();
        if(aux != null){
            bolsillo.add(aux);
        }
    }
}

