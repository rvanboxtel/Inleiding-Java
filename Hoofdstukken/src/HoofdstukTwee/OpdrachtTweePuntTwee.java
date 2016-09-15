package HoofdstukTwee;

import java.awt.*;
import java.applet.*;

public class OpdrachtTweePuntTwee extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Romek", 50, 60 );
        g.setColor(Color.red);
        g.drawString("van Boxtel", 50, 80);
    }
}