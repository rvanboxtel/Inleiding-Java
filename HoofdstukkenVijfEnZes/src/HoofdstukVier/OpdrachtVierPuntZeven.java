package HoofdstukVier;

/**
 * Created by romek on 08-09-16.
 */
import java.awt.*;
import java.applet.*;

public class OpdrachtVierPuntZeven extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawRect(100,100,100,100);
        g.setColor(Color.black);
        g.fillArc(110,110,10,10,0,360);
        g.fillArc(180,180,10,10,0,360);
        g.fillArc(180,110,10,10,0,360);
        g.fillArc(110,180,10,10,0,360);
    }
}
