package tarea3;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Botones extends JPanel{
    private PanelCentral panel;
    private JButton bCoca, bSprite, bFanta;
    private JButton bMoneda100, bMoneda500, bMoneda1000;
    private JButton bSacarBebida;
    private JButton bSacarVuelto;
    
    public Botones(PanelCentral panel){
        this.panel = panel;
        
        bCoca = new JButton();
        bSprite = new JButton();
        bFanta = new JButton();
        
        bMoneda100 = new JButton("$100");
        bMoneda500 = new JButton("$500");
        bMoneda1000 = new JButton("$1000");
        
        bSacarBebida = new JButton();
        bSacarVuelto = new JButton();
        
        bCoca.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                panel.getComprador().comprarBebida(1, panel.getExpendedora());
                panel.repaint();
            }
        });
        bCoca.setBounds(830,160,50,50);
        bCoca.setBackground(Color.red);
        panel.add(bCoca);
        
        bSprite.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                panel.getComprador().comprarBebida(2, panel.getExpendedora());
                panel.repaint();
            }
        });
        bSprite.setBounds(830,220,50,50);
        bSprite.setBackground(Color.green);
        panel.add(bSprite);
        
        bFanta.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                panel.getComprador().comprarBebida(3, panel.getExpendedora());
                panel.repaint();
            }
        });
        bFanta.setBounds(830,280,50,50);
        bFanta.setBackground(Color.orange);
        panel.add(bFanta);
        
        bMoneda100.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                panel.getComprador().darMoneda(1);
                panel.repaint();
            }
        });
        bMoneda100.setBounds(100, 550, 100, 100);
        bMoneda100.setBackground(Color.green);
        panel.add(bMoneda100);
        
        bMoneda500.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                panel.getComprador().darMoneda(2);
                panel.repaint();
            }
        });
        bMoneda500.setBounds(210, 550, 100, 100);
        bMoneda500.setBackground(Color.magenta);
        panel.add(bMoneda500);
        
        bMoneda1000.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                panel.getComprador().darMoneda(3);
                panel.repaint();
            }
        });
        bMoneda1000.setBounds(320, 550, 100, 100);
        bMoneda1000.setBackground(Color.yellow);
        panel.add(bMoneda1000);
        
        bSacarBebida.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                panel.getComprador().setBebida(panel.getExpendedora().getBebida());
                panel.repaint();
            }
        });
        bSacarBebida.setBounds(830, 570, 50, 50);
        bSacarBebida.setBackground(Color.blue);
        panel.add(bSacarBebida);
        
        bSacarVuelto.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                
            }
        });
        bSacarVuelto.setBounds(830, 400, 50, 50);
        bSacarVuelto.setBackground(Color.lightGray);
        panel.add(bSacarVuelto);
    }
}
