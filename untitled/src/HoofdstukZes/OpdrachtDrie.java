package HoofdstukZes;

/**
 * Created by romek on 14-09-16.
 */
import java.awt.*;
import java.applet.*;


public class OpdrachtDrie extends Applet {
    int intValue1;
    int intValue2;
    int result1;

    public void init(){

        intValue1 = 56;
        intValue2 = 42;
        result1 = intValue1 + intValue2;
    }

    public void paint(Graphics g) {
        g.drawString("Addition: -" + result1, 50, 60);
    }
}
