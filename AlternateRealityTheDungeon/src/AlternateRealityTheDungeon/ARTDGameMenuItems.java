package AlternateRealityTheDungeon;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;


public class ARTDGameMenuItems
{

	ARTDCharecter myChar = ARTDCharecter.Singleton();
	
	
	public void Stats()
	{
		JFrame statsFrame = new JFrame("Charecter Stats");

		
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
		
		
		//Background Colors
		Color sab = new Color(25, 50, 75);
		
		//Text Colors
		Color sabText = new Color(255,255,255);
		
		//Text Font Settings
		statsArea.setFont(new Font(Font.SERIF, Font.PLAIN, 15));
		
		statsArea.setForeground(sabText);
		statsArea.setBackground(sab);
		statsArea.setVisible(true);
		
		statsFrame.setSize(400, 600);
		statsFrame.setLocationRelativeTo(null);
		statsFrame.setVisible(true);
		statsFrame.toFront();
		statsFrame.requestFocus();
		
		statsArea.setText("");
		

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
		
		statsArea.setText("Name: " + myChar.CharInfo.get(0)+"\n");
		statsArea.append("Class: " + myChar.CharInfo.get(1)+"\n" );
		statsArea.append("Level: " + myChar.CharInfo.get(2)+"\n");
		statsArea.append("Experience: " + myChar.CharInfo.get(3)+"\n");
		statsArea.append("Hit Points: " + myChar.CharInfo.get(4)+"\n");
		statsArea.append("Stamina: " + myChar.CharInfo.get(5)+"\n");
		statsArea.append("Charisma: " + myChar.CharInfo.get(6)+"\n");
		statsArea.append("Strength: " + myChar.CharInfo.get(7)+"\n");
		statsArea.append("Intelligence: " + myChar.CharInfo.get(8)+"\n");
		statsArea.append("Wisdom: " + myChar.CharInfo.get(9)+"\n");
		statsArea.append("Agility: " + myChar.CharInfo.get(10)+"\n");
		
	
		
	}
	
	public void Inventory()
	{
		JFrame invFrame = new JFrame("Inventory");
		//invFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JTextArea invArea = new JTextArea();
		JButton closeStats = new JButton("Ok");

		
		closeStats.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			
				myChar.CharInfo.set(11, "300");
				invFrame.dispose();
				
			}
			
		});
		
		invFrame.add(invArea, BorderLayout.CENTER);
		invFrame.add(closeStats, BorderLayout.SOUTH);
		
		//Text Font Settings
		invArea.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 15));
		
		//Background Colors
		Color sab = new Color(25, 50, 75);
		
		//Text Colors
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

		for(int i =0; i < myChar.CharInfo.size(); i++)
		{
			System.out.println("i: " + myChar.CharInfo.toString());
			myChar.CharInfo.set(3, "30");
		}
	      
	    
		invArea.setText("Gold: " + myChar.CharInfo.get(11)+"\n");
		invArea.append("Gems: " + myChar.CharInfo.get(15)+"\n");
		invArea.append("\t__________ Misc__________\n");
		invArea.append("Food: " + myChar.CharInfo.get(13)+"\n");
	    invArea.append("Torches: " + myChar.CharInfo.get(14)+"\n");
		//invArea.append("Armour: " + myChar.CharInfo.get());
		//invArea.append("Weapon: " + myChar.CharInfo.get());
		
		
	}
	


}
