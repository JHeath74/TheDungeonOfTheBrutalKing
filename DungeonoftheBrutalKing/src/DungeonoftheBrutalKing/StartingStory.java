package DungeonoftheBrutalKing;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.HeadlessException;

import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

public class StartingStory extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static JFrame StoryMessageFrame;
	static JPanel StoryMessagePanel, StoryImagePanel, StoryButtonPanel, StorySplitPanePanel = null;
	static JButton ConfirmButton = null;
	static JTextArea StoryMessageTextArea = null;
	static int width, height = 0;
	static JSplitPane StoryImageSplitPane = null;
	static JOptionPane toonNamePane = null;
	public static JLabel StoryImageLabel;
	
	public static BufferedImage StoryImagePicture = null;
	public static Dimension imageSize, size = null;
	public static String toonName = "";


	


	public static void StartGameMessage() throws InterruptedException, IOException, HeadlessException, UnsupportedAudioFileException, LineUnavailableException {

		




		//********************************************************************************
		//************* Getting a Charecter Name *****************************************
		//********************************************************************************

	
		SwingUtilities.invokeLater(new Runnable() {
		    public void run() {
		    	
		    	
		    	
		    	GameSettings myGameSettings = new GameSettings();

				//********************************************************************************
				//************* Setting Screen Size **********************************************
				//********************************************************************************

				// getScreenSize() returns the size of the screen in pixels
		        size = Toolkit.getDefaultToolkit().getScreenSize();

		        // width will store the width of the screen
		        width = (int)size.getWidth();

		        // height will store the height of the screen
		        height = (int)size.getHeight();

				//********************************************************************************
				//*************  Setting up JFrame ***********************************************
				//********************************************************************************
				StoryMessageFrame = new JFrame("Starting Your Adventure");
				StoryMessageFrame.setSize(width, height);
				StoryMessageFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
				StoryMessageFrame.setBackground(myGameSettings.colorLightBrown);
				StoryMessageFrame.setUndecorated(true);
				StoryMessageFrame.setExtendedState(Frame.MAXIMIZED_BOTH);

				//********************************************************************************
				//************* Setting up JSplitPane ********************************************
				//********************************************************************************

			//	StoryImageSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
				StoryImageSplitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
				StoryMessageFrame.add(StoryImageSplitPane);

				StoryImageSplitPane.setDividerLocation(0.7);
				StoryImageSplitPane.setResizeWeight(.7d);

				//********************************************************************************
				//*************  Creating JPanels ************************************************
				//********************************************************************************

				StoryImagePanel = new JPanel();
				StoryMessagePanel = new JPanel();
				StoryButtonPanel = new JPanel();
				StorySplitPanePanel = new JPanel();


				StoryMessagePanel.setPreferredSize(new Dimension(StoryImageSplitPane.getWidth()/2, StoryImageSplitPane.getHeight()));
				StoryImagePanel.setPreferredSize(new Dimension(StoryImageSplitPane.getWidth()/2, StoryImageSplitPane.getHeight()));
				
				StoryImagePanel.setBackground(myGameSettings.colorLightSalmon);
				StoryMessagePanel.setBackground(myGameSettings.colorLightBrown);
				
				StoryImageSplitPane.setTopComponent(StoryImagePanel);
				StoryImageSplitPane.setBottomComponent(StoryMessagePanel);


				//********************************************************************************
				//************* Setting up Other Needed Fields ***********************************
				//********************************************************************************

				StoryMessageTextArea = new JTextArea(20,20); // Row, Column
				StoryMessageTextArea.setWrapStyleWord(true);
				StoryMessageTextArea.setLineWrap(true);

				StoryMessageTextArea.setBackground(myGameSettings.colorLightBrown);
				StoryMessageTextArea.setForeground(myGameSettings.colorDarkGoldenRod);
				StoryMessageTextArea.setFont(new Font("Arial", Font.PLAIN, 30));
				
				 UIManager.put("OptionPane.background",myGameSettings.colorLightBrown);



				StoryMessagePanel.add(StoryMessageTextArea);
				StoryImageLabel = new JLabel();
				StoryImageLabel.setSize(StoryImagePanel.getWidth(), StoryImagePanel.getHeight());
				StoryImagePanel.add(StoryImageLabel);


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
				//************* Setting JFrame Visibility ********************************************
				//********************************************************************************

				StoryMessageFrame.setLocationRelativeTo(null);
				StoryMessageFrame.toFront();
				StoryMessageFrame.requestFocus();
				StoryMessageFrame.setVisible(true);

		      
		//    	StoryMessageTextArea.setText("You wake up very slowly and your "
		//				+ "not feeling very well. As you come to your senses, "
		//				+ " you notice a stranger sitting by a fire.\n\n");

		    	StoryMessageFrame.repaint();
		    	StoryMessageFrame.validate();
		    	
					try {
						startingStory(0);
						welcomeImages(1);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		    	
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		   //     StoryMessageTextArea.setText("As you awaken,  the stranger comes"
		   //    		+ " over and hands you a drink, then asks you for your name.\n\n");
		       
				startingStory(1);
			//		welcomeImages(2);
			


		        try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

					do
					{
					toonName = JOptionPane.showInputDialog(null, "Stranger asks 'What is your name?","Please Enter Name.", JOptionPane.INFORMATION_MESSAGE);
					
					}while (toonName == null);



			//	StoryMessageTextArea.setText("Welcome, " + toonName + " it's best to move slowly at first,"
			//			+ "But not too slow,  people don't tend to last too long here.\n\n");

					startingStory(2);
				//	welcomeImages(3);
			

				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}


			//		StoryMessageTextArea.append("You ask the stranger where you are,  he says 'You are in a dungeon, and if you wish"
			//			+ "to go home,  you'll have to go through it to get out\n\n");

				startingStory(3);
				//	welcomeImages(4);
			

				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

		//		StoryMessageTextArea.setText("The stranger continues 'I wish you luck,  many have come this way but none"
		//				+ "have ever left.\n\n");
				startingStory(4);
			//	welcomeImages(5);

				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

		//		StoryMessageTextArea.setText("If you do get out " + toonName + ",  let other's know I'm here. I've been here a long time"
		//				+ "and I would like to leave\n\n");

				startingStory(5);
			//		welcomeImages(6);
			

				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

		//		StoryMessageTextArea.setText("You look at the stranger and say 'Thanks'.  As you walk away you look back"
		//				+ "and only see the first, but there is no sign of the stranger\n\n");

				startingStory(6);
				//	welcomeImages(7);
				

				
					try {
						Thread.sleep(2000);
						
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		

				StoryMessageFrame.dispose();


				try {
					CharacterCreation.CharacterCreation();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				

		    }
		});
		
		
		

	 }
	
	private static void startingStory(int m)
	{
		
		ArrayList<String> startingStory = new ArrayList<String>(); // Create an ArrayList object
	
		startingStory.add("You wake up very slowly and your "
				+ "not feeling very well. As you come to your senses, "
				+ " you notice a stranger sitting by a fire.");
		
		startingStory.add("As you awaken,  the stranger comes"
	       		+ " over and hands you a drink, then asks you for your name.\n\n");
		
		startingStory.add("Welcome, " + toonName + " it's best to move slowly at first,"
				+ "But not too slow,  people don't tend to last too long here.");
		
		startingStory.add("You ask the stranger where you are,  he says 'You are in a dungeon, and if you wish"
				+ "to go home,  you'll have to go through it to get out.");
		
		startingStory.add("The stranger continues 'I wish you luck,  many have come this way but none"
				+ "have ever left.");
		
		startingStory.add("If you do get out " + toonName + ",  let other's know I'm here. I've been here a long time"
				+ "and I would like to leave.");
		
		startingStory.add("You look at the stranger and say 'Thanks'.  As you walk away you look back"
				+ "and only see the first, but there is no sign of the stranger\n\n");
		
		System.out.println("Number: " + m);
		System.out.println(m + " " + java.time.LocalTime.now());
		StoryMessageTextArea.setText(startingStory.get(m));
    	
		
	}

	private static void welcomeImages(int m) throws IOException
	{


		StoryImagePicture = ImageIO.read(new File(GameSettings.StoryIntroductionPath + m + ".png")); // Buffered Image

		ImageIcon img = new ImageIcon(StoryImagePicture);

		StoryImageLabel.setIcon(img);	
		//StoryMessageFrame.repaint();
    	StoryMessageFrame.validate();

	}






}
