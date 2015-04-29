package ui;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class EnterPanel extends JPanel {
	
	public EnterButton eb;
	
	public EnterPanel(int w,int h){
	    
		setLayout(null);
		setOpaque(false);
		//setBounds(0, 0, w, h);
		eb = new EnterButton();
		add(eb);
	}
	
	public void paint(Graphics g){
          
		  ImageIcon imgIcon = new ImageIcon("background/enterBackground.png");
		  Image img = imgIcon.getImage();
		  g.drawImage(img,0,0,getWidth(),getHeight(),null);
		  
		  super.paintChildren(g);
	  }
	 
	
}
