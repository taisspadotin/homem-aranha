package jogoo;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;

public class jjjj extends JFrame{
    ImageIcon iconPp = new ImageIcon(getClass().getResource("pp.png"));
    ImageIcon iconHmi = new ImageIcon(getClass().getResource("hmi.gif"));
    ImageIcon iconHmii = new ImageIcon(getClass().getResource("hmii.png"));
    
    JLabel lPp = new JLabel(iconPp);
    JLabel lHMI = new JLabel(iconHmii);
    
    int posHMIx= 300;
    int posHMIy= 300;
    
    public jjjj(){
        editarJanela();
        editarComponentes();
        addMovimento();
        
    }
    public void addMovimento(){
        addKeyListener(new KeyListener(){
            
            @Override
            public void keyPressed(KeyEvent e) {
                //System.out.println(e.getKeyCode());
                //para ver o numero da tecla de cima baixo...
                if(e.getKeyCode()==38){
                    posHMIy -=10;
                }
                if(e.getKeyCode()==40){
                    posHMIy +=10;
                }
                
                if(e.getKeyCode()==37){
                    posHMIx -=10;
}
                if(e.getKeyCode()==39){
                    posHMIx +=10;
                }
                lHMI.setBounds(posHMIx, posHMIy, 500, 250);

                
            }
            @Override
            public void keyReleased(KeyEvent e) {
                
                
            }
            @Override
            public void keyTyped(KeyEvent e) {
                
                
            }
        
    });
    }
    public void editarComponentes(){
        lPp.setBounds(0, 0, 800, 700);
        lHMI.setBounds(posHMIx, posHMIy, 500, 250);
    }
    public void editarJanela(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 700);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(null);
        add(lHMI);
        add(lPp);
        
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new jjjj();
    }

}
