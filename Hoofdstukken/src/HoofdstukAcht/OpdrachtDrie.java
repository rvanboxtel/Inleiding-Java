package HoofdstukAcht;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by romek on 21-09-16.
 */
public class OpdrachtDrie extends Applet
{
    Label label1;
    TextField textvak;
    Button enter;
    Button reset;
    double BTWpercentage;
    double prijs;
    String s;
    public void init()
    {
        BTWpercentage = 1.21;
        setSize (200,200);
        label1 = new Label("€ Inclusief BTW");
        textvak = new TextField("voer hier de prijs zonder BTW in",26);
        enter = new Button ();
        reset = new Button ();
        enter.setLabel ("Enter");
        reset.setLabel ("Reset");
        Listen1 L = new Listen1();
        Listen2 L2 = new Listen2();
        Listen3 L3 = new Listen3();
        enter.addActionListener(L);
        reset.addActionListener(L2);
        textvak.addActionListener(L3);
        add (enter);
        add (reset);
        add (textvak);
        add (label1);

    }


    class Listen1 implements ActionListener
    {
        public void actionPerformed( ActionEvent e)
        {
            prijs = Double.parseDouble(textvak.getText());
            prijs = prijs * BTWpercentage;
            textvak.setText(String.format("%.2f", Double.valueOf(prijs)));
            repaint();
        }
    }
    class Listen2 implements ActionListener
    {
        public void actionPerformed( ActionEvent e)
        {
            textvak.setText(null);
            repaint();
        }
    }
    class Listen3 implements ActionListener
    {
        public void actionPerformed( ActionEvent e)
        {
            prijs = Double.parseDouble(textvak.getText());
            prijs = prijs * BTWpercentage;
            textvak.setText(String.format("%.2f", Double.valueOf(prijs)));
            repaint();
        }
    }
}
