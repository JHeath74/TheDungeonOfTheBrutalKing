package AlternateRealityTheDungeon;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class ARTDGameMenuItems 
{
	
	ARTDCharecter myChar = new ARTDCharecter();
	
	public void Stats()
	{
		JFrame statsFrame = new JFrame("Charecter Stats");
		statsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextArea statsArea = new JTextArea();
		JButton closeStats = new JButton("Ok");
		
		closeStats.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				statsFrame.dispose();
				
			}
			
		});
				
		statsFrame.add(statsArea, BorderLayout.CENTER);
		statsFrame.add(closeStats, BorderLayout.SOUTH);
		
		statsArea.setVisible(true);
		
		statsFrame.setSize(400, 600);
		statsFrame.setLocationRelativeTo(null);
		statsFrame.setVisible(true);
		statsFrame.toFront();
		statsFrame.requestFocus();
		
		statsArea.setText("");
		
		//  newChar.add("Class: " + toonD); 
		//  newChar.add("Level" + "0");
		//  newChar.add("Experience: "+ "0"); 
		//  newChar.add("Hit Points" + "15");
		//  newChar.add("STAMINA: " + stat[0]);
		//  newChar.add("CHARISMA: " + stat[1]);
		//  newChar.add("STRENGTH: " + stat[2]);
		//  newChar.add("INTELLIGENCE: "+ stat[3]);
		//  newChar.add("WISDOM: " + stat[4]); 
		//  newChar.add("AGILITY: " + stat[5]);
		//  newChar.add("Gold: " + "100"); 
		//  newChar.add("Food: " + "5");
		//  newChar.add("Torches: " + "5"); 
		//  newChar.add("Gems: " + "0" );
		

		for(int i = 0; i < myChar.CharInfo.size(); i++)
		{
			System.out.println("Arraytest");
		}
		
		statsArea.setText("Name: " + myChar.CharInfo.get(0));
		statsArea.append("Level: " + myChar.CharInfo.get(1));
		statsArea.append("Experience: " + myChar.CharInfo.get(2));
		statsArea.append("Hit Points: " + myChar.CharInfo.get(3));
		statsArea.append("Stamina: " + myChar.CharInfo.get(4));
		statsArea.append("Charisma: " + myChar.CharInfo.get(5));
		statsArea.append("Strength: " + myChar.CharInfo.get(6));
		statsArea.append("Intelligence: " + myChar.CharInfo.get(7));
		statsArea.append("Wisdom: " + myChar.CharInfo.get(8));
		statsArea.append("Agility: " + myChar.CharInfo.get(9));
		statsArea.append("Gems: " + myChar.CharInfo.get(13));
		
		
		
		
		
		
		
	}
	
	public void Inventory()
	{
		JFrame invFrame = new JFrame("Inventory");
		invFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextArea invArea = new JTextArea();
		JButton closeStats = new JButton("Ok");
		
		closeStats.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			
				invFrame.dispose();
				
			}
			
		});
		
		
		invFrame.add(invArea, BorderLayout.CENTER);
		invFrame.add(closeStats, BorderLayout.SOUTH);
		
		invArea.setVisible(true);
		
		invFrame.setLocationRelativeTo(null);
		invFrame.setSize(400, 600);
		invFrame.setLocationRelativeTo(null);
		invFrame.setVisible(true);
		invFrame.toFront();
		invFrame.requestFocus();
		
		invArea.setText("");
				
		invArea.append("Gold: " + myChar.CharInfo.get(10));
		invArea.append("Food: " + myChar.CharInfo.get(11));
		invArea.append("Torches: " + myChar.CharInfo.get(12));
		//invArea.append("Armour: " + myChar.CharInfo.get());
		//invArea.append("Weapon: " + myChar.CharInfo.get());
		
		
	}

}
