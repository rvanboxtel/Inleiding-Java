package HoofdstukTien;

/**
 * Created by romek on 27-09-16.
 */
import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class OpdrachtVier extends Applet
    {
        TextField txt1;
        TextField txt2;
        Label lbl;
        String text,s,dagen, jaars;
        int maand, jaar, schrikkel, schrikkelfalse;

    public void init()
    {
        Vaklisten vl = new Vaklisten();
        txt1 = new TextField("maand",20);
        txt2 = new TextField("jaar",20);
        lbl = new Label("typ een getal");
        txt1.addActionListener(vl);
        txt2.addActionListener(vl);
        add (lbl);
        add (txt1);
        add (txt2);
    }
    public void paint(Graphics g)
    {
        g.drawString("de maand heet: "+ text, 40, 100);
        g.drawString("de maand heeft "+dagen+" dagen",40, 120);

    }
    class Vaklisten implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            s = txt1.getText();
            jaars = txt2.getText();
            maand = Integer.parseInt(s);
            jaar = Integer.parseInt(jaars);
            schrikkel = jaar%4;
            schrikkelfalse = jaar%400;
            switch(maand)
            {
                case 1:
                    text = "Januari";
                    dagen = "31";
                    break;
                case 2:
                    text = "Februari";
                    if (schrikkel == 0 &&!( schrikkelfalse == 0)){
                        dagen = "29";
                    }
                    else
                    {
                        dagen = "28";
                    }

                    break;
                case 3:
                    text = "Maart";
                    dagen = "31";
                    break;
                case 4:
                    text = "April";
                    dagen = "30";
                    break;
                case 5:
                    text = "Mei";
                    dagen = "31";
                    break;
                case 6:
                    text = "Juni";
                    dagen = "30";
                    break;
                case 7:
                    text = "Juli";
                    dagen = "31";
                    break;
                case 8:
                    text = "Augustus";
                    dagen = "31";
                    break;
                case 9:
                    text = "September";
                    dagen = "30";
                    break;
                case 10:
                    text = "Oktober";
                    dagen = "31";
                    break;
                case 11:
                    text = "November";
                    dagen = "30";
                    break;
                case 12:
                    text = "December";
                    dagen = "31";
                    break;
                default:
                    text = "Dit is geen maand...!";
                    dagen = null;
                    break;

            }
            repaint();
        }
    }
}