package AlternateRealityTheDungeon;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class ARTDGameMenuItems 
{

	ARTDCharecter myChar = ARTDCharecter.Singleton();
	
	
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
		
		
		
		Color sab = new Color(25, 50, 75);
		Color sabText = new Color(255,255,255);
		
		statsArea.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 15));
		statsArea.setForeground(sabText);
		statsArea.setBackground(sab);
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

		
		statsArea.setText("Name: " + myChar.CharInfo.get(0)+"\n");
		statsArea.append("Level: " + myChar.CharInfo.get(1)+"\n");
		statsArea.append("Experience: " + myChar.CharInfo.get(2)+"\n");
		statsArea.append("Hit Points: " + myChar.CharInfo.get(3)+"\n");
		statsArea.append("Stamina: " + myChar.CharInfo.get(4)+"\n");
		statsArea.append("Charisma: " + myChar.CharInfo.get(5)+"\n");
		statsArea.append("Strength: " + myChar.CharInfo.get(6)+"\n");
		statsArea.append("Intelligence: " + myChar.CharInfo.get(7)+"\n");
		statsArea.append("Wisdom: " + myChar.CharInfo.get(8)+"\n");
		statsArea.append("Agility: " + myChar.CharInfo.get(9)+"\n");
		
	
		
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
		
		invArea.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 15));
		Color sab = new Color(25, 50, 75);
		Color sabText = new Color(255,255,255);
		
		invArea.setForeground(sabText);
		invArea.setBackground(sab);
		
		invArea.setVisible(true);
		
		invFrame.setLocationRelativeTo(null);
		invFrame.setSize(400, 600);
		invFrame.setLocationRelativeTo(null);
		invFrame.setVisible(true);
		invFrame.toFront();
		invFrame.requestFocus();
		
		invArea.setText("");
		
		invArea.setText("Gold: " + myChar.CharInfo.get(12)+"\n");
		invArea.append("Gems: " + myChar.CharInfo.get(15)+"\n");
		invArea.append("Food: " + myChar.CharInfo.get(13)+"\n");
	    invArea.append("Torches: " + myChar.CharInfo.get(14)+"\n");
		//invArea.append("Armour: " + myChar.CharInfo.get());
		//invArea.append("Weapon: " + myChar.CharInfo.get());
		
		
	}


}
