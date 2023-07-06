package AlternateRealityTheDungeon;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class ARTDGameStartMenu extends JFrame {


	public static void main(String[] args) throws IOException {
		
		ARTDGameSettings myGameSettings = new ARTDGameSettings();
		//ARTDSaveLoadGameData mySaveLoadGameData = new ARTDSaveLoadGameData();
		
		// to stop the thread
	    boolean exit;
	    
		ARTDMusicPlayer player = new ARTDMusicPlayer("Stones.mid");
		Thread thread = new Thread(player);
		thread.start();
				
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

				
				
				
				try {
					
					Window window = SwingUtilities.getWindowAncestor((Component) e.getSource());
					window.dispose();
					ARTDMusicPlayer.stopMusic();
					thread.interrupt();
					ARTDCharacterCreation.CharacterCreation();
					
			
					
				} catch (IOException e1) {
					e1.printStackTrace();
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				
			}});
        
        
        LoadExistingGameButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			
		
				ARTDMusicPlayer.stopMusic();
				// End the thread
				thread.interrupt();
				
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
