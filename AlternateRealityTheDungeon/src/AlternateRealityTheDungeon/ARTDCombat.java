package AlternateRealityTheDungeon;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.ComboBoxModel;
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

import ARTDEnemies.ARTDRats;
import ARTDEnemies.ARTDSkeletons;
import ARTDEnemies.ARTDSpiders;




public class ARTDCombat
{
		
	//https://stackoverflow.com/questions/38288522/how-to-get-a-random-item-from-a-class-in-java
	//https://stackoverflow.com/questions/18435992/java-call-object-methods-through-arraylist
	
	ARTDSingleton myCharSingleton = new ARTDSingleton();

	int HP;
	String HeroHPArrayList;
	int HeroHP;
	
	public ARTDCombat()
	{
			
		HeroHPArrayList = ARTDSingleton.myCharSingleton().CharInfo.get(4);
		HeroHP = Integer.parseInt(HeroHPArrayList); 
	
	}

	
	public void CombatEncouter() throws IOException
	{
		
			
			
			int rnd = new Random().nextInt(ARTDSingleton.myMonsters().size());
						
			ARTDEnemies enemy = ARTDSingleton.myMonsters().get(rnd);
		    
			//Adding JFrame
			JFrame CombatFrame = new JFrame("You've encountered a " + ARTDSingleton.myMonsters().get(rnd).toString());
			
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
			JButton CastSelectedSpell = new JButton("Cast Selected Spell");
			JButton CombatSpell = new JButton("Select Spell to Cast");
			JButton CombatRun = new JButton("Run Away!");
			
			
			
			//Adding Parent JPanel to JFrame
			CombatFrame.add(CombatPanel, BorderLayout.CENTER);
			
			
			//Adding Image to JPanel
			BufferedImage myPicture = ImageIO.read(new File("src\\AlternateRealityTheDungeon\\Images\\"+ARTDSingleton.myMonsters().get(rnd).MonsterImage));
			JLabel picLabel = new JLabel(new ImageIcon(myPicture));
		
			Dimension imageSize = new Dimension();
			imageSize.setSize(768, 1024); //Double Width, Double Height
			
			picLabel.setPreferredSize(imageSize);; //Getting the size of the JPanel for the monster image
			CombatPanelImage.add(picLabel);
			
			//Adding Panel for buttons to Master Panel
			CombatPanel.add(CombatPanelButtons, BorderLayout.SOUTH); // Place the "Attack", "Select Spell" and "Run Away" Buttons
				
			//Adding Child JPanels to Parent JPanel
			CombatPanel.add(CombatImageAndCombatUpdatesStats, BorderLayout.CENTER);
			
			//Adding Buttons to CombatPanelButtons JPanel		
			CombatPanelButtons.add(CombatAttack);
			CombatPanelButtons.add(CastSelectedSpell);
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
			//CombatFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
			CombatFrame.setState(Frame.NORMAL);
			
			CombatFrame.setLocationRelativeTo(null);
			CombatFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			CombatFrame.setVisible(true);
			
			ActionListener task = new ActionListener() {
	            public void actionPerformed(ActionEvent evt) {
	                	
	            	CombatNameAndHPfield.setText("Name:" + ARTDSingleton.myCharSingleton().CharInfo.get(0)+
	            			"\t\tEnemy Name:" + ARTDSingleton.myMonsters().get(rnd).name.toString()
					+"\nHP: "+  ARTDSingleton.myCharSingleton().CharInfo.get(4) + "\t\tEnemy HP: "+ ARTDSingleton.myMonsters().get(rnd).MonsterHP);
	            	
	            }
			};
			Timer timer = new Timer(1000 ,task); // Execute task each 1000 miliseconds
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
			
			//CastSpell Button in Combat
			CastSelectedSpell.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					
					
				}});
			
			//Select Spell to Cast
			CombatSpell.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					
					JFrame spellsFrame = new JFrame();
					JButton SelectSpellToCast = new JButton("Select Spell to Cast");
					
					JPanel spelllistbox = new JPanel(new BorderLayout());
			
					
					
					String[] spellList = new String[ARTDSingleton.myCharSingleton().CharInfo.size()];
			  
					for (int i = 20; i < ARTDSingleton.myCharSingleton().CharInfo.size(); i++)
						spellList[i] = ARTDSingleton.myCharSingleton().CharInfo.get(i);
					
					JComboBox<String> spells = new JComboBox<String>(spellList);

					
						if(spellList.length == 0) {
							spells.addItem("No Spells To Cast");
							spells.setEditable(false);
						}else {
							
						}
						
											
					spells.addItemListener(new ItemListener() {

						@Override
						public void itemStateChanged(ItemEvent e) {
							
							String castspell = spells.getSelectedItem().toString();  //get the selected item in the JComboBox
							
							ARTDCastSpells.Castspell(castspell);
								
							
						}});
					
					spellsFrame.add(spelllistbox);
					spelllistbox.add(spells, BorderLayout.CENTER);
					spelllistbox.add(CastSelectedSpell, BorderLayout.SOUTH);
					spelllistbox.add(SelectSpellToCast, BorderLayout.SOUTH);
					
					spellsFrame.setSize(400, 200);
					spellsFrame.setLocationRelativeTo(null);
					
					spellsFrame.setVisible(true);
					
					
					}
					
				});
			
			CombatRun.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
				}});
			
		}
		

	

}
