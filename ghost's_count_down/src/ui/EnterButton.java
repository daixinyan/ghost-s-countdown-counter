package ui;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class EnterButton extends JLabel {
	Image ButtonImage = null;
	String filePath = null;
<<<<<<< HEAD
	public boolean isIn = false;
=======
	static boolean isIn = false, isPressed = false;
	

>>>>>>> origin/master
	

	
	public EnterButton(){
<<<<<<< HEAD
		setBounds(315, 450, 415, 220);
=======
		
		
		addMouseListener(this);	
	}
		
	public void ButtonStart(){
		filePath = "button/enter0.png";
		ButtonImage = new ImageIcon(filePath).getImage();
		this.setBounds(0, 0, 415, 220);

>>>>>>> origin/master
	}
	
	
	public void paintComponent(Graphics g){
		if(isPressed){
			filePath = "button/enter2.png";
			ButtonImage = new ImageIcon(filePath).getImage();
		}
		else if(!isIn){
			filePath = "button/enter0.png";
			ButtonImage = new ImageIcon(filePath).getImage();
		}else{
			filePath = "button/enter1.png";
			ButtonImage = new ImageIcon(filePath).getImage();
		}
		
		g.drawImage(ButtonImage,0,0,this.getWidth(),this.getHeight(),this);
	}

<<<<<<< HEAD
=======
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		isPressed = true;
		this.repaint();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		isIn = true;
		this.repaint();
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		isIn = false;
		this.repaint();
	}
>>>>>>> origin/master
}
