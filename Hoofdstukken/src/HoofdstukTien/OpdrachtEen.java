package HoofdstukTien;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.*;

/**
 * Created by romek on 27-09-16.
 */
public class OpdrachtEen extends Applet
{

    TextField txt1;
    Label lbl1;
    String s, cijfer;
    long cijfer1, cijfer2;

    public void init()
    {
        txt1 = new TextField("",30);
        lbl1 = new Label("type een cijfer");
        txt1.addActionListener(new txt1listen());
        add (lbl1);
        add (txt1);
    }
    public void paint(Graphics g)
    {
        g.drawString(cijfer1+"",20,40);
    }

    class txt1listen implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            cijfer2 = Long.parseLong(txt1.getText());

            if ((cijfer2>cijfer1))
            {
                cijfer1 = cijfer2;
                txt1.setText(null);
                repaint();
            }
        }
    }
}
