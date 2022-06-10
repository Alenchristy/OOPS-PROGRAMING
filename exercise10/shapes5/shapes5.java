/*
5. Develop a program that has a Choice component which contains
the names of shapes such as rectangle, triangle, square and circle.
Draw the corresponding shapes for given parameters as per user’s
choice.
*/



import java.awt.*;
import java.awt.event.*;

class choice extends Frame
implements ItemListener {
Choice shapes;
String msg = "";

public choice() {

// Use a flow layout.
setLayout(new FlowLayout());
// Create choice lists.
shapes = new Choice();


// Add items to os list.
shapes.add("rectangle");
shapes.add("square");
shapes.add("triangle");
shapes.add("circle");



add(shapes);


// Add item listeners.
shapes.addItemListener(this);


addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent we) {
System.exit(0);
}
});
}

public void itemStateChanged(ItemEvent ie) {
repaint();
}

// Display current selections.
public void paint(Graphics g) {
msg = "Current shape: ";
msg = shapes.getSelectedItem();
g.drawString(msg, 20, 120);

if(msg.equals("rectangle")){
g.setColor(Color.orange);
g.fillRect(10, 200, 200, 100);
	}

else if(msg.equals("square")){
g.setColor(Color.red);
g.fillRect(150, 150, 250, 250);
	}

else if(msg.equals("triangle")){
int xpoints[] = {150, 300, 450};
int ypoints[] = {250, 180, 250};
int num = 3;

g.setColor(Color.magenta);
g.fillPolygon(xpoints, ypoints, num);

}

else if(msg.equals("circle")){
g.setColor(Color.red);
g.fillOval(21, 200, 150, 150);

 }

}

public static void main(String[] args) {
choice c = new choice();

c.setSize(new Dimension(500, 650));
c.setTitle("ChoiceDemo");
c.setVisible(true);
}
}
