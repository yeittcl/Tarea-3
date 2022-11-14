package tarea3;
import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;

public class DepositoVuelto extends JPanel{
    private ArrayList<Moneda> deposito;
    
    public DepositoVuelto(){
        deposito = new ArrayList<>();
    }
    
    public void addMoneda(Moneda moneda){
        deposito.add(moneda);
    }
    public Moneda getMoneda(){
        if(deposito.isEmpty()){
            return null;
        }else{
            return deposito.remove(0);
        }
    }
    public Boolean isEmpty(){
        return deposito.isEmpty();
    }
    
    public void crearVuelto(int precioMoneda, int precioBebida){
        if(precioMoneda>precioBebida){
            for(int i=0; i<(precioMoneda-precioBebida)/100;i++){
                deposito.add(new Moneda100());
            }
        }
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        if(deposito.isEmpty()){
            
        }else{
            Moneda aux = deposito.get(0);
            for(int i=0; i < deposito.size() && i < 5; i++){
                aux = deposito.get(i);
                aux.setBounds(900, 150+(40*i), 40, 40);
                aux.paintComponent(g);
            }
        }
    }
}
