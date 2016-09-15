package HoofdstukZes;

/**
 * Created by romek on 14-09-16.
 */
import java.awt.*;
import java.applet.*;


public class OpdrachtTwee extends Applet {
    int seconden;
    int minuten;
    int secondenineenuur;
    int uur;
    int dag;
    int secondenineendag;
    int secondenineenjaar;

    public void init() {
        seconden = 60;
        minuten = 60;
        secondenineenuur = seconden * minuten;
        uur = 24;
        dag = 365;
        secondenineendag = secondenineenuur * uur;
        secondenineenjaar = secondenineendag * dag;

    }

    public void paint(Graphics g) {

        g.drawString("Er zitten zoveel seconden in een uur " + secondenineenuur , 50, 60 );
        g.drawString("Er zitten zoveel seconden in een dag " + secondenineendag , 50, 80 );
        g.drawString("Er zitten zoveel seconden in een jaar " + secondenineenjaar , 50, 100 );
    }
}