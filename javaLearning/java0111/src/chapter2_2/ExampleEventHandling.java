package chapter2_2;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ExampleEventHandling extends Applet implements MouseListener{
    StringBuffer strBuffer;
    public void init(){
        addMouseListener(this);
        strBuffer=new StringBuffer();
        addItem("initializing the applet ");
    }
    void addItem (String word){
        System.out.println(word);
        strBuffer.append(word);
        repaint();
    }
    public void paint(Graphics g){
        g.drawRect(0,0,getWidth()-1,getHeight()-1);
        g.drawString(strBuffer.toString(),10,20);
    }
    public void start(){
        addItem("starting the applet ");
    }
    public void stop(){
        addItem("stopping the applet ");
    }
    public void destroy(){
        addItem("unloading the applet");
    }
    public void mouseEntered(MouseEvent event){}
    public void mouseExited(MouseEvent event){}
    public void mousePressed(MouseEvent event){}
    public void mouseReleased(MouseEvent event){}
    public void mouseClicked(MouseEvent event){
        addItem("mouse clicked! ");
    }
}
