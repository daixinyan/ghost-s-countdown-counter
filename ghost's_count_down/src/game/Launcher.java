package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;

import javax.swing.JPanel;

import service.Music;
import service.Set;
import service.SoundEffect;
import ui.ChoicePanel;
import ui.EnterPanel;
import ui.Frame;
import ui.GamePanel;
import ui.RegisterPanel;
import ui.SetPanel;
import ui.SplashWindow;
import ui.TransparentPanel;


public class Launcher implements KeyListener{
	
	
        boolean      isOnGame     = false; 
	    Mode         currentMode; 
	    boolean      isSingleMode = true; 
	    Frame        frame        = new Frame();
	    ChoicePanel  choicePanel;
	    GamePanel    gamePanel; 
	    JPanel       currentPanel = null;
	    Set          setter       = new Set();
<<<<<<< HEAD
	     PlayerInfo   player;
	    int          currentLocation;
	     Upgrade      upgrade;
=======
	    PlayerInfo   player;
	    
	    Upgrade      upgrade;
>>>>>>> origin/master
	  

        SoundEffect  soundButton;
        SoundEffect  soundLaunch;
        SoundEffect  soundWin;
        SoundEffect  soundFail;
        double       currentLocation ;

         /**
          *location == 0.00 ; enterPanel
          *location == 1.10 ; choicePanel.singleButton
          *location == 1.20 ; choicePanel.doubleButton
          *location == 1.30 ; choicePanel.setButton
          *location == 1.40 ; choicePanel.exitButton
          *location == 1.31 ; setPanel
          *location == 1.11 ; registerPanel
          *location == 2.10 ; upgradePanel
          *location == 2.20 ; gamePanel
          */
	    
        
        
	    public Launcher(){
	    
	    	new SplashWindow().start();
            frame.setVisible(true);
            frame.addKeyListener(this);
            Music mu = new Music("music"+File.separator+"background.wav"); 
            
            soundButton = new SoundEffect("music"+File.separator+"button.wav");
            soundLaunch = new SoundEffect("music"+File.separator+"launch.wav");
            soundWin    = new SoundEffect("music"+File.separator+"beat.wav");
            soundFail   = new SoundEffect("music"+File.separator+"fall.wav");
           
            new  Thread(mu).start();
            soundButton = new SoundEffect("music"+File.separator+"button.wav");
            soundLaunch = new SoundEffect("music"+File.separator+"launch.wav");
            
	        EnterPanel ep = new EnterPanel(frame.getWidth(),frame.getHeight());

	        setCurrentPanel(ep);

	        
	   /* ep.eb.addMouseListener(new MouseListener(){
	        	@Override
	        	public void mouseClicked(MouseEvent e) {
	        		// TODO Auto-generated method stub
                    enterChoices();    System.out.print("fd");  		
	        	}

	        	@Override
	        	public void mousePressed(MouseEvent e) {
	        		// TODO Auto-generated method stub
	        		ep.eb.isPressed = true;
	        		ep.eb.repaint();
	        	}

	        	@Override
	        	public void mouseReleased(MouseEvent e) {
	        		// TODO Auto-generated method stub
	        		ep.eb.isPressed = false;
	        		ep.eb.repaint();
	        		
	        	}

	        	@Override
	        	public void mouseEntered(MouseEvent e) {
	        		// TODO Auto-generated method stub
	        		ep.eb.isIn  = true;
	        		ep.eb.repaint();
	        		
	        	}

	
	        	@Override
	        	public void mouseExited(MouseEvent e) {
	        		// TODO Auto-generated method stub
	        		ep.eb.isIn = false;
	        		ep.eb.repaint();
	        	}
	        });
	          */
	        
	        

	        ep.eb.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					new Thread(soundButton).start();
					enterChoices();
				}
        	
	        });
	    }
	    
	    
	    
	    
	    private void enterChoices() {
					// TODO Auto-generated method stub
			choicePanel = new ChoicePanel(frame.getContentPane().getWidth(), frame.getContentPane().getHeight());	
//			TransparentPanel tp = new TransparentPanel();
			
			setCurrentPanel(choicePanel);
//	        setCurrentPanel(tp);
	        choicePanel.start();
	        choicePanel.grabFocus();
	        choicePanel.addKeyListener(this);
//	        choicePanel.exit.addKeyListener(this);
	        choicePanel.single.addKeyListener(this);
	        choicePanel.doub.addKeyListener(this);
<<<<<<< HEAD
//	        choicePanel.set.addKeyListener(this);
//	        
//	        choicePanel.exit.addActionListener(new ActionListener(){
//
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					// TODO Auto-generated method stub
//					System.exit(0);
//				}
//	        	
//	        });
//    
//	        
//	        choicePanel.set.addActionListener(new ActionListener(){
//
//
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					// TODO Auto-generated method stub
//					new SetPanel(choicePanel.getWidth()/3,choicePanel.getHeight()/2,setter);
//				    
//				}
//	        	
//	        });
=======
	        choicePanel.set.addKeyListener(this);
	        
	        choicePanel.exit.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					new Thread(soundButton).start();
					System.exit(0);
				}
	        	
	        });
    
	        
	        choicePanel.set.addActionListener(new ActionListener(){


				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					new Thread(soundButton).start();
					new SetPanel(choicePanel.getWidth()/3,choicePanel.getHeight()/2,setter);
				    
				}
	        	
	        });
