package HoofdstukTwaalf;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

/**
 * Created by Romek on 31-10-16.
 */
public class OpdrachtDrie extends Applet {

    TextField[] tekstvelden;
    int[] getallen;
    Button ok;

    public void init() {

        getallen = new int[5];
        tekstvelden = new TextField[5];

        for (int i = 0; i < tekstvelden.length; i++) {
            tekstvelden[i] = new TextField("", 5);
            add(tekstvelden[i]);
        }
        ok = new Button("Oké");
        ok.addActionListener(new Listener());
        add(ok);
    }

    class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < getallen.length; i++) {
                getallen[i] = Integer.parseInt(tekstvelden[i].getText());
            }
            Arrays.sort(getallen);
            for (int i = 0; i < getallen.length; i++) {
                tekstvelden[i].setText("" + getallen[i]);
            }
        }
    }

}
