package HoofdstukVier; /**
 * Created by romek on 08-09-16.
 */
import java.awt.*;
import java.applet.*;

public class OpdrachtVierPuntVijf extends Applet {

    public void init() {
    }

    public void paint(Graphics g){
        setBackground(Color.blue);
        g.drawArc(20, 20, 100, 50, 90, 380);
        g.setColor(Color.yellow);
        g.fillArc(20, 20, 100, 50, 90, 380);

    }
}
