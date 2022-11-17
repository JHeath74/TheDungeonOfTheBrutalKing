package AlternateRealityTheDungeon;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ARTDMain {

	private static final String SaveDirectoryPath = null;

	public static void main(String[] args) throws IOException, InterruptedException {

		//String SaveDirectoryPath = "src//AlternateRealityTheDungeon//TextFiles//SaveGame//";
		
		ARTDLoadSaveGame mygamestate = new ARTDLoadSaveGame();

		//When a new game is started,  this is the file where the initial charecter information is stored		
		String InitialCharecterSave = "src//AlternateRealityTheDungeon//TextFiles//SaveGame//InitialCharecterSave.txt";

		//Checking to see if the file is there, and if it isn't then a blank file is generated.
		File charSave = new File(InitialCharecterSave);
		if (!charSave.createNewFile()) {

		} else {
			ARTDMessages.WelcomeMessage();
			
		}

		Scanner saveFile = new Scanner(charSave);

		//If the file is blank,  then start creating a new charecter
		if (!saveFile.hasNext()) {
			JFrame frame = new JFrame("Create New Charecter");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			saveFile.close();

			// Tooncreation, allows user to make up their name
			JTextField tooncreation = new JTextField("Please Enter a User Name.");
			tooncreation.addMouseListener(new MouseListener() {

				@Override
				public void mouseClicked(MouseEvent e) {
					tooncreation.setText("");

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

			Integer[] stat = rollstats();

			JTextArea toonstats = new JTextArea();
			JScrollPane toonstatsPane = new JScrollPane(toonstats);

			toonstats.setText("Charecter Stats\n");

			toonstats.append("\nSTAMINA: \t\t" + stat[0]);
			toonstats.append("\nCHARISMA: \t\t" + stat[1]);
			toonstats.append("\nSTRENGTH: \t\t" + stat[2]);
			toonstats.append("\nINTELLIGENCE: \t" + stat[3]);
			toonstats.append("\nWISDOM: \t\t" + stat[4]);
			toonstats.append("\nAGILITY: \t\t" + stat[5]);

			toonstats.setEditable(false);

			String[] toonclass = ARTDCharecter.toonclass;

			JComboBox<String> charectorClass = new JComboBox<String>(toonclass);

			JTextArea toonclassDescription = new JTextArea("Choose Your Class from the Dropdown box above."); //
			toonclassDescription.setLineWrap(true);

			charectorClass.addItemListener(new ItemListener() {

				@Override
				public void itemStateChanged(ItemEvent e) {
					String toonClass = charectorClass.getSelectedItem().toString();

					if (toonClass == toonclass[0]) {
						toonclassDescription.setText(ARTDCharecter.toonclassDescription[0]);
					}
					if (toonClass == toonclass[1]) {
						toonclassDescription.setText(ARTDCharecter.toonclassDescription[1]);
					}
					if (toonClass == toonclass[2]) {
						toonclassDescription.setText(ARTDCharecter.toonclassDescription[2]);
					}
					if (toonClass == toonclass[3]) {
						toonclassDescription.setText(ARTDCharecter.toonclassDescription[3]);
					}
					if (toonClass == toonclass[4]) {
						toonclassDescription.setText(ARTDCharecter.toonclassDescription[4]);
					}
					if (toonClass == toonclass[5]) {
						toonclassDescription.setText(ARTDCharecter.toonclassDescription[5]);
					}

				}
			});

			String toonClass = charectorClass.getSelectedItem().toString();
			JButton reRollStats = new JButton("Reroll Stats");
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

			JButton saveToon = new JButton("Save Charecter"); // Save Button for Charecter creation
			saveToon.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					try {

						FileWriter writer = new FileWriter(
								"src//AlternateRealityTheDungeon//TextFiles//SaveGame//InitialCharecterSave.txt");
						ArrayList<String> newChar = new ArrayList<String>();

						ArrayList<String> newChar2 = new ArrayList<String>();
						String charName = String.valueOf(tooncreation.getText());

						//Validating if the Charecter Name is blank or not
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

							JOptionPane.showMessageDialog(frame, "Charecter Created");
							writer.close();
							frame.dispose();
							new ARTDMenu();

						} while (saveToon.getModel().isPressed());

					} catch (IOException e1) {
						JOptionPane.showMessageDialog(null, "Error:\n " + e1);
						e1.printStackTrace();
					}

				}
			});

			//mygamestate.StartGameLoadCharecter();
			
			
			
			
	

			JPanel panel = new JPanel();
			JPanel panel2 = new JPanel(new FlowLayout());
			JPanel panel3 = new JPanel(new BorderLayout());

			panel.add(saveToon);

			panel2.add((charectorClass)); // Select Charector Class
			panel2.add((toonstatsPane)); // Display Randomly Generated Charector Stats
			panel3.add((toonclassDescription), BorderLayout.NORTH);
			panel3.add(reRollStats, BorderLayout.CENTER);
			panel3.add(saveToon, BorderLayout.SOUTH);

			frame.add((tooncreation), BorderLayout.NORTH);
			frame.add((panel2), BorderLayout.CENTER);
			frame.add((panel3), BorderLayout.SOUTH);

			frame.setSize(400, 600);
			frame.setLocationRelativeTo(null);
			frame.setVisible(true);
			frame.toFront();
			frame.requestFocus();

		} else {
			
			//mygamestate.StartGameLoadCharecter();
			
			
			
			//getLastModified();
			
			
			
			new ARTDMenu();
		}

	}

	public static void toonName(JTextField tooncreation, String charName, ArrayList<String> newChar) {

		boolean inputAccepted = false;
		while (!inputAccepted) {

			if (charName.equals("") || charName.equals("Please Enter a User Name.") || charName.equals(" ")) {

				charName = JOptionPane.showInputDialog("Please Enter a Name for Your Charater.");

			} else {
				tooncreation.setText(charName);
				inputAccepted = true;
				newChar.add(charName);

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
	
//	public static File getLastModified()
//	{
//	    File directory = new File(SaveDirectoryPath);
//	    File[] files = directory.listFiles(File::isFile);
//	    long lastModifiedTime = Long.MIN_VALUE;
//	    File chosenFile = null;
//	    File recentlySavedFile = null;
//
//	    if (files != null)
//	    {
//	        for (File file : files)
//	        {
//	            if (file.lastModified() > lastModifiedTime)
//	            {
//	                chosenFile = file;
//	                lastModifiedTime = file.lastModified();
//	                
//	               
//	            }
//	        }
//	    }
//
//	    return chosenFile;
//	}

}
