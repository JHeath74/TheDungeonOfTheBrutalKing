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
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
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

	public static void main(String[] args) throws IOException, InterruptedException {

		ARTDLoadSaveGame mygamestate = new ARTDLoadSaveGame();

		Scanner saveFile = new Scanner(
				new File("src//AlternateRealityTheDungeon//TextFiles//SaveGame//InitialCharecterSave.txt"));

		if (!saveFile.hasNext()) {
			JFrame frame = new JFrame("Create New Charecter");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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
					String toonD = charectorClass.getSelectedItem().toString();

					if (toonD == toonclass[0]) {
						toonclassDescription.setText(ARTDCharecter.toonclassDescription[0]);
					}
					if (toonD == toonclass[1]) {
						toonclassDescription.setText(ARTDCharecter.toonclassDescription[1]);
					}
					if (toonD == toonclass[2]) {
						toonclassDescription.setText(ARTDCharecter.toonclassDescription[2]);
					}
					if (toonD == toonclass[3]) {
						toonclassDescription.setText(ARTDCharecter.toonclassDescription[3]);
					}
					if (toonD == toonclass[4]) {
						toonclassDescription.setText(ARTDCharecter.toonclassDescription[4]);
					}
					if (toonD == toonclass[5]) {
						toonclassDescription.setText(ARTDCharecter.toonclassDescription[5]);
					}

				}
			});

			String toonD = charectorClass.getSelectedItem().toString();
			JButton reRollStats = new JButton("Reroll Stats");
			reRollStats.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					rollstats();
					Integer[] stat = rollstats();
					toonstats.setText(" ");


					for(int i = 0; i < stat.length; i++)
					{
						
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

						toonName(charName, toonD, newChar, newChar2);
									
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

						JOptionPane.showMessageDialog(frame, "Charecter Created");

						frame.dispose();
						new ARDTMenu();

					} catch (IOException e1) {
						JOptionPane.showMessageDialog(null, "Error:\n " + e1);
						e1.printStackTrace();
					}

					try {
						ARTDCharecter myChar = new ARTDCharecter();
				        for(int i = 0; i < myChar.CharInfo().size(); i++)
				        {
				        	System.out.println("Toon Information: " + i);
				        }
						
						mygamestate.StartGameLoadCharecter();
						
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}
			});

			mygamestate.StartGameLoadCharecter();

			/*
			 * if (ARDTMessages.count == 0) { ARDTMessages.count++;
			 * ARDTMessages.WelcomeMessage(); }
			 */

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

			frame.setVisible(true);

		} else {

			ARDTMessages.count++;
			new ARDTMenu();
		}

	}

	
	public static String toonName(String charName, String toonD, ArrayList<String> newChar, ArrayList<String> newChar2)
	{
		
		
		boolean inputAccepted = false;
		while(!inputAccepted) {
		

		  
		    if (charName.equals("") || charName.equals("Please Enter a User Name.") || charName.equals(" ")) 
		    {
		    	
		    	charName = JOptionPane.showInputDialog("Please Enter a Name for Your Charater.");

		    	
		    } else {
		    	
		    	inputAccepted = true;
		    	newChar.add(charName);	
				// Character Class
				newChar.add(toonD);

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
		    }

		    
		}
		return charName;
		
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
