package HoofdstukVier;

/**
 * Created by romek on 08-09-16.
 */
import java.awt.*;
import java.applet.*;

public class OpdrachtVierPuntZes extends Applet {

    public void init() {
        setBackground(Color.white);
    }
    public void paint(Graphics g) {
        g.setColor(Color.gray);
        g.fillRect(120,130,10,150);
        g.fillRoundRect(100,10,50,120,20,20);
        g.setColor(Color.red);
        g.fillArc(110, 20,31,31,0,360);
        g.setColor(Color.orange);
        g.fillArc(110, 52,31,31,0,360);
        g.setColor(Color.green);
        g.fillArc(110, 85,31,31,0,360);
    }
}

