/*
1. Program to draw Circle, Rectangle, Line
*/


import java.awt.event.*;
import java.awt.*;

class graphics extends Frame {

public graphics() {
// Anonymous inner class to handle window close events.
addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent we) {
System.exit(0);
}
});
}

public void paint(Graphics g) {


Color c1 = new Color(255, 100, 100);


// Draw lines.
g.setColor(c1);
g.drawLine(5, 80, 400, 80);

// Draw rectangles.
g.setColor(Color.orange);
g.fillRect(10, 200, 200, 100);


// Draw Elipses and Circles

g.setColor(Color.red);
g.fillOval(21, 399, 150, 150);



}

public static void main(String[] args) {
graphics gr = new graphics();

gr.setSize(new Dimension(700, 800));
gr.setTitle("Line,Rectangel,Crcle");
gr.setVisible(true);
}
}





