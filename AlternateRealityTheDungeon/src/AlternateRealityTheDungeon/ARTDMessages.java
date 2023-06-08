package AlternateRealityTheDungeon;

import java.awt.BorderLayout;
import java.awt.Dimension;
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
	static JPanel StoryMessagePanel, StoryImagePanel = null;
	static JButton ConfirmButton = null;
	static JTextArea StoryMessageTextArea = null;
	static int width, height = 0;
	static JSplitPane StoryImageSplitPane = null;
	public static JLabel StoryImageLabel = null;
	public static BufferedImage StoryImagePicture = null;
	public static Dimension imageSize = null;
	
	public ARTDMessages()
	{
		
		
	}
	
	public static void WelcomeMessage() throws InterruptedException, IOException {

		StoryMessageFrame = new JFrame("Your Adventure Awaits");
		StoryMessageFrame.setLayout(new BorderLayout());
		StoryMessageFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		StoryImagePanel = new JPanel();
		StoryMessagePanel = new JPanel();
		
		ConfirmButton = new JButton("Press Click to Continue");
		StoryMessageTextArea = new JTextArea();
		StoryImageSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		
		StoryImageSplitPane.setResizeWeight(.2d);
		StoryImageSplitPane.setDividerLocation(0.5);
		
		StoryImageSplitPane.setLeftComponent(StoryImagePanel);
		StoryImageSplitPane.setRightComponent(StoryMessagePanel);
		
		StoryImagePanel.add(ConfirmButton);
		StoryMessagePanel.add(StoryMessageTextArea);
		StoryMessagePanel.add(ConfirmButton);
		
		

		
//		StoryMessageFrame.add(StoryImagePanel, BorderLayout.NORTH);
	//	StoryMessageFrame.add(StoryMessagePanel, BorderLayout.CENTER);
	//	StoryMessageFrame.add(ConfirmButton, BorderLayout.SOUTH);
		
		
		
		// getScreenSize() returns the size
        // of the screen in pixels
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        
        // width will store the width of the screen
        width = (int)size.getWidth();
        
        // height will store the height of the screen
        height = (int)size.getHeight();
            

        StoryMessageFrame.setSize(width, height);
        StoryMessageFrame.setUndecorated(true);
		
        
        
          // Getting Image to display from it's location in the project
       // StoryImagePicture = ImageIO.read(new File("title")); //I need location of the images
     				
      //Adding image to JLabel
      //  StoryImageLabel = new JLabel(new ImageIcon(StoryImagePicture));	
     		
     		//Adding image to JLabel
          // StoryImageLabel = new JLabel(new ImageIcon(StoryImagePicture));		

     	//	imageSize = new Dimension();
     	//	imageSize.setSize(768, 1024); // Double Width, Double Height
     	//	StoryImageLabel.setPreferredSize(imageSize);
        
        
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

			StoryMessageTextArea.setBounds(10, 30, 400, 400);
			ConfirmButton.setSize(25, 75);
			StoryMessageTextArea.setLineWrap(true);
			StoryMessageTextArea.setWrapStyleWord(true);
			StoryMessageTextArea.setEditable(false);

			
			StoryMessageFrame.setSize(width, height);
			StoryMessageFrame.setLocationRelativeTo(null);
			StoryMessageFrame.setVisible(true);
			StoryMessageFrame.toFront();
			StoryMessageFrame.requestFocus();

			StoryMessageTextArea.setText("");

			StoryMessageTextArea.setText("On your way home from your last adventure you are set upon on my an unknown group of people.\n\n");
			wait(2);
			StoryMessageTextArea.append("You feel yourself being carried for a while and then dropped on something hard.\n\n");
			wait(2);
			StoryMessageTextArea.append("You hear a sound like a door shutting then you start to move.  Slowly at first,  then very quickly.  Then you passout.\n\n");
			wait(2);
			StoryMessageTextArea.append("You wake up an unknown time later, with minimal weapons and armor with someone standing over.  They look at you for a moment, than ask you if you are ok?\n\n");
			wait(2);
			StoryMessageTextArea.append("And they want to know a few things about you, to prepare you for adventure.\n\n");
			wait(2);
			StoryMessageTextArea.append("Who I am is not important,  but I need your help.  What you see before you is the enterance to the dungeon.  Many of entered, but none of returned.\n\n");
			wait(2);
			StoryMessageTextArea.append("At the center of the dungeon is a treasure that is important to me.  Please retrieve it and you'll be greatly rewarded.\n\n");
			wait(4);
			StoryMessageFrame.dispose();



	}

	private static void wait(int seconds) {
		long start = System.nanoTime();
		while ((long) (System.nanoTime() - start) / (long) (1_000_000_000) < seconds) {

		}
	}

}
