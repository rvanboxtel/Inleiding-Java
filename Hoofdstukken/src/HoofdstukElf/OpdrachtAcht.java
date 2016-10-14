package HoofdstukElf;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Romek on 14-10-16.
 */
public class OpdrachtAcht extends Applet {

    public void init(){
        setSize(1000,1000);
    }

    public void paint(Graphics g) {
        int i = 0;
        int x = 0;
        int y = 0;
        int width = 10;
        int height = 10;
        while (i <= 500)
        {

            g.drawOval(x, y, width, height);
            width += 10;

            height += 10;
            i++;
        }
    }
}
