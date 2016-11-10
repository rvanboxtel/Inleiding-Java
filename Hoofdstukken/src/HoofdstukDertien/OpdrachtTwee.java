package HoofdstukDertien;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Romek on 09-11-16.
 */
public class OpdrachtTwee extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        tekendriehoek(g, 10, 80, 20, 40, 30, 60);
    }

    void tekendriehoek(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {
        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x2, y2, x3, y3);
        g.drawLine(x3, y3, x1, y1);
    }
}