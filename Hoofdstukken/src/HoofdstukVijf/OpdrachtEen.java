package HoofdstukVijf;

/**
 * Created by romek on 09-09-16.
 */
import java.awt.*;
import java.applet.*;

public class OpdrachtEen extends Applet {
    int breedte;
    int lengte;
    Color kleur;


    public void init() {
        setBackground(Color.white);
        breedte = 200;
        lengte = 100;
        kleur = Color.magenta;
    }



    public void paint(Graphics g) {
        g.drawLine(100, 50,  300, 50);
        g.drawRect(100, 100, breedte, lengte);
        g.drawRoundRect(100, 225, breedte, lengte, 30, 30);
        g.setColor(kleur);
        g.fillRect(315, 100, breedte, lengte);
        g.fillArc(560, 100, breedte, lengte, 20, 45);
        g.setColor(Color.black);
        g.drawString("Lijn",180,70);
        g.drawString("Rechthoek",170,215);
        g.drawString("Afgeronde Rechthoek",140,340);
        g.drawString("Gevulde Rechthoek met ovaal",320,215);
        g.drawString("Taartpunt met ovaal eromheen",580,215);
        g.drawString("Gevulde Ovaal",370,340);
        g.drawString("Cirkel",635,340);
        g.drawOval(560, 100, breedte, lengte);
        g.drawOval(315, 100, breedte, lengte);
        g.drawOval(600, 225, lengte, lengte);
        g.setColor(kleur);
        g.fillOval(315, 225, breedte, lengte);





    }
}