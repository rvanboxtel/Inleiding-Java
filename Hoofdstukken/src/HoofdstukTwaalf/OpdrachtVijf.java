package HoofdstukTwaalf;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by Romek on 31-10-16.
 */
public class OpdrachtVijf extends Applet {

    int[] nummers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 43, 1984, 235240, 3000, 22, 2016};
    TextField invoer = new TextField("", 5);
    Button oke = new Button("Oké");
    String string = "";
    boolean gevonden = false;
    int index = -1;

    public void init() {
        setSize(450, 450);
        add(invoer);
        invoer.addActionListener(new invoerListener());
        add(oke);
        oke.addActionListener(new invoerListener());
    }

    public void paint(Graphics g) {
        int x = getWidth();
        int y = getHeight();

        g.drawString("" + string, x / 2 - 100, y / 2);
    }

    class invoerListener implements ActionListener {
    }
}
