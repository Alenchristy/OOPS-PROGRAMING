//Implement a simple calculator using AWT components


import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


class calc implements ActionListener {

  		JFrame jf ;
		JLabel displayLabel;

    String btnString[] = {"7", "8", "9", "4",
            "5", "6", "1", "2",
            "3", ".", "0", "=",
            "/", "x", "-", "+","clr","b"};
            
    JButton btn[] = new JButton[18];
    float num1 = 0, num2 = 0, result = 0;
    char op;

    public calc() {

        Font f = new Font("Arial", Font.PLAIN, 40);
        jf =  new JFrame("Calc");
			jf.setLayout(null);
			jf.setSize(600, 600);
			jf.setLocation(300, 100);
			jf.setVisible(true);
			
			displayLabel=new JLabel();
			displayLabel.setFont(new Font("Calibri", Font.BOLD, 25));

			displayLabel.setBounds(30, 50, 540, 40);
			displayLabel.setBackground(Color.gray);
			displayLabel.setForeground(Color.white);
			displayLabel.setOpaque(true);
			displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
			

        for(int i=0; i < 18; i++) {

            btn[i] = new JButton(btnString[i]);
            btn[i].setFont(f);
            btn[i].addActionListener(this);
            jf.add(btn[i]);
        }
        btn[0].setBounds(30, 130, 80, 80);
        btn[1].setBounds(130, 130, 80, 80);
        btn[2].setBounds(240, 130, 80, 80);
        btn[3].setBounds(30, 230, 80, 80);
        btn[4].setBounds(130, 230, 80, 80);
        btn[5].setBounds(240, 230, 80, 80);
        btn[6].setBounds(30, 330, 80, 80);
        btn[7].setBounds(130, 330, 80, 80);
        btn[8].setBounds(240, 330, 80, 80);
        btn[9].setBounds(30, 430, 80, 80);
        btn[10].setBounds(130, 430, 80, 80);
        btn[11].setBounds(240, 430, 80, 80);
        btn[12].setBounds(340, 130, 80, 80);
        btn[13].setBounds(340, 230, 80, 80);
        btn[14].setBounds(340, 330, 80, 80);
        btn[15].setBounds(340, 430, 80, 80);
        btn[16].setBounds(440, 330, 100, 180);
        btn[17].setBounds(440, 130, 100, 180);
        //btn[17].setEnabled(false);

        jf.add(displayLabel);
			jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent ae) {

        String str = ae.getActionCommand();
		//num1 = Float.parseFloat(displayLabel.getText());
        if(str.equals("+")) {

            op = '+';
			num1 += Float.parseFloat(displayLabel.getText());
            displayLabel.setText("");
        }
        else if(str.equals("-")) {
            op = '-';
            if(num1==0){
            
            	num1 = Float.parseFloat(displayLabel.getText());
            
            }
            else{
            
            	num1 = Float.parseFloat(displayLabel.getText());
            }
           	//num1 = Float.parseFloat(displayLabel.getText());
            displayLabel.setText("");
        }
        else if(str.equals("x")) {
            op = '*';
            num1 = Float.parseFloat(displayLabel.getText());
            displayLabel.setText("");
        }
        else if(str.equals("/")) {
            op = '/';
            num1 = Float.parseFloat(displayLabel.getText());
            displayLabel.setText("");
        }
        else if(str.equals("=")) {

            num2 = Float.parseFloat(displayLabel.getText());

            switch(op) {

                case '+' : result = num1 + num2;
                    break;
                case '-' : result = num1 - num2;
                    break;
                case '*' : result = num1 * num2;
                    break;
                case '/' : result = num1 / num2;
                    break;
            }
            displayLabel.setText(result + "");
            result = 0;
        }
        else if(str.equals("clr")) {

            displayLabel.setText("");
            num1 = num2 = result = 0;
        }
        else if(str.equals("b")){
        		String bck =displayLabel.getText();
				int len =bck.length();
				displayLabel.setText(bck.substring(0, len-1));
        
        }
       /* else if(str.equals(".")){
        	displayLabel.setText(displayLabel.getText() + str);
        
        }*/
        else {
            displayLabel.setText(displayLabel.getText() + str);
        }
    }

    public static void main(String args[]) {

         new calc();
       
    }
}