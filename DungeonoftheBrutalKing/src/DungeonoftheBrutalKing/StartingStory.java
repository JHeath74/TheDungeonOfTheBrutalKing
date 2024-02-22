package DungeonoftheBrutalKing;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

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
import javax.swing.WindowConstants;

public class StartingStory extends JFrame{

	static JFrame StoryMessageFrame;
	static JPanel StoryMessagePanel, StoryImagePanel, StoryButtonPanel, StorySplitPanePanel = null;
	static JButton ConfirmButton = null;
	static JTextArea StoryMessageTextArea = null;
	static int width, height = 0;
	static JSplitPane StoryImageSplitPane = null;
	public static JLabel StoryImageLabel;
	public static BufferedImage StoryImagePicture = null;
	public static Dimension imageSize, size = null;
	public static String toonName = "";




	public static void StartGameMessage() throws InterruptedException, IOException, HeadlessException, UnsupportedAudioFileException, LineUnavailableException {

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

		StoryImageSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		StoryMessageFrame.add(StoryImageSplitPane);

		StoryImageSplitPane.setDividerLocation(0.5);
		StoryImageSplitPane.setResizeWeight(.5d);

		//StoryImageSplitPane.setPrefereSize(width, height);

		//StoryImageSplitPane.setPreferredSize(new Dimension(480, 240));

		//********************************************************************************
		//*************  Creating JPanels ************************************************
		//********************************************************************************

		StoryImagePanel = new JPanel();
		StoryMessagePanel = new JPanel();
		StoryButtonPanel = new JPanel();
		StorySplitPanePanel = new JPanel();


		StoryMessagePanel.setPreferredSize(new Dimension(StoryImageSplitPane.getWidth()/2, StoryImageSplitPane.getHeight()));
		StoryImagePanel.setPreferredSize(new Dimension(StoryImageSplitPane.getWidth()/2, StoryImageSplitPane.getHeight()));


		StoryImageSplitPane.setRightComponent(StoryMessagePanel);
		StoryImageSplitPane.setLeftComponent(StoryImagePanel);



		//********************************************************************************
		//************* Setting up Other Needed Fields ***********************************
		//********************************************************************************

		StoryMessageTextArea = new JTextArea(25,25); // Row, Column
		StoryMessageTextArea.setWrapStyleWord(true);
		StoryMessageTextArea.setLineWrap(true);

		StoryMessageTextArea.setBackground(myGameSettings.colorLightBrown);
		StoryMessageTextArea.setForeground(myGameSettings.colorDarkGoldenRod);
		StoryMessageTextArea.setFont(new Font("Arial", Font.PLAIN, 30));



		//StoryMessageTextArea.setPreferredSize(new Dimension(StoryMessagePanel.getWidth(), StoryMessagePanel.getHeight()));


		StoryMessagePanel.add(StoryMessageTextArea);


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

		//********************************************************************************
		//************* Getting a Charecter Name *****************************************
		//********************************************************************************

		StoryMessageTextArea.setText("");


	//	welcomeStory(0);
		StoryMessageTextArea.setText("You wake up very slowly and your "
				+ "not feeling very well. As you come to your senses, "
				+ " you notice a stranger sitting by a fire.\n\n");

		welcomeImages(1);
	//	wait(2);

		Thread.sleep(2000);
	//	welcomeStory(1);

        StoryMessageTextArea.append("As you awaken,  the stranger comes"
       		+ " over and hands you a drink, then asks you for your name.\n\n");

        welcomeImages(2);
		//wait(2);

        Thread.sleep(2000);

			do
			{
				toonName = JOptionPane.showInputDialog(null, "Stranger asks 'What is your name?","Please Enter Name.", JOptionPane.INFORMATION_MESSAGE);
			}while (toonName == null);



		StoryMessageTextArea.append("Welcome, " + toonName + " it's best to move slowly at first,"
				+ "But not too slow,  people don't tend to last too long here.\n\n");

		welcomeImages(3);
	//	wait(2);

		Thread.sleep(2000);


			StoryMessageTextArea.append("You ask the stranger where you are,  he says 'You are in a dungeon, and if you wish"
				+ "to go home,  you'll have to go through it to get out\n\n");

		welcomeImages(4);
	//	wait(2);


		Thread.sleep(2000);

		StoryMessageTextArea.append("The stranger continues 'I wish you luck,  many have come this way but none"
				+ "have ever left.\n\n");

		welcomeImages(5);
	//wait(2);

		Thread.sleep(2000);

		StoryMessageTextArea.append("If you do get out " + toonName + ",  let other's know I'm here. I've been here a long time"
				+ "and I would like to leave\n\n");

		welcomeImages(6);
	//	wait(2);

		Thread.sleep(2000);

		StoryMessageTextArea.append("You look at the stranger and say 'Thanks'.  As you walk away you look back"
				+ "and only see the first, but there is no sign of the stranger\n\n");

		welcomeImages(7);
	//	wait(2);

		Thread.sleep(2000);

		StoryMessageFrame.dispose();


		CharacterCreation.CharacterCreation();

	 }

	private static void welcomeImages(int m) throws IOException
	{

		 if(StoryImageLabel != null)
		  {
			  StoryImagePanel.remove(StoryImageLabel);
		  }
		StoryImagePicture = ImageIO.read(new File(GameSettings.StoryIntroductionPath + m + ".png")); // Buffered Image


		StoryImageLabel = new JLabel();

		//StoryImageLabel.setSize(StoryImagePanel.getWidth(), StoryImagePanel.getHeight());
		StoryImageLabel.setSize(480, 320);

		Image newStoryImagePicture = StoryImagePicture.getScaledInstance(StoryImageLabel.getWidth(), StoryImageLabel.getHeight(),
		        Image.SCALE_SMOOTH);

		ImageIcon img = new ImageIcon(newStoryImagePicture);

		StoryImageLabel.setIcon(img);

		StoryImagePanel.add(StoryImageLabel);

		StoryImageLabel.revalidate();

	}






}
