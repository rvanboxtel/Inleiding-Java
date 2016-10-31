package HoofdstukTwaalf;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Romek on 31-10-16.
 */
public class OpdrachtTwee extends Applet {

    Button[] buttons = new Button[25];

    public void init() {
        setSize(400, 200);
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new Button("Button nr" + (i + 1));
            add(buttons[i]);
        }
    }
}
