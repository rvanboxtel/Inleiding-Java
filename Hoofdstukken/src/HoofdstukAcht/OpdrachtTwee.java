package HoofdstukAcht;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Created by romek on 20-09-16.
 */
public class OpdrachtTwee extends Applet {

    int man, vrouw, mleerling, vleerling;
    Button knop1;
    Button knop2;
    Button knop3;
    Button knop4;
    Button knop5;

    public void init () {

        setSize(200,250);
        man = 0;
        vrouw = 0;
        mleerling = 0;
        vleerling = 0;
        Listen1 M = new Listen1();
        Listen2 V = new Listen2();
        Listen3 ML = new Listen3();
        Listen4 MV = new Listen4();
        Listen5 R = new Listen5();
        //New Buttons
        knop1 = new Button();
        knop2 = new Button();
        knop3 = new Button();
        knop4 = new Button();
        knop5 = new Button();
        //Button Labels
        knop1.setLabel("Volwassen man");
        knop2.setLabel("Volwassen vrouw");
        knop3.setLabel("Man leerling");
        knop4.setLabel("Vrouw leerling");
        knop5.setLabel("Reset");
        //Add Actionlisteners
        knop1.addActionListener(M);
        knop2.addActionListener(V);
        knop3.addActionListener(ML);
        knop4.addActionListener(MV);
        knop5.addActionListener(R);
        //add buttons
        add (knop1);
        add (knop2);
        add (knop3);
        add (knop4);
        add (knop5);


    }

    public void paint (Graphics g) {

        g.drawString("Volwassen mannen: "+man, 20, 130);
        g.drawString("Volwassen vrouwen: "+vrouw, 20, 150);
        g.drawString("Mannen leerlingen: "+mleerling, 20, 170);
        g.drawString("Vrouwen leerlingen: "+vleerling, 20, 190);


    }

    //Add Man
    class Listen1 implements ActionListener
    {

        public void actionPerformed( ActionEvent e)
        {

            man++;
            repaint();

        }
    }
    //Add Vrouw
    class Listen2 implements ActionListener
    {
        public void actionPerformed( ActionEvent e)
        {

            vrouw++;
            repaint();

        }
    }
    //Add MLeerling
    class Listen3 implements ActionListener
    {
        public void actionPerformed( ActionEvent e)
        {

            mleerling++;
            repaint();

        }

    }
    //Add VLeerling
    class Listen4 implements ActionListener
    {
        public void actionPerformed( ActionEvent e)
        {

            vleerling++;
            repaint();

        }
    }
    //Reset Button
    class Listen5 implements ActionListener
    {
        public void actionPerformed( ActionEvent e)
        {
            man = 0;
            vrouw = 0;
            mleerling = 0;
            vleerling = 0;
            repaint();

        }
    }
}
