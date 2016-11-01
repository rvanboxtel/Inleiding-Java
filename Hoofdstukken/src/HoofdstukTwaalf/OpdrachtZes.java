package HoofdstukTwaalf;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;


/**
 * Created by Romek on 01-11-16.
 */
public class OpdrachtZes extends Applet {


    int[] numbers = {0, 0, 0, 1, 1, 1, 2, 2, 3, 4, 5, 6, 6, 6, 7, 8, 8, 9, 9, 9, 9, 10, 10};
    TextField input = new TextField("", 5);
    Button ok = new Button("OK");
    String string = "";
    int count = 0;

    public void init() {
        setSize(400, 400);
        add(input);
        input.addActionListener(new InputListener());
        add(ok);
        ok.addActionListener(new InputListener());
    }

    public void paint(Graphics g) {
        int x = getWidth();
        int y = getHeight();

        g.drawString("" + string, x / 2 - 100, y / 2);
    }

    class InputListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int search = Integer.parseInt(input.getText());
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == search) {
                    count++;
                }
            }
            if (count > 0) {
                string = "De waarde is " + count + " keer gevonden.";
            } else {
                string = "De waarde is niet gevonden.";
            }
            count = 0;
            input.setText("");
            repaint();
        }
    }
}