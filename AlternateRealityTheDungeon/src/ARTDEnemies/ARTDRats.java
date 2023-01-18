package ARTDEnemies;

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

import AlternateRealityTheDungeon.ARTDCharecter;
import AlternateRealityTheDungeon.ARTDEnemies;
import AlternateRealityTheDungeon.ARTDSpells;

public class ARTDRats extends ARTDEnemies {
	
	public double sta;
	public double chr;
	public double str;
	public double inti;
	public double wis;
	public double agi;
	public double basedamage;
	public double HP;
	public double HeroHP;
	
	ARTDCharecter myChar = ARTDCharecter.Singleton();
	
	
	
	public ARTDRats()
	{

		double sta;
		double chr;
		double str;
		double inti;
		double wis;
		double agi;
		double basedamage;
		double HP =3;
	   // double HeroHP = myChar.CharInfo.indexOf(myChar.CharInfo.get(4));
		
		
	}
	
	public double attackdamage(double str, double basedamage)
	{
		
		double attackdamage = str + basedamage;
		
		return attackdamage;
	}
	
	public double defenseToDamage(double str, double agi)
	{
		
		double defenseToDamage = str+agi;
		
		return defenseToDamage;
	}
	
	public void RatsCombatEncouter() throws IOException
	{
		
		//Adding JFrame
		JFrame RatsFrame = new JFrame("You've encountered a Rat");
		
		//Adding JPanels
		JPanel RatsPanel = new JPanel(new BorderLayout());
		JPanel RatsPanelImage = new JPanel();     //Display Image of Enemy
		JPanel RatsPanelButtons = new JPanel(new FlowLayout()); // Display Buttons for Combat
		JPanel RatsPanelCombatArea = new JPanel(); //Display Combat Updates such as sucessful or not-successful attacks or HP lost
		JPanel RatsPanelCombatUpdateInfo = new JPanel(); // Your Stats
		JPanel RatsNameAndHPPanel = new JPanel();
		
		//Adding and Setting up JSplitPanes
		JSplitPane RatsImageAndCombatUpdatesStats = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		JSplitPane RatsCombatUpdatesAndStats = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		
		//Added JTextArea To display Combat outcomes
		JTextArea RatsCombatTextArea = new JTextArea();
		
		//Adding JTextField to Display Name and HP of Hero and Monster
		JTextArea RatsNameAndHPfield = new JTextArea();
		
		//Creating Buttons for Combat
		JButton RatsAttack = new JButton("Attack");
		JButton RatsSpell = new JButton("Select Spell to Cast");
		JButton RatsRun = new JButton("Run Away!");
		
		//Adding Parent JPanel to JFrame
		RatsFrame.add(RatsPanel, BorderLayout.CENTER);
		
		//Adding Image to JPanel
		BufferedImage myPicture = ImageIO.read(new File("src\\AlternateRealityTheDungeon\\Images\\GiantRat.jpg"));
		JLabel picLabel = new JLabel(new ImageIcon(myPicture));
	
		RatsPanelImage.add(picLabel);
		
		//Adding Panel for buttons to Master Panel
		RatsPanel.add(RatsPanelButtons, BorderLayout.SOUTH); // Place the "Attack", "Select Spell" and "Run Away" Buttons
			
		//Adding Child JPanels to Parent JPanel
		RatsPanel.add(RatsImageAndCombatUpdatesStats, BorderLayout.CENTER);
		
		//Adding Buttons to RatsPanelButtons JPanel		
		RatsPanelButtons.add(RatsAttack);
		RatsPanelButtons.add(RatsSpell);
		RatsPanelButtons.add(RatsRun);
				
		
		//added Jtextarea to JPanel used to Display Combat outcomes
		RatsPanelCombatArea.add(RatsCombatTextArea);
		RatsNameAndHPPanel.add(RatsNameAndHPfield);
		
		RatsImageAndCombatUpdatesStats.setLeftComponent(RatsPanelImage);
		RatsImageAndCombatUpdatesStats.setRightComponent(RatsCombatUpdatesAndStats);
		RatsCombatUpdatesAndStats.setTopComponent(RatsNameAndHPPanel);
		RatsCombatUpdatesAndStats.setBottomComponent(RatsPanelCombatUpdateInfo);
	
		RatsImageAndCombatUpdatesStats.setVisible(true);
		RatsCombatUpdatesAndStats.setVisible(true);
		RatsCombatUpdatesAndStats.setResizeWeight(.2d);
		RatsImageAndCombatUpdatesStats.setDividerLocation(0.5); //Places the Split in the middle of the pane
		RatsCombatUpdatesAndStats.setDividerLocation(0.25); //Sets the divider 3/4 of the way up the pane
		
		//Setting the JFrame to fill the screen
		Toolkit tk=Toolkit.getDefaultToolkit(); //Initializing the Toolkit class.
		Dimension screenSize = tk.getScreenSize(); //Get the Screen resolution of our device.
		
		//RatsNameAndHPfield.setLineWrap(true);
		RatsFrame.setSize(screenSize);
		RatsFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		RatsFrame.setLocationRelativeTo(null);
		RatsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		RatsFrame.setVisible(true);
		
		RatsNameAndHPfield.setText("Name:" + myChar.CharInfo.get(0)+"\t\tEnemy Name:" 
            	+"\nHP: "+ "\t\tEnemy HP: "+"5");
		
		ActionListener task = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	RatsNameAndHPfield.setText("Name:" + myChar.CharInfo.get(0)+"\t\tEnemy Name:" 
				+"\nHP: "+ "\t\tEnemy HP: "+"5");

 
            	
            	
            }
		};
		Timer timer = new Timer(100 ,task); // Execute task each 100 miliseconds
		timer.setRepeats(true);
		timer.start();
		
		
		//Attack Button in Combat
		RatsAttack.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(HP > 0 || HeroHP > 0)
				{
					
				}
				
			}});
		
		//Cast Spell Button in Combat
		RatsSpell.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JFrame spellsFrame = new JFrame();
				JButton RatsSpellCast = new JButton("Cast Selected Spell");
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
				spelllistbox.add(RatsSpellCast, BorderLayout.SOUTH);
				
				spellsFrame.setSize(400, 200);
				spellsFrame.setLocationRelativeTo(null);
				
				spellsFrame.setVisible(true);
				
				RatsSpellCast.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(null, "Add ability to cast spell in ARTDRats Class");
						
					}});
				
				
			}});
		
		RatsRun.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}});
		
	}
	

}
