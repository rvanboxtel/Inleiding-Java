package HoofdstukVijf;

/**
 * Created by romek on 12-09-16.
 */
import java.awt.*;
import java.applet.*;

public class OpdrachtTwee extends Applet {
    int GewichtJ;
    int GewichtV;
    int GewichtH;
    public void init(){
        setBackground(Color.white);

        GewichtJ = 195;
        GewichtV = 110;
        GewichtH = 150;
    }
    public void paint(Graphics g){
        g.setColor(Color.black);
        g.drawRect(110, 11, 200,20);
        g.drawRect(30, 31, 80,20);
        g.drawRect(30, 51, 80,20);
        g.drawRect(30, 11, 80,20);
        g.drawRect(30, 71, 80,20);
        g.drawString("Hans:",35,85);
        g.drawString("Jeroen:",35,65);
        g.drawString("Valerie:",35,45);
        g.drawString("Kinderen.",35,25);
        g.drawString("Gewicht in kg.     40,       80,       100,",115,24);
        g.setColor(Color.red);
        g.fillRect(110, 31, GewichtV ,20);
        g.setColor(Color.green);
        g.fillRect(110, 51, GewichtJ,20);
        g.setColor(Color.blue);
        g.fillRect(110, 71, GewichtH,20);


    }
}