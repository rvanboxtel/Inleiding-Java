package HoofdstukDertien;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Romek on 09-11-16.
 */
public class OpdrachtDrie extends Applet {
    Color red = new Color(255, 81, 76);
    String wall = new String("The Great wall of America");
    String wall3 = new String("No MEXICANS!");
    String wall2 = new String("Provided by President Trump.");

    public void init() {
        setSize(600, 400);
    }

    public void paint(Graphics g) {
        g.drawString("" + wall, 225, 325);
        g.drawString("" + wall2, 220, 350);
        g.drawString("" + wall3, 250, 375);
        for (int muur = 0; muur < 25; muur++) {
            for (int muur1 = 0; muur1 < 25; muur1++) {
                tekenmuur(g, muur * 22 + 10 * (muur1 % 2), muur1 * 12);
            }
        }
    }

    void tekenmuur(Graphics g, int x1, int y1) {
        g.setColor(red);
        g.fillRect(x1, y1, 20, 10);
    }
}
