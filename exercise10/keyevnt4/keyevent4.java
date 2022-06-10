/*
4. Develop a program to handle Key events.
*/


import java.awt.*;
import java.awt.event.*;

class keyevent extends Frame implements KeyListener {

String msg = "";
String keyState = "";
public keyevent() {
addKeyListener(this);
addWindowListener(new
MyWindowAdapter());
}

// Handle a key press.
public void keyPressed(KeyEvent ke) {
keyState = "Key Down";
repaint();
}

// Handle a key release.
public void keyReleased(KeyEvent ke) {

keyState = "Key Up";
repaint();
}

// Handle key typed.
public void keyTyped(KeyEvent ke) {
msg += ke.getKeyChar();
repaint();
}

// Display keystrokes.
public void paint(Graphics g) {
g.setColor(Color.red);
g.drawString(msg, 20, 100);
g.setColor(Color.green);
g.drawString(keyState, 20, 50);
}

public static void main(String[] args) {
keyevent k = new keyevent();

k.setSize(new Dimension(500, 350));
k.setTitle("key event");
k.setVisible(true);
}
}

// When the close box in the frame is clicked,
// close the window and exit the program.
class MyWindowAdapter extends WindowAdapter {
public void windowClosing(WindowEvent we) {
System.exit(0);
}
}
