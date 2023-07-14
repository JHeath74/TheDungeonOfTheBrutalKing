package AlternateRealityTheDungeon;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import ARTDCharecterClass.ARTDBard;
import ARTDCharecterClass.ARTDCleric;
import ARTDCharecterClass.ARTDHunter;
import ARTDCharecterClass.ARTDPaladin;
import ARTDCharecterClass.ARTDRogue;
import ARTDCharecterClass.ARTDWarrior;

public class ARTDCharacterCreation {

	static ARTDLoadSaveGame myGameState = new ARTDLoadSaveGame();
	static ARTDGameSettings myGameSettings = new ARTDGameSettings();
	
	static String InitialCharecterSave, toonClass = "";
	static int width, height = 0;
	static Dimension size;
	static File charSave;
	static Scanner saveFile;
	
	static JFrame charecterCreationFrame;
	static JPanel NameAndStats, ClassAndClassInfo, panel3;
	static JTextArea toonstats, toonclassDescription;
	static JTextField tooncreation;
	static JScrollPane toonstatsPane;
	static JButton reRollStats, saveToon;
	static JSplitPane CharecterCreationPane;
	static JComboBox<String> charectorClass;
	static String[] toonclasslist;


	public static void CharacterCreation() throws IOException, InterruptedException {

		ARTDGameSettings myGameSettings = new ARTDGameSettings();
		
		
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
		 
		charecterCreationFrame = new JFrame("Create New Charecter");
		charecterCreationFrame.setSize(width, height);
		charecterCreationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		charecterCreationFrame.setBackground(myGameSettings.colorBrown);
		charecterCreationFrame.setUndecorated(false);
		
		//******************************************************************
		//******** Setting up JSplitPane  *********************************
		//******************************************************************
		CharecterCreationPane = new JSplitPane(CharecterCreationPane.HORIZONTAL_SPLIT);
		charecterCreationFrame.add(CharecterCreationPane);
		
		CharecterCreationPane.setDividerLocation(.5);
		CharecterCreationPane.setResizeWeight(.2d);
		//*****************************************************************
		//******** Setting up Other Needed Fields**************************
		//*****************************************************************
		
		toonstats = new JTextArea();
		toonclassDescription = new JTextArea();
		tooncreation = new JTextField();
		tooncreation.setEditable(false);
		tooncreation.setText("Name: " + ARTDMessages.toonName);
		toonstatsPane = new JScrollPane();
		
		
		
		//******************************************************************
		//******** Setting up JPanel and adding them to the JSplitPane *****
		//******************************************************************
		 NameAndStats = new JPanel(new BorderLayout());
		 ClassAndClassInfo = new JPanel(new BorderLayout());
		 
		CharecterCreationPane.setLeftComponent(NameAndStats);
		CharecterCreationPane.setRightComponent(ClassAndClassInfo);
		 
		//******************************************************************
		//******** Setting up Buttons **************************************
		//******************************************************************
		
		reRollStats = new JButton();
		saveToon = new JButton();
		
		

			

			// ************************************************************************
			// *** Rerolling Charecter Stats if you don't like what you got. **********
			// ************************************************************************

			Integer[] stat = rollstats();

			toonstats = new JTextArea();
			toonstatsPane = new JScrollPane(toonstats);

			toonstats.setText("Charecter Stats\n");

			toonstats.append("\nSTAMINA: \t\t" + stat[0]);
			toonstats.append("\nCHARISMA: \t\t" + stat[1]);
			toonstats.append("\nSTRENGTH: \t\t" + stat[2]);
			toonstats.append("\nINTELLIGENCE: \t" + stat[3]);
			toonstats.append("\nWISDOM: \t\t" + stat[4]);
			toonstats.append("\nAGILITY: \t\t" + stat[5]);

			toonstats.setEditable(false);

			// *********************************************************
			// ******** Selecting your Charecter Class *****************
			// *********************************************************

			toonclasslist = ARTDClass.toonclassarray;
			
			
			charectorClass = new JComboBox<String>(toonclasslist);
			toonclassDescription = new JTextArea("Choose Your Class from the Dropdown box above.");
			toonclassDescription.setLineWrap(true);
			
			toonclassDescription.setFont(myGameSettings.fontAvatar);

			charectorClass.addItemListener(new ItemListener() {

				@Override
				public void itemStateChanged(ItemEvent e) {
					System.out.println(toonClass);
					toonClass = charectorClass.getSelectedItem().toString();

					if (toonClass == toonclasslist[0]) {
						toonclassDescription.setText(ARTDPaladin.PaladinClassDescription);
					}
					if (toonClass == toonclasslist[1]) {
						toonclassDescription.setText(ARTDCleric.ClericClassDescription);
					}
					if (toonClass == toonclasslist[2]) {
						toonclassDescription.setText(ARTDRogue.RogueClassDescription);
					}

					if (toonClass == toonclasslist[3]) {
						toonclassDescription.setText(ARTDHunter.HunterClassDescription);
					}
					if (toonClass == toonclasslist[4]) {
						toonclassDescription.setText(ARTDWarrior.WarriorClassDescription);
					}
					if (toonClass == toonclasslist[5]) {
						toonclassDescription.setText(ARTDBard.BardClassDescription);
					}

				}
			});

		//	toonClass = charectorClass.getSelectedItem().toString();
			reRollStats = new JButton("Reroll Stats");
			reRollStats.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					rollstats();
					Integer[] stat = rollstats();
					toonstats.setText(" ");

					for (int i = 0; i < stat.length; i++) {

						toonstats.setText("Charecter Stats\n");

						toonstats.append("\nSTAMINA: \t\t" + stat[0]);
						toonstats.append("\nCHARISMA: \t\t" + stat[1]);
						toonstats.append("\nSTRENGTH: \t\t" + stat[2]);
						toonstats.append("\nINTELLIGENCE: \t" + stat[3]);
						toonstats.append("\nWISDOM: \t\t" + stat[4]);
						toonstats.append("\nAGILITY: \t\t" + stat[5]);
						toonstats.validate();
					}

				}

			});

			saveToon = new JButton("Save Charecter"); // Save Button for Charecter creation
			saveToon.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					try {

						FileWriter writer = new FileWriter(
								"src//AlternateRealityTheDungeon//SaveGame//InitialCharecterSave.txt");

						ArrayList<String> newChar = new ArrayList<String>();

						ArrayList<String> newChar2 = new ArrayList<String>();
						String charName = ARTDMessages.toonName;

						// Validating if the Charecter Name is blank or not
						toonName(tooncreation, charName, newChar);

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
							
							//JOptionPane.showMessageDialog(frame, "Charecter Created");
							
							writer.close();
							charecterCreationFrame.dispose();
							new ARTDMenuBar();

						} while (saveToon.getModel().isPressed());

					} catch (IOException e1) {
						JOptionPane.showMessageDialog(null, "Error:\n " + e1);
						e1.printStackTrace();
					}

				}
			});
			
			//myGameState.StartGameLoadCharecter();

			//******************************************************************
			//******** Adding to the JPanels  **********************************
			//******************************************************************
			
			NameAndStats.add(tooncreation, BorderLayout.NORTH);
			NameAndStats.add(toonstats, BorderLayout.CENTER);
			NameAndStats.add(reRollStats, BorderLayout.SOUTH);
			
			ClassAndClassInfo.add(charectorClass, BorderLayout.NORTH);
			ClassAndClassInfo.add(toonclassDescription, BorderLayout.CENTER);
			ClassAndClassInfo.add(saveToon, BorderLayout.SOUTH);
			
			charecterCreationFrame.setLocationRelativeTo(null);
			charecterCreationFrame.toFront();
			charecterCreationFrame.requestFocus();
			charecterCreationFrame.setVisible(true);
			

			new ARTDGameMenuItems();

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

}
