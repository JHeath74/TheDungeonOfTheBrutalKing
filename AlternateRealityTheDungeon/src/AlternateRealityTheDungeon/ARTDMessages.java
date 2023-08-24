package AlternateRealityTheDungeon;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.HeadlessException;

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
import javax.swing.JOptionPane;
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
	public static String toonName = "";
	
	
	public ARTDMessages()
	{
		
		StoryImageLabel = new JLabel();
	}
	
	

	public static void StartGameMessage() throws InterruptedException, IOException, HeadlessException {

		ARTDGameSettings myGameSettings = new ARTDGameSettings();
		
		//********************************************************************************
		//************* Setting Screen Size **********************************************
		//********************************************************************************		
		
		// getScreenSize() returns the size of the screen in pixels
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        
        // width will store the width of the screen
        width = (int)size.getWidth();
        
        // height will store the height of the screen
        height = (int)size.getHeight();
		
		//********************************************************************************
		//*************  Setting up JFrame ***********************************************
		//********************************************************************************
		StoryMessageFrame = new JFrame("Starting Your Adventure");
		StoryMessageFrame.setLayout(new BorderLayout());
		StoryMessageFrame.setSize(width, height);
		StoryMessageFrame.setUndecorated(true);
		StoryMessageFrame.getContentPane().setBackground(myGameSettings.colorLightBrown);
		StoryMessageFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//********************************************************************************
		//*************  Creating JPanels ************************************************
		//********************************************************************************
		
		StoryImagePanel = new JPanel();
		StoryMessagePanel = new JPanel();
		StoryButtonPanel = new JPanel();
		StorySplitPanePanel = new JPanel();
		
		//********************************************************************************
		//************* Creating and Setting up JButton **********************************
		//********************************************************************************
		
		ConfirmButton = new JButton("Press Click to Continue");
		
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

		
		//********************************************************************************
		//************* Setting up JTextArea *********************************************
		//********************************************************************************
		
		StoryMessageTextArea = new JTextArea(60,50); // Row, Column
		StoryMessageTextArea.setWrapStyleWord(true);
		StoryMessageTextArea.setLineWrap(true);
		
		StoryMessageTextArea.setBackground(myGameSettings.colorLightBrown);
		StoryMessageTextArea.setForeground(myGameSettings.colorDarkGoldenRod);
		StoryMessageTextArea.setFont(new Font("Arial", Font.PLAIN, 30));
		
		StoryMessagePanel.add(StoryMessageTextArea);
		
		//********************************************************************************
		//************* Adding JPanels to JFrame for JSplitPane***************************
		//********************************************************************************
		
		StoryMessageFrame.add(StorySplitPanePanel, BorderLayout.CENTER);
		StoryImageSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		StorySplitPanePanel.add(StoryImageSplitPane);
		
			
		//********************************************************************************
		//************* Setting up JSplitPane ********************************************
		//********************************************************************************
				
		StoryImageSplitPane.setResizeWeight(.2d);
		StoryImageSplitPane.setDividerLocation(0.5);
		StoryImageSplitPane.setSize(width, height);
		StoryImageSplitPane.setLeftComponent(StoryImagePanel);
		StoryImageSplitPane.setRightComponent(StoryMessagePanel);
		
		//********************************************************************************
		//************* Setting JPanel Size ********************************************
		//********************************************************************************
		
		StoryMessageFrame.setUndecorated(false);
		StoryMessageFrame.setVisible(true);
		
		//********************************************************************************
		//************* Getting a Charecter Name *****************************************
		//********************************************************************************
		
		StoryMessageTextArea.setText("");
		StoryMessageTextArea.setText("You wake up very slowly and your not feeling very well. "
				+ "As you come to your senses,  you notice a stranger sitting by a fire.\n\n");
		welcomeImages(1);
		
		wait(2);
        StoryImagePanel.remove(StoryImageLabel);
        
        StoryMessageTextArea.append("As you awaken,  the stranger comes over and hands you a drink, "
				+ "then asks you for your name.\n\n");
		welcomeImages(2);
			
		wait(2);
		StoryImagePanel.remove(StoryImageLabel);
			
		toonName = JOptionPane.showInputDialog("Stranger asks 'What is your name?");
			
		StoryMessageTextArea.append("Welcome, " + toonName + " it's best to move slowly at first,"
				+ "But not too slow,  people don't tend to last too long here.\n\n");
		welcomeImages(3);

		wait(2);
		StoryImagePanel.remove(StoryImageLabel);			
			
		StoryMessageTextArea.append("You ask the stranger where you are,  he says 'You are in a dungeon, and if you wish"
				+ "to go home,  you'll have to go through it to get out\n\n");
		welcomeImages(4);
			
		wait(2);
		StoryImagePanel.remove(StoryImageLabel);
			
		StoryMessageTextArea.append("The stranger continues 'I wish you luck,  many have come this way but none"
				+ "have ever left.\n\n");
		welcomeImages(5);
			
		wait(2);
		StoryImagePanel.remove(StoryImageLabel);
			
		StoryMessageTextArea.append("If you do get out " + toonName + ",  let other's know I'm here. I've been here a long time"
				+ "and I would like to leave\n\n");
		welcomeImages(6);
			
		wait(2);
		StoryImagePanel.remove(StoryImageLabel);
			
		StoryMessageTextArea.append("You look at the stranger and say 'Thanks'.  As you walk away you look back"
				+ "and only see the first, but there is no sign of the stranger\n\n");
		welcomeImages(7);
			
		wait(4);
		StoryMessageFrame.dispose();
		
		ARTDCharacterCreation.CharacterCreation();
			
	 } 
	
	private static void welcomeImages(int i) throws IOException
	{

		StoryImageSplitPane.setLeftComponent(StoryImagePanel);
		StoryImagePicture = ImageIO.read(new File(ARTDGameSettings.StoryIntroductionPath + i + ".png")); // Buffered Image
		
		StoryImageLabel = new JLabel(new ImageIcon(StoryImagePicture));
		StoryImagePanel.add(StoryImageLabel);
		

	}
		

	private static void wait(int seconds) {
		long start = System.nanoTime();
		while ((long) (System.nanoTime() - start) / (long) (1_000_000_000) < seconds) {

		}
	}

}
