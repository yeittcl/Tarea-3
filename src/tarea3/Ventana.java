package tarea3;
import java.awt.*;
import javax.swing.*;

public class Ventana extends JFrame{
    PanelCentral panel;
    Botones botones;
    
    public Ventana(){
        super();
        setLayout(new BorderLayout());
        setTitle("Tarea 3");
        panel = new PanelCentral();
        botones = new Botones(panel);
        this.add(panel);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000,1000);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
    
}
