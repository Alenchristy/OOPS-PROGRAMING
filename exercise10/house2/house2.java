/*2. Using 2D graphics commands in an Applet, construct a house.
On mouse click event, change the color of the door from blue to
red.*/


import java.awt.event.*;
import java.awt.*;

class house extends Frame 
implements MouseListener, MouseMotionListener{



public house() {
addMouseListener(this);
addMouseMotionListener(this);
addWindowListener(new MyWindowAdapter());
}


public Color wind =Color.blue;

public void mouseClicked(MouseEvent me) {
    if(wind ==Color.blue){

        wind =Color.RED;

    }
    else if(wind ==Color.RED){
        wind =Color.blue;

    }

repaint();
}

public void mouseEntered(MouseEvent me) {
    
}
public void mouseExited(MouseEvent me) {
   
}
public void mousePressed(MouseEvent me) {

}
public void mouseReleased(MouseEvent me) {
}
public void mouseDragged(MouseEvent me) {
}

public void mouseMoved(MouseEvent me){
}

public void paint(Graphics g) {



// Draw a polygon
int xpoints[] = {150, 300, 450};
int ypoints[] = {250, 180, 250};
int num = 3;
g.setColor(Color.black);
g.fillPolygon(xpoints, ypoints, num);
g.setColor(Color.green);
g.fillRect(160,250, 280, 150);
g.setColor(wind);
g.fillRect(270,300, 60, 100);
g.setColor(Color.orange);

g.fillRect(440,250,285,150);

g.setColor(Color.magenta);
int x1points[]= {450, 300, 700, 780};
int y1points[]= {250, 180, 180, 250};
int num1=4;
g.fillPolygon(x1points, y1points, num1);

g.setColor(Color.black);
g.drawLine(320, 200,722, 200);
g.drawLine(350, 230,757, 230);



g.setColor(Color.magenta);
g.fillRect(511,287,143,80);

g.setColor(Color.black);
g.drawLine(511, 325,654, 325);
g.drawLine(582, 287,582,367 );

}

public static void main(String[] args) {
house h = new house();

h.setSize(new Dimension(800, 700));
h.setTitle("House");
h.setVisible(true);
}
}



class MyWindowAdapter extends WindowAdapter {
public void windowClosing(WindowEvent we) {
System.exit(0);
} }
