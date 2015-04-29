package ui;

import java.awt.Image;
import java.io.File;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class SingleButton extends JButton {
    String sorce = "button"+File.separator+"set.png";
    
    //
    ImageIcon icon= new ImageIcon(sorce);
	//
    Image image =icon.getImage();
    /**
     * 
     * @param a is the width of button
     * @param b is the height of button
	 */
    
	public SingleButton(int a,int b) {
	    setBorder(null);
		setOpaque(false);
	    icon.getImage();
	    setBorder(null
	    		);
	    // no changes to picture's content,enlarge or smaller 
		Image image1 = image.getScaledInstance(a, b,  Image.SCALE_DEFAULT);
		Image image2 = image.getScaledInstance(a-5, b-5,  Image.SCALE_DEFAULT);
		
		
		// change the content
	    // ����
		//
		setBackground(null);
		setIcon(new ImageIcon(image1));
		setRolloverIcon(new ImageIcon(image2));
		
		setSize(a,b);
		// TODO Auto-generated constructor stub
	}

	

}
