/**
 * Created by romek on 14-09-16.
 */
import java.applet.Applet;
import java.awt.*;

public class challange extends Applet {
    Font myFont = new Font("dovahkiin", Font.BOLD, 40);

    public void init() {
        setSize(1000, 1000);


    }

    public void paint(Graphics g) {
        g.setFont(myFont);
        g.drawString("you should realy kill yourself", 50, 60);
        g.drawString("Fus Ro Dah", 50, 100);
    }
}
     