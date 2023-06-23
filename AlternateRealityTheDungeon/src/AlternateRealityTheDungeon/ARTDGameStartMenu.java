package AlternateRealityTheDungeon;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ARTDGameStartMenu extends JFrame {


	public static void main(String[] args) {
		
		ARTDGameSettings myGameSettings = new ARTDGameSettings();
		
		
		//***********************************************
		//**** Creating JFrame, JPanel, and JButtons ****
		//***********************************************
				
		JFrame StartMenuFrame = null;
		JPanel StartTextAreaPanel, StartButtonPanel = null;
		JButton StartNewGameButton, LoadExistingGameButton, ExitGameButton = null;
		JTextArea GameTitleTextArea = null;
		int width, height = 0;
		
		//***************************************************
		//**** Initializing JFrame, JPanel, and JButtons ****
		//***************************************************
		
		StartMenuFrame = new JFrame("Alternate Reality: The Dungeon");
		StartTextAreaPanel = new JPanel();
		StartButtonPanel = new JPanel();
		StartNewGameButton = new JButton("Start New Game");
		LoadExistingGameButton = new JButton("Load Exisiting Game");
		ExitGameButton = new JButton("Exit Game");
		GameTitleTextArea = new JTextArea();
		
		
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
        StartMenuFrame.setUndecorated(false);
        
        
      //***************************************************
      //**** Setting Up and adding JPanel to JFrame********
      //***************************************************
        
        StartTextAreaPanel.setLayout(new BorderLayout());
        StartButtonPanel.setLayout(new BorderLayout());
        StartMenuFrame.add(StartTextAreaPanel);
        StartMenuFrame.add(StartButtonPanel);
        
      //***************************************************
      //********** Adding Fields to JPanel ****************
      //***************************************************
        
        StartTextAreaPanel.add(GameTitleTextArea, BorderLayout.NORTH);
        StartButtonPanel.add(StartNewGameButton, BorderLayout.CENTER);
        StartButtonPanel.add(LoadExistingGameButton, BorderLayout.CENTER);
        StartButtonPanel.add(ExitGameButton, BorderLayout.CENTER);
        
      //***************************************************
      //********** Setting Up JTextArea *******************
      //***************************************************  
           
        GameTitleTextArea.setEditable(false);
        GameTitleTextArea.setFont(myGameSettings.fontAvatar);
        GameTitleTextArea.setLineWrap(true);
        GameTitleTextArea.setWrapStyleWord(true);
        
      //***************************************************
      //************ Setting Up Buttons *******************
      //***************************************************  
        
        StartNewGameButton.setPreferredSize(new Dimension(100, 50));
        LoadExistingGameButton.setPreferredSize(new Dimension(100, 50));
        ExitGameButton.setPreferredSize(new Dimension(100, 50));
        
        StartMenuFrame.setVisible(true);  
        
	}

	
	
}
