package HoofdstukVier; /**
 * Created by romek on 06-09-16.
 */
import java.awt.*;
import java.applet.*;

public class OpdrachtVierPuntTwee extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawLine(50, 50, 150,20 );
        g.drawRect(50, 50, 150,150);
        g.drawLine(150, 20, 200,50 );
        g.drawLine(120, 200, 120, 160);
        g.drawLine(140, 200, 140, 160);
        g.drawLine(120, 160, 140, 160);
        g.drawLine(100, 180, 70, 180);
        g.drawLine(100, 160, 100, 180);
        g.drawLine(100, 160, 70, 160);
        g.drawLine(70, 160, 70, 180);
    }
}