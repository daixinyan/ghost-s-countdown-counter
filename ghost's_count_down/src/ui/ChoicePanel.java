package ui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class ChoicePanel extends JPanel implements Runnable {

	
	
     /**
	 * 
	 */
	 private static final long serialVersionUID = -5228140076190713934L;
	 public SingleButton single ;
     public DoubleButton doub ;
     public ExitButton   exit ;
     public IntroductionButton  intr ;
     StoryPanel story= new StoryPanel();
     public int y=-520;
 	 public int x=-900;
 	
     int a,b;
     
     public ChoicePanel(int w,int h){
    	 
         a = w/5;
         b = h/5;
    	 setOpaque(false);
    	 setLayout(null);
    	 single = new SingleButton(a,b);
    	 doub = new DoubleButton(a,b) ;
    	 exit = new ExitButton(a,b);
    	 intr = new IntroductionButton(a, b);
    
    	 setLayout(null);
 		setOpaque(false);
 		
 		add(single);
 		single.setBounds(815, 10, 270, 160);
 		
 		add(doub);
 		doub.setBounds(815, 190, 270, 160);
 		
 		add(intr);
 		intr.setBounds(815, 370, 270, 160);
 		
 		TransparentPanel tp= new TransparentPanel();
 		add(tp);
 		tp.setBounds(800, 0, 300, 700);
      
 		add(story);
 		story.setBounds(50,50,700,700);
     }
     @Override
     public void paintComponent(Graphics g){
 		Image background = null;
 		String filepath = "background"+File.separator+"star1.png";
 		background = new ImageIcon(filepath).getImage();
 		g.drawImage(background,x,y,2000,1226,this);
 		//g.drawImage(background,0,0,getWidth(),getHeight(),4
 		//0,0,background.getWidth(null),background.getHeight( null),null);		
 		super.paintChildren(g);
 	}

 	
 	
 	public void run() {
 		// TODO Auto-generated method stub
 		for(int i=0;i<1000;i++){
 		while(x<0&&y<0){
 			try{
 				repaint();
 				Thread.sleep(80);
 				x++;
 				y++;
 			}catch(Exception e){
 				System.out.print("error");
 			}
 		}//x=0,y=0
 		
 		while(x>=-900&&x<=0){
 			try{
 				repaint();
 				Thread.sleep(50);
 				x--;
 			}catch(Exception e){
 				System.out.print("error");
 			}
 		}//x=-900,y=0
 			
 		while(y>=-520&&y<=0){
 			try{
 				repaint();
 				Thread.sleep(50);
 				y--;
 			}catch(Exception e){
 				System.out.print("error");
 			}
 		}//x=-900,y=-520
 		
 		while(x<0&&y<0){
 			try{
 				repaint();
 				Thread.sleep(50);
 				x++;
 			}catch(Exception e){
 				System.out.print("error");
 			}
 		}//x=0,y=-520
 		
 		while(y>=-520&&y<0){
 			try{
 				repaint();
 				Thread.sleep(50);
 				y++;
 			}catch(Exception e){
 				System.out.print("error");
 			}
 		}//x=0,y=0
 		
 		
 		continue;
 		}
 	}
 	
 	

 	
 	
//      public SingleButton single ;
//      public DoubleButton doub ;
//      public ExitButton   exit ;
//      public SetButton   set ;
 //    
//      int a,b;
//      
//      public ChoicePanel(int w,int h){
//     	 
//          a = w/5;
//          b = h/5;
//     	 setOpaque(false);
//     	 setLayout(null);
//     	 single = new SingleButton(a,b);
//     	 doub = new DoubleButton(a,b) ;
//     	 exit = new ExitButton(a,b);
//     	 set = new SetButton(a,b);
//     	 
//     	 add(single);
//     	 single.setBounds(0,0,a,b);
//     	 add(doub);
//     	 doub.setBounds(0,b,a,b);
//     	 add(exit);
//     	 exit.setBounds(0,2*b,a,b);
//     	 add(set);
//     	 set.setBounds(0,3*b,a,b);
//      }
//      
//      

	
}
