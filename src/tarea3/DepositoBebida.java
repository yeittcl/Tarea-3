package tarea3;
import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;

public class DepositoBebida extends JPanel{
    private ArrayList<Bebida> deposito;
    
    public DepositoBebida(){
        deposito = new ArrayList<>();
    }
    
    public void addBebida(Bebida bebida){
        deposito.add(bebida);
    }
    public Bebida getBebida(){
        if(deposito.isEmpty()){
            return null;
        }else{
            return deposito.remove(0);
        }
    }
    public Boolean isEmpty(){
        return deposito.isEmpty();
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        if(deposito.isEmpty()){
        } else {
            Bebida aux = deposito.get(0);
            if("cocacola".equals(aux.getSabor())){
                for (int i = 0; i < deposito.size() && i < 5; i++){
                    aux= deposito.get(i);
                    aux.setBounds(720,(180+(70*i)),80,40);
                    aux.paintComponent(g);
                }
            }
            if("sprite".equals(aux.getSabor())){
                for (int i = 0; i < deposito.size() && i < 5; i++){
                    aux= deposito.get(i);
                    aux.setBounds(620,180+(70*i),80,40);
                    aux.paintComponent(g);
                }
            }
            if("fanta".equals(aux.getSabor())){
                for (int i = 0; i < deposito.size() && i < 5; i++){
                    aux= deposito.get(i);
                    aux.setBounds(520,180+(70*i),80,40);
                    aux.paintComponent(g);  
                }
            }
        }
    }
    
    
}
