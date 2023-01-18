package AlternateRealityTheDungeon;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.Timer;

import ARTDEnemies.*;


public class ARTDCombat
{
		
	//https://stackoverflow.com/questions/38288522/how-to-get-a-random-item-from-a-class-in-java
	//https://stackoverflow.com/questions/18435992/java-call-object-methods-through-arraylist
	
	ARTDCharecter myChar = ARTDCharecter.Singleton();
	ARTDMenu myMenu = new ARTDMenu();
	

	int upperbound;
	double HeroHP;
	double HP;

	
	public ARTDCombat()
	{
		
		int upperbound = 3;
		

	}

	
	public void CombatEncouter() throws IOException
	{
		
	
			//Adding JFrame
			JFrame CombatFrame = new JFrame("You've encountered a " + "");
			
			//Adding JPanels
			JPanel CombatPanel = new JPanel(new BorderLayout());
			JPanel CombatPanelImage = new JPanel();     //Display Image of Enemy
			JPanel CombatPanelButtons = new JPanel(new FlowLayout()); // Display Buttons for Combat
			JPanel CombatPanelCombatArea = new JPanel(); //Display Combat Updates such as sucessful or not-successful attacks or HP lost
			JPanel CombatPanelCombatUpdateInfo = new JPanel(); // Your Stats
			JPanel CombatNameAndHPPanel = new JPanel();
			
			//Adding and Setting up JSplitPanes
			JSplitPane CombatImageAndCombatUpdatesStats = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
			JSplitPane CombatCombatUpdatesAndStats = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
			
			//Added JTextArea To display Combat outcomes
			JTextArea CombatCombatTextArea = new JTextArea();
			
			//Adding JTextField to Display Name and HP of Hero and Monster
			JTextArea CombatNameAndHPfield = new JTextArea();
			
			//Creating Buttons for Combat
			JButton CombatAttack = new JButton("Attack");
			JButton CombatSpell = new JButton("Select Spell to Cast");
			JButton CombatRun = new JButton("Run Away!");
			
			//Adding Parent JPanel to JFrame
			CombatFrame.add(CombatPanel, BorderLayout.CENTER);
			
			//Adding Image to JPanel
			BufferedImage myPicture = ImageIO.read(new File("src\\AlternateRealityTheDungeon\\Images\\GiantRat.jpg"));
			JLabel picLabel = new JLabel(new ImageIcon(myPicture));
		
			CombatPanelImage.add(picLabel);
			
			//Adding Panel for buttons to Master Panel
			CombatPanel.add(CombatPanelButtons, BorderLayout.SOUTH); // Place the "Attack", "Select Spell" and "Run Away" Buttons
				
			//Adding Child JPanels to Parent JPanel
			CombatPanel.add(CombatImageAndCombatUpdatesStats, BorderLayout.CENTER);
			
			//Adding Buttons to CombatPanelButtons JPanel		
			CombatPanelButtons.add(CombatAttack);
			CombatPanelButtons.add(CombatSpell);
			CombatPanelButtons.add(CombatRun);
					
			
			//added Jtextarea to JPanel used to Display Combat outcomes
			CombatPanelCombatArea.add(CombatCombatTextArea);
			CombatNameAndHPPanel.add(CombatNameAndHPfield);
			
			CombatImageAndCombatUpdatesStats.setLeftComponent(CombatPanelImage);
			CombatImageAndCombatUpdatesStats.setRightComponent(CombatCombatUpdatesAndStats);
			CombatCombatUpdatesAndStats.setTopComponent(CombatNameAndHPPanel);
			CombatCombatUpdatesAndStats.setBottomComponent(CombatPanelCombatUpdateInfo);
		
			CombatImageAndCombatUpdatesStats.setVisible(true);
			CombatCombatUpdatesAndStats.setVisible(true);
			CombatCombatUpdatesAndStats.setResizeWeight(.2d);
			CombatImageAndCombatUpdatesStats.setDividerLocation(0.5); //Places the Split in the middle of the pane
			CombatCombatUpdatesAndStats.setDividerLocation(0.25); //Sets the divider 3/4 of the way up the pane
			
			//Setting the JFrame to fill the screen
			Toolkit tk=Toolkit.getDefaultToolkit(); //Initializing the Toolkit class.
			Dimension screenSize = tk.getScreenSize(); //Get the Screen resolution of our device.
			
			//CombatNameAndHPfield.setLineWrap(true);
			CombatFrame.setSize(screenSize);
			CombatFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
			
			CombatFrame.setLocationRelativeTo(null);
			CombatFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			CombatFrame.setVisible(true);
			
			CombatNameAndHPfield.setText("Name:" + myChar.CharInfo.get(0)+"\t\tEnemy Name:" 
	            	+"\nHP: "+ "\t\tEnemy HP: "+"5");
			
			ActionListener task = new ActionListener() {
	            public void actionPerformed(ActionEvent evt) {
	            	CombatNameAndHPfield.setText("Name:" + myChar.CharInfo.get(0)+"\t\tEnemy Name:" 
					+"\nHP: "+ "\t\tEnemy HP: "+"5");

	 
	            	
	            	
	            }
			};
			Timer timer = new Timer(100 ,task); // Execute task each 100 miliseconds
			timer.setRepeats(true);
			timer.start();
			
			
			//Attack Button in Combat
			CombatAttack.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					
					if(HP > 0 || HeroHP > 0)
					{
						
					}
					
				}});
			
			//Cast Spell Button in Combat
			CombatSpell.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					
					JFrame spellsFrame = new JFrame();
					JButton CombatSpellCast = new JButton("Cast Selected Spell");
					JPanel spelllistbox = new JPanel(new BorderLayout());
					
					
					String[] spellList = ARTDSpells.Spells; //Get the list of spells from the Array in ARTDSpells class
					JComboBox<String> spells = new JComboBox<String>(spellList); // Add the spells from the Array into the JCombobox
					spells.setEditable(false);
					
					spells.addItemListener(new ItemListener() {

						@Override
						public void itemStateChanged(ItemEvent e) {
							
							String castspell = spells.getSelectedItem().toString();  //get the selected item in the JComboBox
							

							
							
							if(castspell.equals("Heal"))
							{
								
							}else if(castspell.equals("Cold_Blast"))
							{
								
							}else if(castspell.equals("Conjure_Food"))
							{
								JOptionPane.showMessageDialog(null, "Not Able to Cast the spell " + castspell + " in Combat");
								
							}else if(castspell.equals("Fire_Ball"))
							{
								
							}else if(castspell.equals("Light"))
							{
								
							}else if(castspell.equals("Location"))
							{
								JOptionPane.showMessageDialog(null, "Not Able to Cast the spell " + castspell + " in Combat");
							}else if (castspell.equals("Shield"))
							{
								
							}else if(castspell.equals("RandomStat"))
							{
								
							}else if(castspell.equals("Port"))
							{
								JOptionPane.showMessageDialog(null, "Not Able to Cast the spell " + castspell + " in Combat");
							}
							
							
						}});
					
					spellsFrame.add(spelllistbox);
					spelllistbox.add(spells, BorderLayout.CENTER);
					spelllistbox.add(CombatSpellCast, BorderLayout.SOUTH);
					
					spellsFrame.setSize(400, 200);
					spellsFrame.setLocationRelativeTo(null);
					
					spellsFrame.setVisible(true);
					
					CombatSpellCast.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							JOptionPane.showMessageDialog(null, "Add ability to cast spell in ARTDCombat Class");
							
						}});
					
					
				}});
			
			CombatRun.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
				}});
			
		}
		

	

}
