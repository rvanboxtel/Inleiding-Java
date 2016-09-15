package HoofdstukTwee; /**
 * Created by romek on 06-09-16.
 */
import java.awt.*;
import java.applet.*;

public class OpdrachtTweePuntEen extends Applet {

    public void init() {
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Romek", 50, 60 );
    }
}