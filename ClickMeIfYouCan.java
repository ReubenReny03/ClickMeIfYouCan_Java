package gui_class;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;//89
/*
 Fundamental Layouts in Java
 * Border Layout --> DEFAULT
 * Flow Layout
 * Grind Layout
 * Card Layout
 */

class newway implements ActionListener, MouseListener{
	JButton b1 = new JButton("Click Me if u can");
	JFrame frame = new JFrame();
	boolean flag = true;
	newway(){
		frame.setLayout(null);
		JLabel l1 = new JLabel("Enter name");
		b1.setBounds(0,0,200,50);
		b1.addActionListener(this);
		b1.addMouseListener(this);
		JTextField t1 = new JTextField(20);
		frame.add(l1);
		frame.add(t1);
		frame.add(b1);
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.setTitle("Click me if u Can"); //ReMo
	}
public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1 && flag == true)  {
			JOptionPane.showMessageDialog(frame, "You Got it congo");
		}
		else if(e.getSource() == b1 && flag == false)  {
			JOptionPane.showMessageDialog(frame, "You Got it congo");
		}
		
	}
public void mouseEntered(java.awt.event.MouseEvent evt) {
	if(evt.getSource() == b1 && flag == true)  {
		System.out.println("You Missed lol");
		b1.setBounds(50, 50, 200, 50);
		flag = false;
	}
	else if(evt.getSource() == b1 && flag == false)  {
		System.out.println("You cannot lol");
		b1.setBounds(0,0,200,50);
		flag = true;
	}
}

public void mouseExited(java.awt.event.MouseEvent evt) {
    b1.setBackground(UIManager.getColor("control"));
}
@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

}
public class ClickMeIfYouCan{
	public static void main(String[] args){
		newway n = new newway();
	}

}