>>>>>>> origin/master

	        
	        choicePanel.single.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					new Thread(soundButton).start();
					register();
				}
	        	
	        });
	        
	        
	        choicePanel.doub.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					new Thread(soundButton).start();
					startDoubleMode();
				}
	        	
	        });
	    }

	   void upgrade(){
	    	if(upgrade!=null){
	    		upgrade.up.frame.dispose();
	    	}
	    	upgrade = new Upgrade(this);
	    	
	    	new Thread(upgrade).start();
	    	
	    }
	   


		public void startDoubleMode(){
	        
			gamePanel = new GamePanel();
	    	isOnGame = true;
	    	setCurrentPanel(gamePanel);
	    	gamePanel.addKeyListener(this);
	    	gamePanel.grabFocus();
	    	Mode game = new DoubleMode(setter,this);
	    	gamePanel.clockPanel = game.clockPanel;
	    	gamePanel.timePanel = game.timePanel;	
	    	currentMode = game;
	    	isSingleMode = false;
	    	gamePanel.addComponent();   	
	    	new Thread(game).start();
	    }
		
	    
		
		private  void register(){
			RegisterPanel registerPanel = new RegisterPanel();
			registerPanel.registerButton.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					String name = registerPanel.getText();
					try {
						player = PlayerInfo.CreatPlayer(name);
						registerPanel.frame.dispose();
						upgrade();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
				
			});
		}
	    
		void setCurrentPanel(JPanel panel) {
			// TODO Auto-generated method stub
	    	if(currentPanel!=null)
	    		frame.remove(currentPanel);
		    currentPanel = panel; 
		    frame.add(currentPanel);
		    currentPanel.setBounds(0, 0, frame.getWidth(), frame.getHeight());
		    frame.repaint();
		}
	  
	
		void comeback() {
			// TODO Auto-generated method stub
			if(isOnGame){
				currentMode.isTerminated = true;
				currentMode.isOnGame = false;
				            isOnGame = false;
				setCurrentPanel(choicePanel);
				if(upgrade != null)
			    this.upgrade.up.frame.dispose();	
			}
		}
	    

		
	    public static void main(String[] args) {
		// TODO Auto-generated method stub
		    new Launcher();
	    }




		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}




		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			if(e.getKeyCode()==Set.shortcutLaunch){
				if(isOnGame){
				    
					currentMode.launch();
				}
				else if(currentPanel == choicePanel){
					
				}
			}
			if(e.getKeyCode()== Set.shortcutPause){
				if(isOnGame){
					Mode.isPause = !Mode.isPause;
				}
				
			}
			
			if(e.getKeyCode() == Set.shortcutBack){
				comeback();
			}
			if(e.getKeyCode()== Set.shortcutUp){
				setter.setVolumeOfSound(+1);
				
			}
			if(e.getKeyCode()== Set.shortcutDown){
				setter.setVolumeOfMusic(-1);
				
			}
		}


 

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
		}

		
		
}
