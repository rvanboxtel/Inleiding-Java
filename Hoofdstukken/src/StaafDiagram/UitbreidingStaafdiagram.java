package StaafDiagram;

/**
 * Created by romek on 22-09-16.
 */
import java.awt.*;
import java.applet.*;
import java.awt.event.ActionListener;
import java.awt.event.*;


@SuppressWarnings("serial")
public class UitbreidingStaafdiagram extends Applet {
    int GewichtV, GewichtJ, GewichtH;
    TextField vakJ;
    TextField vakH;
    TextField vakV;
    Button knop1;

    public void init() {
        //Gewicht Valerie.
        GewichtV = 40;
        //Gewicht Hans.
        GewichtH = 80;
        //Gewicht Jeroen.
        GewichtJ = 100;
        //Init voor buttons en textfields
        vakJ = new TextField();
        vakH = new TextField();
        vakV = new TextField();
        knop1 = new Button("submit");
        Listen1 l1 = new Listen1();
        knop1.addActionListener(l1);
        add(vakJ);
        add(vakH);
        add(vakV);
        add(knop1);
    }

    class Listen1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            GewichtJ = Integer.parseInt(vakJ.getText());
            GewichtH = Integer.parseInt(vakH.getText());
            GewichtV = Integer.parseInt(vakV.getText());
            vakJ.setText("J");
            vakH.setText("H");
            vakV.setText("V");
            repaint();
        }

    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawRect(110, 41, 280,20);
        g.drawRect(30, 61, 80,20);
        g.drawRect(30, 81, 80,20);
        g.drawRect(30, 41, 80,20);
        g.drawRect(30, 101, 80,20);
        g.drawString("Hans:",35,115);
        g.drawString("Jeroen:",35,95);
        g.drawString("Valerie:",35,75);
        g.drawString("Kinderen.",35,55);
        g.drawString("0  10  20  30  40  50  60  70  80 90 100 110",115,54);
        g.setColor(Color.red);
        g.fillRect(110, 61, (GewichtV * 2) ,20);
        g.setColor(Color.green);
        g.fillRect(110, 81, (GewichtJ * 2),20);
        g.setColor(Color.blue);
        g.fillRect(110, 101, (GewichtH * 2),20);
    }
/* Omdat ik 2 pixels per kilogram nodig heb worden de formules voor de pixels altijd met
 * 2 vermenigvuldigt.
 */

}