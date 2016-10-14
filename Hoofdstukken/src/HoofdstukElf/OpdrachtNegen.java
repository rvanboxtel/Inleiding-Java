package HoofdstukElf;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Romek on 14-10-16.
 */
public class OpdrachtNegen extends Applet {

    public void init() {
        setBackground(Color.blue);
        setSize(500,500);
    }

    public void paint(Graphics g) {
        int y = 50;
        int x = 50;
        int breedte = 50;
        int hoogte = 50;
        Color wit = Color.white;
        Color zwart = Color.black;
        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(zwart);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(wit);
                g.fillRect(x, y, breedte, hoogte);
            }
            x += breedte;
        }

        //tweede rij
        x = 50;
        y += hoogte;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(wit);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(zwart);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }
        //Derde Rij
        x = 50;
        y += hoogte;

        for (
                int kolom = 0;
                kolom < 8; kolom++)

        {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(zwart);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(wit);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }
        //Vierde rij
        x = 50;
        y += hoogte;

        for (
                int kolom = 0;
                kolom < 8; kolom++)

        {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(wit);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(zwart);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }
        //Vijfde Rij
        x = 50;
        y += hoogte;

        for (
                int kolom = 0;
                kolom < 8; kolom++)

        {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(zwart);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(wit);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }
        //Zesde Rij
        x = 50;
        y += hoogte;

        for (
                int kolom = 0;
                kolom < 8; kolom++)

        {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(wit);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(zwart);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }
        //zevende Rij
        x = 50;
        y += hoogte;

        for (
                int kolom = 0;
                kolom < 8; kolom++)

        {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(zwart);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(wit);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }
        //Achtste Rij
        x = 50;
        y += hoogte;

        for (
                int kolom = 0;
                kolom < 8; kolom++)

        {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(wit);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(zwart);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }
    }
}
