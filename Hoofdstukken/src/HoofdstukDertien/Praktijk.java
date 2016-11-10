package HoofdstukDertien;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Romek on 10-11-16.
 * How to Create tree
 */
public class Praktijk extends Applet {
    public void init() {
        setSize(500, 500);
    }

    public void paint(Graphics g) {
        // Loop om twee of meer rijen te hebben
        for (int headloop = 0; headloop < 6; headloop++) {
            for (int secondloop = 0; secondloop < 3; secondloop++) {
                tekenboom(g, headloop * 80 + 20 * (secondloop % 2), (secondloop + 5) * 40);
            }

        }
    }

    // Het tekenen van de boom
    void tekenboom(Graphics g, int x, int y) {
        //Boomstam
        g.setColor(new Color(51, 25, 0));
        g.fillRect(x, y, 20, 40);
        // bladeren
        g.setColor(Color.green);
        g.fillOval(x - 20, y - 30, 60, 40);
    }
}
