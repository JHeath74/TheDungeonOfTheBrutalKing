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
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.Timer;

public class ARTDCombat extends JFrame {



	// https://stackoverflow.com/questions/38288522/how-to-get-a-random-item-from-a-class-in-java
	// https://stackoverflow.com/questions/18435992/java-call-object-methods-through-arraylist

	private static final long serialVersionUID = 1L;
	ARTDSingleton myCharSingleton = new ARTDSingleton();
	ARTDGameSettings myGameSettings = new ARTDGameSettings();
	ARTDMenu myMenu = null;
	
	String HeroHPArrayList = "";
	
	public JFrame CombatFrame, spellsFrame;
	public JPanel CombatPanel, CombatPanelImage, CombatPanelButtons, 
		   CombatPanelCombatArea, CombatPanelCombatUpdateInfo,
		   CombatNameAndHPPanel, spelllistbox = null;
	public JSplitPane CombatImageAndCombatUpdatesStats, CombatCombatUpdatesAndStats  = null;
	public JTextArea CombatCombatTextArea, CombatNameAndHPfield  = null;
	public JButton CombatAttack, CastSelectedSpell, CombatSpell, CombatRun, SelectSpellToCast  = null;
	public JLabel picLabel  = null;
	public int width, height, HP, HeroHP, randomCombatChance = 0;
	public Dimension imageSize = null;
	public BufferedImage myPicture = null;
	public Timer timer = null;
	public String[] spellList = null;

	public ARTDCombat() throws IOException {

		HeroHPArrayList = ARTDSingleton.myCharSingleton().CharInfo.get(4);
		HeroHP = Integer.parseInt(HeroHPArrayList);		
		
		 myMenu = new ARTDMenu();

	}

