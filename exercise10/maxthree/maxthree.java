import java.awt.*;
import java.awt.event.*;

class maxthree extends Frame
implements ActionListener{
	TextField t1,t2,t3;

	public maxthree(){
	//use a flow layout
	setLayout(new FlowLayout());

	t1=new TextField(10);
	t2=new TextField(10);
	t3=new TextField(10);

	add(t1);
	add(t2);
	add(t3);

	t1.addActionListener(this);
	t2.addActionListener(this);
	t3.addActionListener(this);

	addWindowListener(new WindowAdapter(){
	public void windowClosing(WindowEvent we){
	System.exit(0);

	}

	});	
	}

	public void actionPerformed(ActionEvent ae){
	repaint();
	}

	public void paint(Graphics g){
	int a, b, c,result;
	String str;

	g.drawString("enter value of check the maximum of 3",10,50);

	str=t1.getText();
	a=Integer.parseInt(str);
	str=t2.getText();
	b=Integer.parseInt(str);
	str=t3.getText();
	str=t3.getText();
	c=Integer.parseInt(str);

	g.setColor(Color.blue);
	if(a>b){
		if(a>c)
			result=a;
		else
			result=c;
		}
	else{
		if(b>c)
			result=b;
		else
			result=c;
		}

		g.drawString("maximum of 3 no is: "+result,10,70);
		
		}


	public static void main(String ar[]){
	maxthree mt=new maxthree();

	mt.setSize(new Dimension(380, 180));
	mt.setTitle("max of 3 no");
	mt.setVisible(true);
	}
}
