package HoofdstukVier;

/**
 * Created by romek on 08-09-16.
 */
import java.awt.*;
import java.applet.*;

public class Praktijk extends Applet {

    public void init() {
        setBackground(Color.white);
    }
    public void paint(Graphics g) {
        g.drawLine(100, 50,  300, 50);
        g.drawRect(100, 100, 200, 100);
        g.drawRoundRect(100, 225, 200, 100, 30, 30);
        g.setColor(Color.magenta);
        g.fillRect(315, 100, 200, 100);
        g.fillArc(560, 100, 200, 100, 20, 45);
        g.setColor(Color.black);
        g.drawString("Lijn",180,70);
        g.drawString("Rechthoek",170,215);
        g.drawString("Afgeronde Rechthoek",140,340);
        g.drawString("Gevulde Rechthoek met ovaal",320,215);
        g.drawString("Taartpunt met ovaal eromheen",580,215);
        g.drawString("Gevulde Ovaal",370,340);
        g.drawString("Cirkel",635,340);
        g.drawOval(560, 100, 200, 100);
        g.drawOval(315, 100, 200, 100);
        g.drawOval(600, 225, 100, 100);
        g.setColor(Color.magenta);
        g.fillOval(315, 225, 200, 100);





    }
}