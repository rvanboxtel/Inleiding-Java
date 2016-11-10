package HoofdstukDertien;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;


/**
 * Created by Romek on 09-11-16.
 */
public class OpdrachtVier extends Applet {
    Color red = new Color(255, 81, 76);
    int steensoort;
    String wall = new String("The Great wall of America");
    String wall3 = new String("No MEXICANS!");
    String wall2 = new String("Provided by President Trump.");

    public void init() {
        setSize(600, 600);
        steensoort = 1;
        Button knop1 = new Button("baksteen");
        Button knop2 = new Button("beton");
        Listen1 l1 = new Listen1();
        Listen2 l2 = new Listen2();
        knop1.addActionListener(l1);
        knop2.addActionListener(l2);
        add(knop1);
        add(knop2);
    }

    public void paint(Graphics g) {
        g.drawString("" + wall, 225, 450);
        g.drawString("" + wall2, 220, 475);
        g.drawString("" + wall3, 250, 500);
        if (steensoort == 0) {
            for (int muur1 = 0; muur1 < 25; muur1++) {
                for (int muur2 = 0; muur2 < 25; muur2++) {
                    tekensteen(g, muur1 * 22 + 10 * (muur2 % 2), (muur2 + 5) * 12);
                }
            }
        } else if (steensoort == 1) {
            for (int muur1 = 0; muur1 < 15; muur1++) {
                for (int muur2 = 0; muur2 < 15; muur2++) {
                    tekenbeton(g, muur1 * 42 + 20 * (muur2 % 2), (muur2 + 5) * 22);
                }
            }
        }
    }

    public class Listen1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            steensoort = 0;
            repaint();
        }

    }

    public class Listen2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            steensoort = 1;
            repaint();
        }
    }

    void tekensteen(Graphics g, int x1, int y1) {
        g.setColor(red);
        g.fillRect(x1, y1, 20, 10);
    }

    void tekenbeton(Graphics g, int x1, int y1) {
        g.setColor(Color.gray);
        g.fillRect(x1, y1, 40, 20);
    }
}

