
package Fondo;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *@author BETTERLEE  Seany Xochitl Bautista Aguilar
 */
public class FondoINe extends JPanel{
    
    public FondoINe(){
        setSize(870, 490);
    }
    
    @Override
    public void paintComponent(Graphics g){
      Dimension tam = getSize();
      ImageIcon fondo = new ImageIcon(getClass().getResource("INEH.jpg"));
      g.drawImage(fondo.getImage(), 0, 0, tam.width, tam.height, null);
      setOpaque(false);
      super.paintComponent(g);
      
    }
}
