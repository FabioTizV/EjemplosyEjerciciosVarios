package clases;

import java.awt.*;
import java.applet.Applet;

public class Gl extends Applet 
{
    public Gl() 
    {
        setLayout(new GridLayout(3,2));
        add(new Button("1"));
        add(new Button("2"));
        add(new Button("3"));
        add(new Button("4"));
        add(new Button("5"));
        add(new Button("6"));
    }

}