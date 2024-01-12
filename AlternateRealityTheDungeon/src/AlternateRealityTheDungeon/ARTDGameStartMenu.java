package AlternateRealityTheDungeon;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class ARTDGameStartMenu extends JFrame {

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) throws IOException {
		
		ARTDGameSettings myGameSettings = new ARTDGameSettings();
		//ARTDSaveLoadGameData mySaveLoadGameData = new ARTDSaveLoadGameData();
		
		// to stop the thread
		boolean exit;
	    
	
		ARTDMusicPlayer soundplayer = new ARTDMusicPlayer();
		try {
			soundplayer.midiPlayer("Stones.mid");
		} catch (UnsupportedAudioFileException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (LineUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

				
		//***********************************************
		//**** Creating JFrame, JPanel, and JButtons ****
		//***********************************************
				
		JFrame StartMenuFrame = null;
		JPanel StartImagePanel, StartButtonPanel = null;
		JButton StartNewGameButton, LoadExistingGameButton, ExitGameButton = null;
		BufferedImage StartGameImage = null;
		JLabel StartImageLabel = null;
		int width, height = 0;
		
		//***************************************************
		//**** Initializing JFrame, JPanel, and JButtons ****
		//***************************************************
		
		StartMenuFrame = new JFrame("Alternate Reality: The Dungeon");
		StartImagePanel = new JPanel();
		StartButtonPanel = new JPanel();
		StartNewGameButton = new JButton("Start New Game");
		LoadExistingGameButton = new JButton("Load Exisiting Game");
		ExitGameButton = new JButton("Exit Game");
		
		
		//***************************************************
		//******** Getting Screen Width and Height **********
		//***************************************************
		
		// getScreenSize() returns the size of the screen in pixels
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        
        // width will store the width of the screen
        width = (int)size.getWidth();
        
        // height will store the height of the screen
        height = (int)size.getHeight();
        
      //***************************************************
      //***************** Setting Up JFrame ***************
      //***************************************************
        
        StartMenuFrame.setLayout(new BorderLayout());
        StartMenuFrame.setSize(width, height);
        StartMenuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        StartMenuFrame.setUndecorated(true);
        
        
      //***************************************************
      //**** Setting Up and adding JPanel to JFrame********
      //***************************************************
        
        StartImagePanel.setLayout(new BorderLayout());
        StartButtonPanel.setLayout(new FlowLayout());
        
        StartImagePanel.setMaximumSize(new Dimension(450, 200));
        StartButtonPanel.setMaximumSize(new Dimension(250, 350));
        
        StartMenuFrame.add(StartImagePanel, BorderLayout.CENTER);
        StartMenuFrame.add(StartButtonPanel, BorderLayout.SOUTH);
        
        StartImagePanel.setBackground(myGameSettings.colorBlack);
        StartButtonPanel.setBackground(myGameSettings.colorBlack);
        
      //***************************************************
      //********** Adding Fields to JPanel ****************
      //***************************************************

        StartButtonPanel.add(StartNewGameButton, FlowLayout.LEFT);
        StartButtonPanel.add(LoadExistingGameButton, FlowLayout.CENTER);
        StartButtonPanel.add(ExitGameButton, FlowLayout.RIGHT);
        
        
      //***************************************************
      //********** Setting settings for JPanel ************
      //***************************************************
      
        StartImageLabel = new JLabel(new ImageIcon(myGameSettings.myStartMenuPicture));
		StartImagePanel.add(StartImageLabel);

        
      //***************************************************
      //************ Setting Up Buttons *******************
      //***************************************************  
        
        StartNewGameButton.setPreferredSize(new Dimension(200, 50));
        LoadExistingGameButton.setPreferredSize(new Dimension(200, 50));
        ExitGameButton.setPreferredSize(new Dimension(200, 50));
        
        StartNewGameButton.setBackground(myGameSettings.colorBlue);
        StartNewGameButton.setForeground(myGameSettings.colorWhite);
        
        LoadExistingGameButton.setBackground(myGameSettings.colorBlue);
        LoadExistingGameButton.setForeground(myGameSettings.colorWhite);
        
        ExitGameButton.setBackground(myGameSettings.colorBlue);
        ExitGameButton.setForeground(myGameSettings.colorWhite);

        
        
        File directory = new File(myGameSettings.SavedGameDirectory);
        if (directory.isDirectory()) {
           String[] files = directory.list();
           if (directory.length() > 0) {
              LoadExistingGameButton.setVisible(true);
           } else {
        	  LoadExistingGameButton.setVisible(false);
           }
        }
        
        StartMenuFrame.setVisible(true);
        
        StartNewGameButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				 
	
				if (JOptionPane.showConfirmDialog(null, "Do you wish to delete your game to start a new one", "WARNING",
				        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
						
					 UIManager UI=new UIManager();
					  UI.put("JOptionPane.background", Color.BLACK);
					
					 for(File file: directory.listFiles()) 
		        		    if (!file.isDirectory()) 
		        		        file.delete();
					
				} else {
					try {
						ARTDMessages.StartGameMessage();
					} catch (HeadlessException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (UnsupportedAudioFileException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (LineUnavailableException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
				
				
				
				
				try {
					
					Window window = SwingUtilities.getWindowAncestor((Component) e.getSource());
					soundplayer.stopMidi();
				

					window.dispose();
					

					try {
						ARTDMessages.StartGameMessage();
					} catch (HeadlessException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (UnsupportedAudioFileException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (LineUnavailableException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
			
					
				} catch (IOException e1) {
					e1.printStackTrace();
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				
			}});
        
        
        LoadExistingGameButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			
				soundplayer.stopMidi();

				
				Window window = SwingUtilities.getWindowAncestor((Component) e.getSource());
				window.dispose();
			//	mySaveLoadGameData.LoadGame();
				
			}
        	
        });
        
        
        ExitGameButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}});
        
        
        
	}
	

	
}
