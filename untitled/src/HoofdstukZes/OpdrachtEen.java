package HoofdstukZes;

/**
 * Created by romek on 14-09-16.
 */
import java.awt.*;
import java.applet.*;


public class OpdrachtEen extends Applet {
    double a;
    int b;
    double uitkomst;

    public void init() {
        a = 113;
        b = 4;
        uitkomst = a / b;
    }

    public void paint(Graphics g) {
        g.drawString("Jan, Ali, Jeanette en ik krijgen ieder: €" + uitkomst , 20, 20);
    }
}