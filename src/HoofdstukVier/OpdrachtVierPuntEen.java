package HoofdstukVier; /**
 * Created by romek on 06-09-16.
 */

import java.awt.*;
import java.applet.*;

public class OpdrachtVierPuntEen extends Applet {

    public void init() {
        setBackground(Color.white);
    }
    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawLine(100, 200, 200, 50);
        g.drawLine(300, 200, 200, 50);
        g.drawLine(100, 200, 300, 200);
    }

}