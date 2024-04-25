package DungeonoftheBrutalKing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import CharecterClass.Bard;
import CharecterClass.Cleric;
import CharecterClass.Hunter;
import CharecterClass.Paladin;
import CharecterClass.Rogue;
import CharecterClass.Warrior;

public class CharacterCreation {

	static LoadSaveGame myGameState = new LoadSaveGame();
	static GameSettings myGameSettings = new GameSettings();

	static String InitialCharecterSave = " ";
	static String toonClass, charName = " ";
	static int width, height = 0;
	static Dimension size;
	static File charSave;
	static Scanner saveFile;

	static JFrame CharecterCreationFrame;
	static JPanel NameAndStatsPanel, ClassAndClassInfoPanel, ClassInfoAndImagePanel;
	static JTextArea toonstatsTextArea, toonclassDescriptionTextArea;
	static JTextField tooncreationTextField;
	static JScrollPane toonstatsScrollPane;
	static JButton reRollStatsButton, saveToonButton, exitToStartMenuButton;
	static JSplitPane CharecterCreationSplitPane;
	static JComboBox<String> charectorClass;
	static String[] toonclasslist;
	static JLabel classImageLabel;
	static BufferedImage ClassImagePicture;


	public static void CharacterCreation() throws IOException, InterruptedException {


		GameSettings myGameSettings = new GameSettings();
		

		//***************************************************
		//******** Getting Screen Width and Height **********
		//***************************************************

		// getScreenSize() returns the size of the screen in pixels
		 size = Toolkit.getDefaultToolkit().getScreenSize();

		// width will store the width of the screen
		 width = (int)size.getWidth();

		// height will store the height of the screen
		 height = (int)size.getHeight();

		//*******************************************************************
		//******** Setting up JFrame  ***************************************
		//*******************************************************************

		CharecterCreationFrame = new JFrame("Create New Charecter");
		CharecterCreationFrame.setSize(width, height);
		CharecterCreationFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		CharecterCreationFrame.setBackground(myGameSettings.colorBrown);
		CharecterCreationFrame.setUndecorated(true);

		//******************************************************************
		//******** Setting up JSplitPane  *********************************
		//******************************************************************
		CharecterCreationSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		CharecterCreationFrame.add(CharecterCreationSplitPane);

		CharecterCreationSplitPane.setDividerLocation(.5);
		CharecterCreationSplitPane.setResizeWeight(.2d);
		//*****************************************************************
		//******** Setting up Other Needed Fields**************************
		//*****************************************************************

		toonstatsTextArea = new JTextArea();
		toonclassDescriptionTextArea = new JTextArea();
		tooncreationTextField = new JTextField();
		tooncreationTextField.setEditable(false);


		Font toonClassDescriptionFont = new Font("Verdana",Font.BOLD,30);
		toonclassDescriptionTextArea.setFont(toonClassDescriptionFont);

		tooncreationTextField.setText("Name: " + charName);
		toonstatsScrollPane = new JScrollPane();



		//******************************************************************
		//******** Setting up JPanel and adding them to the JSplitPane *****
		//******************************************************************
		NameAndStatsPanel = new JPanel(new BorderLayout());
		ClassAndClassInfoPanel = new JPanel(new BorderLayout());
		ClassInfoAndImagePanel = new JPanel(new BorderLayout());

		CharecterCreationSplitPane.setLeftComponent(NameAndStatsPanel);
		CharecterCreationSplitPane.setRightComponent(ClassAndClassInfoPanel);

		//******************************************************************
		//******** Setting up Buttons **************************************
		//******************************************************************

		exitToStartMenuButton = new JButton();




			// ************************************************************************
			// *** Rerolling Charecter Stats if you don't like what you got. **********
			// ************************************************************************

			Integer[] stat = rollstats();

			toonstatsTextArea = new JTextArea();
			toonstatsScrollPane = new JScrollPane(toonstatsTextArea);

			toonstatsTextArea.setText("Charecter Stats\n");

			toonstatsTextArea.append("\nSTAMINA: \t\t" + stat[0]);
			toonstatsTextArea.append("\nCHARISMA: \t\t" + stat[1]);
			toonstatsTextArea.append("\nSTRENGTH: \t\t" + stat[2]);
			toonstatsTextArea.append("\nINTELLIGENCE: \t" + stat[3]);
			toonstatsTextArea.append("\nWISDOM: \t\t" + stat[4]);
			toonstatsTextArea.append("\nAGILITY: \t\t" + stat[5]);

			toonstatsTextArea.setEditable(false);

			// *********************************************************
			// ******** Selecting your Charecter Class *****************
			// *********************************************************

			toonclasslist = Class.toonclassarray;

			charectorClass = new JComboBox<>(toonclasslist);

			toonclassDescriptionTextArea = new JTextArea("Choose Your Class from the Dropdown box above.");
			toonclassDescriptionTextArea.setLineWrap(true);

			
			

			// *********************************************************
			// ***** Selecting your Charecter Class Description ********
			// *********************************************************

			charectorClass.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					toonClass = charectorClass.getSelectedItem().toString();

					toonclassDescriptionTextArea.setText(toonClass);
					
					if (toonClass == toonclasslist[0]) {
						toonclassDescriptionTextArea.setText(Paladin.ClassDescription());

						try {

							classImage("Paladin");
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}

					}
					if (toonClass == toonclasslist[1]) {
						toonclassDescriptionTextArea.setText(Cleric.ClassDescription());
						try {
							classImage("Cleric");
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
					if (toonClass == toonclasslist[2]) {
						toonclassDescriptionTextArea.setText(Rogue.ClassDescription());
						try {
							classImage("Rogue");
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
					if (toonClass.equals(toonclasslist[3])) {
						toonclassDescriptionTextArea.setText(Hunter.ClassDescription());
						try {
							classImage("Hunter");
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
					if (toonClass == toonclasslist[4]) {
						toonclassDescriptionTextArea.setText(Warrior.ClassDescription());
						try {
							classImage("Warrior");
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
					if (toonClass == toonclasslist[5]) {
						toonclassDescriptionTextArea.setText(Bard.ClassDescription());
						try {
							classImage("Bard");
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}

				}


			});


			reRollStatsButton = new JButton("Reroll Stats");
			reRollStatsButton.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					rollstats();
					Integer[] stat = rollstats();
					toonstatsTextArea.setText(" ");

					for (int i = 0; i < stat.length; i++) {

						toonstatsTextArea.setText("Charecter Stats\n");

						toonstatsTextArea.append("\nSTAMINA: \t\t" + stat[0]);
						toonstatsTextArea.append("\nCHARISMA: \t\t" + stat[1]);
						toonstatsTextArea.append("\nSTRENGTH: \t\t" + stat[2]);
						toonstatsTextArea.append("\nINTELLIGENCE: \t" + stat[3]);
						toonstatsTextArea.append("\nWISDOM: \t\t" + stat[4]);
						toonstatsTextArea.append("\nAGILITY: \t\t" + stat[5]);
						toonstatsTextArea.validate();
					}

				}

			});

			
			
			saveToonButton = new JButton("Save Charecter"); // Save Button for Charecter creation
			saveToonButton.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					try {

						FileWriter writer = new FileWriter(
								"src//DungeonoftheBrutalKing//SaveGame//InitialCharecterSave.txt");

						ArrayList<String> newChar = new ArrayList<>();

						ArrayList<String> newChar2 = new ArrayList<>();
						

						// Validating if the Charecter Name is blank or not
						toonName(tooncreationTextField, charName, newChar);

						do {

							// Character Class
							newChar.add(toonClass);

							// Character Level
							newChar.add("0");

							// Character Experience
							newChar.add("0");

							// Character HitPoints
							newChar.add("15");

							// Character Gold
							newChar2.add("100");

							// Character Food
							newChar2.add("3");

							// Character Water
							newChar2.add("3");

							// Character Torches
							newChar2.add("3");

							// Character Gems
							newChar2.add("0");

							// newChar[0] = Charecter Name
							// newChar[1] = Class
							// newChar[2] = Level
							// newChar[3] = Experience
							// newChar[4] = Hit Points
							// newChar[5] = Stat: Stamina
							// newChar[6] = Stat: Charisma
							// newChar[7] = Stat: Strength
							// newChar[8] = Stat: Intelligence
							// newChar[9] = Stat: Wisdom
							// newChar[10] = Stat: Agility
							// newChar[11] = Gold
							// newChar[12] = Food
							// newChar[13] = Water
							// newChar[14] = Torches
							// newChar[15] = Gems

							for (String str : newChar) {
								writer.write(str + System.lineSeparator());
							}

							for (Integer str2 : stat) {
								writer.write(str2 + System.lineSeparator());
							}

							for (String str3 : newChar2) {
								writer.write(str3 + System.lineSeparator());
							}

					

							writer.close();
<<<<<<< Updated upstream
=======

>>>>>>> Stashed changes
							CharecterCreationFrame.dispose();
							MainGameScreen maingamescreen = new MainGameScreen();
							
<<<<<<< Updated upstream
							
=======
							CharecterCreationFrame.dispose();
							new MainGameScreen2();


>>>>>>> Stashed changes
						} while (saveToonButton.getModel().isPressed());

					} catch (IOException e1) {
						JOptionPane.showMessageDialog(null, "Error:\n " + e1);
						e1.printStackTrace();
					}

				}
			});

			exitToStartMenuButton = new JButton("Return to Start Menu");
			exitToStartMenuButton.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					CharecterCreationFrame.dispose();
					new GameStartMenu();

				}});

			//myGameState.StartGameLoadCharecter();

			//******************************************************************
			//******** Adding to the JPanels  **********************************
			//******************************************************************

			JLabel classImage = new JLabel();

			NameAndStatsPanel.add(tooncreationTextField, BorderLayout.NORTH);
			NameAndStatsPanel.add(toonstatsTextArea, BorderLayout.CENTER);
			NameAndStatsPanel.add(reRollStatsButton, BorderLayout.SOUTH);

			ClassAndClassInfoPanel.add(charectorClass, BorderLayout.NORTH);
			//ClassAndClassInfo.add(toonclassDescription, BorderLayout.CENTER);

			//ClassAndClassInfo.add(classImage,BorderLayout.CENTER);
			ClassAndClassInfoPanel.add(ClassInfoAndImagePanel, BorderLayout.CENTER);
			ClassInfoAndImagePanel.add(toonclassDescriptionTextArea, BorderLayout.NORTH);
			ClassInfoAndImagePanel.add(classImage, BorderLayout.SOUTH);
			ClassAndClassInfoPanel.add(saveToonButton, BorderLayout.SOUTH);
			//ClassAndClassInfo.add(exitToStartMenu, BorderLayout.SOUTH);

			CharecterCreationFrame.setLocationRelativeTo(null);
			CharecterCreationFrame.toFront();
			CharecterCreationFrame.requestFocus();
			CharecterCreationFrame.setVisible(true);

			charName = JOptionPane.showInputDialog("Please Enter a Name for Your Charater.");
			tooncreationTextField.setText("Name: " + charName);

			new GameMenuItems();

	}

	public static void toonName(JTextField tooncreation, String charName, ArrayList<String> newChar) {

		boolean inputAccepted = false;
		while (!inputAccepted) {

			if (charName.equals("") || charName.equals("Please Enter a User Name.") || charName.equals(" ")) {

				charName = JOptionPane.showInputDialog("Please Enter a Name for Your Charater.");

			} else {

				if (charName.matches("^[A-Za-z]\\w{3,29}$")) {
					tooncreation.setText(charName);

					inputAccepted = true;
					newChar.add(charName);

				} else {
					JOptionPane.showMessageDialog(null,
							"Username must be 4 to 30 charecters long and consist of Numbers and Letters",
							"Invalid UserName", JOptionPane.INFORMATION_MESSAGE);
					toonName(tooncreation, charName, newChar);
				}

			}

		}

	}

	public static Integer[] rollstats() {
		int range = 20;
		int lowerbound = 10;

		Integer[] stats = new Integer[6];

		for (int i = 0; i < stats.length; i++) {
			stats[i] = (int) (Math.random() * range) + lowerbound;

		}

		return stats;
	}

	private static void classImage(String classImage) throws IOException
	{

		if(classImageLabel != null)
		{
			ClassInfoAndImagePanel.remove(classImageLabel);
		}

		ClassImagePicture = ImageIO.read(new File(GameSettings.ClassImagesPath + classImage + ".png")); // Buffered Image
		classImageLabel = new JLabel();
		classImageLabel.setSize(ClassInfoAndImagePanel.getWidth(), ClassInfoAndImagePanel.getHeight());

		Image newClassImagePicture = ClassImagePicture.getScaledInstance(classImageLabel.getWidth(), classImageLabel.getHeight(),
		        Image.SCALE_SMOOTH);


		ImageIcon img = new ImageIcon(newClassImagePicture);

		classImageLabel.setIcon(img);

		ClassInfoAndImagePanel.add(classImageLabel);

		classImageLabel.revalidate();

	}

}
