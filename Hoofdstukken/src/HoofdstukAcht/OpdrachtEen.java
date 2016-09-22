package HoofdstukAcht;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OpdrachtEen extends Applet
{
//Variabelen
    Button enter;
    Button reset;
    TextField textor;
    Label label1;
    String letters;
    int schermy, schermx;
    public void init()
    {
        schermx = 1000;
        schermy = 600;
        setSize(schermx,schermy);
        letters = "";
//Label
        label1=new Label("Schrijf wat randoms");
        add(label1);
//Textfield
        textor= new TextField("",20);
        add(textor);
//Plaats text
        enter = new Button();
        enter.setLabel("Enter");
        Listener L = new Listener();
        Listener2 L2 = new Listener2();
        enter.addActionListener(L);
        add(enter);
//Reset text
        reset = new Button();
        reset.setLabel("Reset");
        reset.addActionListener(L2);
        add(reset);

    }

    public void paint(Graphics g)
    {
        g.drawString("U schreef: "+letters, schermx/2, schermy/2 );
    }

    class Listener implements ActionListener
    {
        public void actionPerformed( ActionEvent e){

            letters = textor.getText();
            repaint();
        }
    }
    class Listener2 implements ActionListener
    {
        public void actionPerformed( ActionEvent e){
            letters = "";
            textor.setText("");
            repaint();
        }
    }




}