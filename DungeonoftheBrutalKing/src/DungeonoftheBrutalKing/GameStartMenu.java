package DungeonoftheBrutalKing;

import java.awt.BorderLayout;
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
import javax.swing.WindowConstants;

public class GameStartMenu extends JFrame {

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) throws IOException {

		GameSettings myGameSettings = new GameSettings();
		SaveLoadGameData mySaveLoadGameData = new SaveLoadGameData();


		MusicPlayer soundplayer = new MusicPlayer();
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

		StartMenuFrame = new JFrame("Dungeon of the Brutal King");
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
        StartMenuFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        StartMenuFrame.setUndecorated(true);
        StartMenuFrame.getContentPane().setBackground(myGameSettings.colorBrown);
        StartMenuFrame.getContentPane().setForeground(myGameSettings.colorLightBrown);


      //***************************************************
      //**** Setting Up and adding JPanel to JFrame********
      //***************************************************

        StartImagePanel.setLayout(new BorderLayout());
        StartButtonPanel.setLayout(new FlowLayout());

        StartImagePanel.setMaximumSize(new Dimension(450, 200));
        StartButtonPanel.setMaximumSize(new Dimension(250, 350));

        StartMenuFrame.add(StartImagePanel, BorderLayout.CENTER);
        StartMenuFrame.add(StartButtonPanel, BorderLayout.SOUTH);

        StartButtonPanel.setBackground(myGameSettings.colorLightBrown);
        StartButtonPanel.setForeground(myGameSettings.colorLightBrown);

        StartImagePanel.setBackground(myGameSettings.colorLightBrown);
        StartImagePanel.setForeground(myGameSettings.colorLightBrown);


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

        StartNewGameButton.setBackground(myGameSettings.colorGrey);
        StartNewGameButton.setForeground(myGameSettings.colorWhite);

        LoadExistingGameButton.setBackground(myGameSettings.colorGrey);
        LoadExistingGameButton.setForeground(myGameSettings.colorWhite);

        ExitGameButton.setBackground(myGameSettings.colorGrey);
        ExitGameButton.setForeground(myGameSettings.colorWhite);



        File directory = new File(GameSettings.SavedGameDirectory);
        if (directory.isDirectory()) {
           String[] files = directory.list();
           if (files.length > 0) {
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

					 for(File file: directory.listFiles()) {
						if (!file.isDirectory()) {
							file.delete();
						}
					}

				} else {
					try {
						StartingStory.StartGameMessage();
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
					MusicPlayer.stopMidi();


					window.dispose();


					try {
						StartingStory.StartGameMessage();
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

				MusicPlayer.stopMidi();


				Window window = SwingUtilities.getWindowAncestor((Component) e.getSource());
				mySaveLoadGameData.LoadGame();
				window.dispose();
			}

        });


        ExitGameButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}});



	}



}