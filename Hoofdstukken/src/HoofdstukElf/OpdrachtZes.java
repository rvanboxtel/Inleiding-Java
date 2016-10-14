package HoofdstukElf;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Romek on 14-10-16.
 */
public class OpdrachtZes extends Applet {

    public void paint(Graphics g) {
        int i = 0;
        int x = 50;
        int y = 50;
        int width = 10;
        int height = 10;
        while (i <= 5)
        {

            g.drawOval(x, y, width, height);
            width += 10;
            x -= 5;
            y -= 5;
            height += 10;
            i++;
        }
    }
}