	public void CombatEncouter() throws IOException {
		
		int rnd = new Random().nextInt(ARTDSingleton.myMonsters().size());

		//*************************************************************
		//-------------------Adding and Setting Up JFrame -------------
		//*************************************************************
			CombatFrame = new JFrame();
			CombatFrame.setLayout(new BorderLayout());
			
			// Setting the JFrame to fill the screen
			// getScreenSize() returns the size
	        // of the screen in pixels
	        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
	        
	        // width will store the width of the screen
	        width = (int)size.getWidth();
	        
	        // height will store the height of the screen
	        height = (int)size.getHeight();
	        
			CombatFrame.setSize(width, height);
		
		//*************************************************************
		//-------------------Adding and Setting Up JPanels-------------
		//*************************************************************
				
		//CombatPanel = myMenu.GameImagesAndCombatPanel;
		CombatPanel = new JPanel(new BorderLayout());
		CombatPanelImage = new JPanel(); // Display Image of Enemy
		CombatPanelButtons = new JPanel(new FlowLayout()); // Display Buttons for Combat
		CombatPanelCombatArea = new JPanel(); // Display Combat Updates such as sucessful or not-successful
														// attacks or HP lost
		CombatPanelCombatUpdateInfo = new JPanel(); // Your Stats
		CombatNameAndHPPanel = new JPanel(new FlowLayout());

		//*************************************************************
		//-------------------Adding and Setting Up JSplitPanes---------
		//*************************************************************
		
		
		CombatImageAndCombatUpdatesStats = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		CombatCombatUpdatesAndStats = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		
		//*************************************************************
		//-------------------Adding and Setting Up JTextArea-----------
		//*************************************************************

		// Added JTextArea To display Combat outcomes
		CombatCombatTextArea = new JTextArea();

		// Adding JTextField to Display Name and HP of Hero and Monster
		CombatNameAndHPfield = new JTextArea();
		
		//*************************************************************
		//-------------------Adding and Setting Up JButtons-----------
		//*************************************************************

		// Creating Buttons for Combat
		CombatAttack = new JButton("Attack");
		CastSelectedSpell = new JButton("Cast Selected Spell");
		CombatSpell = new JButton("Select Spell to Cast");
		CombatRun = new JButton("Run Away!");

		// Adding Parent JPanel to JFrame
		   CombatFrame.add(CombatPanel, BorderLayout.CENTER);

		// Getting Image to display from it's location in the project
		myPicture = ImageIO.read(new File(
				myGameSettings.MonsterImagePath + ARTDSingleton.myMonsters().get(rnd).MonsterImage));
		
		//Adding image to JLabel
		picLabel = new JLabel(new ImageIcon(myPicture));		

		imageSize = new Dimension();
		imageSize.setSize(768, 1024); // Double Width, Double Height
		picLabel.setPreferredSize(imageSize);		
				
		// Adding the image to the JPanel for the monster image
	   //	CombatPanelImage.add(picLabel);

		// Adding Panel for buttons to Master Panel
		CombatPanel.add(CombatPanelButtons, BorderLayout.SOUTH); // Place the "Attack", "Select Spell" and "Run Away"
																	// Buttons

		// Adding Child JPanels to Parent JPanel
		CombatPanel.add(CombatImageAndCombatUpdatesStats, BorderLayout.CENTER);

		// Adding Buttons to CombatPanelButtons JPanel
		CombatPanelButtons.add(CombatAttack);
		CombatPanelButtons.add(CastSelectedSpell);
		CombatPanelButtons.add(CombatSpell);
		CombatPanelButtons.add(CombatRun);

		// added Jtextarea to JPanel used to Display Combat outcomes
		CombatPanelCombatArea.add(CombatCombatTextArea);
		CombatNameAndHPPanel.add(CombatNameAndHPfield);
		
		CombatPanelCombatUpdateInfo.add(CombatPanelCombatArea); // Display Out Come of each attack, Item Usage or spell

		CombatImageAndCombatUpdatesStats.setLeftComponent(CombatPanelImage);
		CombatImageAndCombatUpdatesStats.setRightComponent(CombatCombatUpdatesAndStats);
		CombatCombatUpdatesAndStats.setTopComponent(CombatNameAndHPPanel);
		CombatCombatUpdatesAndStats.setBottomComponent(CombatPanelCombatUpdateInfo);

		CombatImageAndCombatUpdatesStats.setVisible(true);
		CombatCombatUpdatesAndStats.setVisible(true);
		CombatCombatUpdatesAndStats.setResizeWeight(.2d);
		CombatImageAndCombatUpdatesStats.setDividerLocation(0.5); // Places the Split in the middle of the pane
		CombatCombatUpdatesAndStats.setDividerLocation(0.25); // Sets the divider 3/4 of the way up the pane

		
		CombatNameAndHPfield.setLineWrap(false);
		CombatNameAndHPfield.setEditable(false);
		CombatNameAndHPfield.setBackground(myGameSettings.colorLightYellow);
		CombatNameAndHPfield.setSize(CombatNameAndHPPanel.getSize());
		
		CombatNameAndHPPanel.setBackground(myGameSettings.colorCoral);
		
		
		

		ActionListener task = new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				
				myMenu.CombatMessageArea.append("Name: " + ARTDSingleton.myCharSingleton().CharInfo.get(0)
						 + "\nYour HP: " + ARTDSingleton.myCharSingleton().CharInfo.get(4) + "\n\nEnemy Name: " + ARTDSingleton.myMonsters().get(rnd).name.toString()
						 + "\nEnemy HP: " + ARTDSingleton.myMonsters().get(rnd).MonsterHP);
				/*CombatNameAndHPfield.setText("Name: " + ARTDSingleton.myCharSingleton().CharInfo.get(0)
						 + "\nYour HP: " + ARTDSingleton.myCharSingleton().CharInfo.get(4) + "\n\nEnemy Name: " + ARTDSingleton.myMonsters().get(rnd).name.toString()
						 + "\nEnemy HP: " + ARTDSingleton.myMonsters().get(rnd).MonsterHP);
				 */
			}
		};
		timer = new Timer(1000, task); // Execute task each 1000 miliseconds
		timer.setRepeats(true);
		timer.start();

		// Attack Button in Combat
		CombatAttack.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (HP > 0 || HeroHP > 0) {

				}

			}
		});

		// CastSpell Button in Combat
		CastSelectedSpell.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});

		// Select Spell to Cast
		CombatSpell.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				spellsFrame = new JFrame();
				SelectSpellToCast = new JButton("Select Spell to Cast");
				spelllistbox = new JPanel(new BorderLayout());

				spellList = new String[ARTDSingleton.myCharSingleton().CharInfo.size()];

				for (int i = 21; i < ARTDSingleton.myCharSingleton().CharInfo.size(); i++)
					spellList[i] = ARTDSingleton.myCharSingleton().CharInfo.get(i);

				JComboBox<String> spells = new JComboBox<String>();

				if (spellList.length == 0) {
					spells = new JComboBox<String>();
					spells.addItem("No Spells Available To Cast");
					spells.setEditable(false);
				}
					spells = new JComboBox<String>(spellList);
					spells.setEditable(false);
				

				spells.addItemListener(new ItemListener() {

					@Override
					public void itemStateChanged(ItemEvent e) {

						//String castspell = spells.getSelectedItem().toString(); // get the selected item in the
																				// JComboBox

						//ARTDSpellList.getSpells(castspell);

					}
				});

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
				
				Random rand = new Random();
				
				randomCombatChance = rand.nextInt(101);
				
				if(randomCombatChance <= 50)
				{
					myMenu.CombatMessageArea.append("Sorry,  You Didn't Escape!\n");
					 
					
				}else{
					myMenu.CombatMessageArea.append("You Escaped from the Battle!\n");
					
					
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e1) {
						
						e1.printStackTrace();
					}
					
					CombatFrame.dispose();
				}
				
			}});
		
		
		
		CombatFrame.setVisible(true);
		
		
		
	}
	
	
}
