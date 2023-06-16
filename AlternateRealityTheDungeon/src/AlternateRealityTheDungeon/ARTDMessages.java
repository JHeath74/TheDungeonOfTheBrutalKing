package AlternateRealityTheDungeon;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;

public class ARTDMessages extends JFrame {

	static JFrame StoryMessageFrame;
	static JPanel StoryMessagePanel, StoryImagePanel, StoryButtonPanel, StorySplitPanePanel = null;
	static JButton ConfirmButton = null;
	static JTextArea StoryMessageTextArea = null;
	static int width, height = 0;
	static JSplitPane StoryImageSplitPane = null;
	public static JLabel StoryImageLabel = null;
	public static BufferedImage StoryImagePicture = null;
	public static Dimension imageSize = null;
	
	
	
	public ARTDMessages()
	{
		
		StoryImageLabel = new JLabel();
	}
	
	
	
	public static void WelcomeMessage() throws InterruptedException, IOException {

		ARTDGameSettings myGameSettings = new ARTDGameSettings();
		
		//********************************************************************************
		//*************  Setting up JFrame ***********************************************
		//********************************************************************************
		StoryMessageFrame = new JFrame("Your Adventure Awaits");
		StoryMessageFrame.setLayout(new BorderLayout());
		StoryMessageFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//********************************************************************************
		//*************  Creating JPanels ************************************************
		//********************************************************************************
		
		StoryImagePanel = new JPanel();
		StoryMessagePanel = new JPanel();
		StoryButtonPanel = new JPanel();
		StorySplitPanePanel = new JPanel();
		
		//********************************************************************************
		//************* Creating JButton *************************************************
		//********************************************************************************
		
		ConfirmButton = new JButton("Press Click to Continue");
		
		//********************************************************************************
		//************* Setting up JTextArea *********************************************
		//********************************************************************************
		
		StoryMessageTextArea = new JTextArea(60,50); // Row, Column
		StoryMessageTextArea.setWrapStyleWord(true);
		StoryMessageTextArea.setLineWrap(true);
		StoryMessageTextArea.setFont(myGameSettings.fontWelcomeMessage2);
		
		//********************************************************************************
		//************* Adding JPanels to JFrame for JSplitPane***************************
		//********************************************************************************
		
		StoryImageSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		StorySplitPanePanel.add(StoryImageSplitPane);
		StoryMessageFrame.add(StorySplitPanePanel, BorderLayout.CENTER);
		
		//********************************************************************************
		//************* Setting up JSplitPane ********************************************
		//********************************************************************************
		
		StoryImageSplitPane.setResizeWeight(.5d);
		StoryImageSplitPane.setDividerLocation(0.5);
		
			
		//********************************************************************************
		//************* Adding TextArea and Image to Respective JPanel *******************
		//********************************************************************************
		
	
		
	
		//************************************
		//*******Adding image to JLabel*******
		//************************************
		
	
		
						
		// Adding the image to the JPanel for the monster image
		StoryMessagePanel.add(StoryMessageTextArea);

		//********************************************************************************
		//************* Adding JPanels to JSplitPane**************************************
		//********************************************************************************
	
		StoryImageSplitPane.setLeftComponent(StoryImagePanel);
		StoryImageSplitPane.setRightComponent(StoryMessagePanel);
		
		//********************************************************************************
		//************* Setting Screen Size **********************************************
		//********************************************************************************		
		
		// getScreenSize() returns the size of the screen in pixels
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        
        // width will store the width of the screen
        width = (int)size.getWidth();
        
        // height will store the height of the screen
        height = (int)size.getHeight();
		
		
        
		ConfirmButton.addMouseListener(new MouseListener() {

				@Override
				public void mouseClicked(MouseEvent e) {
					
				}

				@Override
				public void mousePressed(MouseEvent e) {
				}

				@Override
				public void mouseReleased(MouseEvent e) {
				}

				@Override
				public void mouseEntered(MouseEvent e) {
				}

				@Override
				public void mouseExited(MouseEvent e) {
				}

			});

		
        	
			StoryMessageFrame.setSize(width, height);
		    StoryMessageFrame.setUndecorated(false);
			StoryMessageFrame.setVisible(true);


			StoryMessageTextArea.setText("");
			
			/*
			 * File folder = new File(myGameSettings.WelcomeImagePath); File[] listOfFiles =
			 * folder.listFiles(); for (int i = 0 ; i < listOfFiles.length; i++) { if
			 * (listOfFiles[i].equals(null)) {
			 * 
			 * }
			 */
			 
	          
			StoryMessageTextArea.setText("On your way home from your last adventure you are set upon on my an unknown group of people.\n\n");
			StoryImagePicture = ImageIO.read(new File(myGameSettings.WelcomeImagePath + "1.png")); // Buffered Image
			StoryImageLabel = new JLabel(new ImageIcon(StoryImagePicture));
			StoryImagePanel.add(StoryImageLabel);

        	
        	wait(2);
        	StoryImagePanel.remove(StoryImageLabel);
        	
			StoryMessageTextArea.append("You feel yourself being carried for a while and then dropped on something hard.\n\n");
			StoryImagePicture = ImageIO.read(new File(myGameSettings.WelcomeImagePath + "2.png")); // Buffered Image
			StoryImageLabel = new JLabel(new ImageIcon(StoryImagePicture));
			StoryImagePanel.add(StoryImageLabel);
			
			wait(2);
			StoryImagePanel.remove(StoryImageLabel);
			
			StoryMessageTextArea.append("You hear a sound like a door shutting then you start to move.  Slowly at first,  then very quickly.  Then you passout.\n\n");
			StoryImagePicture = ImageIO.read(new File(myGameSettings.WelcomeImagePath + "3.png")); // Buffered Image
			StoryImageLabel = new JLabel(new ImageIcon(StoryImagePicture));
			StoryImagePanel.add(StoryImageLabel);
			
			wait(2);
			StoryImagePanel.remove(StoryImageLabel);			
			
			StoryMessageTextArea.append("You wake up an unknown time later, with minimal weapons and armor with someone standing over.  They look at you for a moment, than ask you if you are ok?\n\n");
			StoryImagePicture = ImageIO.read(new File(myGameSettings.WelcomeImagePath + "4.png")); // Buffered Image
			StoryImageLabel = new JLabel(new ImageIcon(StoryImagePicture));
			StoryImagePanel.add(StoryImageLabel);
			
			wait(2);
			StoryImagePanel.remove(StoryImageLabel);
			
			StoryMessageTextArea.append("And they want to know a few things about you, to prepare you for adventure.\n\n");
			StoryImagePicture = ImageIO.read(new File(myGameSettings.WelcomeImagePath + "5.png")); // Buffered Image
			StoryImageLabel = new JLabel(new ImageIcon(StoryImagePicture));
			StoryImagePanel.add(StoryImageLabel);
			
			wait(2);
			StoryImagePanel.remove(StoryImageLabel);
			
			StoryMessageTextArea.append("Who I am is not important,  but I need your help.  What you see before you is the enterance to the dungeon.  Many of entered, but none of returned.\n\n");
			StoryImagePicture = ImageIO.read(new File(myGameSettings.WelcomeImagePath + "6.png")); // Buffered Image
			StoryImageLabel = new JLabel(new ImageIcon(StoryImagePicture));
			StoryImagePanel.add(StoryImageLabel);
			
			wait(2);
			StoryImagePanel.remove(StoryImageLabel);
			
			StoryMessageTextArea.append("At the center of the dungeon is a treasure that is important to me.  Please retrieve it and you'll be greatly rewarded.\n\n");
			StoryImagePicture = ImageIO.read(new File(myGameSettings.WelcomeImagePath + "7.png")); // Buffered Image
			StoryImageLabel = new JLabel(new ImageIcon(StoryImagePicture));
			StoryImagePanel.add(StoryImageLabel);
			
			wait(4);
			StoryMessageFrame.dispose();
			
	 } 
		

	private static void wait(int seconds) {
		long start = System.nanoTime();
		while ((long) (System.nanoTime() - start) / (long) (1_000_000_000) < seconds) {

		}
	}

}
