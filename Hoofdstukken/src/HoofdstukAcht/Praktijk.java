package HoofdstukAcht;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by romek on 21-09-16.
 */
public class Praktijk extends Applet
{

    TextField vak1;
    TextField vak2;
    TextField vak3;
    Button gedeelddoor;
    Button Keer1;
    Button Min1;
    Button plus1;
    Button Reset;
    double waarde1;
    double waarde2;
    double waarde3;

    public void init()
    {
        setSize(300,250);
        //fields
        vak1 = new TextField(10);
        vak2 = new TextField(10);
        vak3 = new TextField(10);
        Reset = new Button();	//clear button
        gedeelddoor = new Button();	//divide button
        Keer1 = new Button();	//multiply button
        plus1 = new Button();	//plus button
        Min1 = new Button();	//minus button
        //set labels
        Reset.setLabel("Ce");
        gedeelddoor.setLabel("/");
        Keer1.setLabel("*");
        plus1.setLabel("+");
        Min1.setLabel("-");
        //create listeners
        listen1 minus = new listen1();
        listen2 plus = new listen2();
        listen3 div = new listen3();
        listen4 mult = new listen4();
        listen5 ce = new listen5();
        //setting listeners
        plus1.addActionListener(plus);
        Min1.addActionListener(minus);
        gedeelddoor.addActionListener(div);
        Keer1.addActionListener(mult);
        Reset.addActionListener(ce);
        //adding buttons
        add(vak1);
        add(vak2);
        add(vak3);
        add(Reset);
        add(plus1);
        add(Min1);
        add(Keer1);
        add(gedeelddoor);

    }

    public void paint (Graphics g)
    {

    }
    class listen1 implements ActionListener	//min
    {
        public void actionPerformed( ActionEvent e)
        {
            waarde1 = Double.parseDouble(vak1.getText());
            waarde2 = Double.parseDouble(vak2.getText());
            waarde3 = waarde1-waarde2;
            vak1.setText(null);
            vak2.setText(null);
            vak3.setText(String.valueOf(waarde3));
            repaint();
        }
    }
    class listen2 implements ActionListener //Plus
    {
        public void actionPerformed( ActionEvent e)
        {
            waarde1 = Double.parseDouble(vak1.getText());
            waarde2 = Double.parseDouble(vak2.getText());
            waarde3 = waarde1+waarde2;
            vak1.setText(null);
            vak2.setText(null);
            vak3.setText(String.valueOf(waarde3));
            repaint();
        }
    }
    class listen3 implements ActionListener //Gedeeld door
    {
        public void actionPerformed( ActionEvent e)
        {
            waarde1 = Double.parseDouble(vak1.getText());
            waarde2 = Double.parseDouble(vak2.getText());
            waarde3 = waarde1/waarde2;
            vak1.setText(null);
            vak2.setText(null);
            vak3.setText(String.valueOf(waarde3));
            repaint();
        }
    }
    class listen4 implements ActionListener //Keer
    {
        public void actionPerformed( ActionEvent e)
        {
            waarde1 = Double.parseDouble(vak1.getText());
            waarde2 = Double.parseDouble(vak2.getText());
            waarde3 = waarde1*waarde2;
            vak1.setText(null);
            vak2.setText(null);
            vak3.setText(String.valueOf(waarde3));
            repaint();
        }
    }
    class listen5 implements ActionListener //Reset
    {
        public void actionPerformed( ActionEvent e)
        {
            vak1.setText(null);
            vak2.setText(null);
            vak3.setText(null);
            repaint();
        }
    }

}
