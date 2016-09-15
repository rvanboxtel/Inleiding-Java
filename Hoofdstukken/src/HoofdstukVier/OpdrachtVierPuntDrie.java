package HoofdstukVier; /**
 * Created by romek on 07-09-16.
 */

import java.awt.*;
import java.applet.*;

public class OpdrachtVierPuntDrie extends Applet {

    public void init() {
        setBackground(Color.orange);
    }
    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawRect(100, 10, 10,200);
        g.fillRect(100, 10, 10,200);
        g.setColor(Color.red);
        g.drawRect(110, 11, 100,20);
        g.fillRect(110, 11, 100,20);
        g.setColor(Color.white);
        g.drawRect(110, 31, 100,20);
        g.fillRect(110, 31, 100,20);
        g.setColor(Color.blue);
        g.drawRect(110, 51, 100,20);
        g.fillRect(110, 51, 100,20);
    }

}