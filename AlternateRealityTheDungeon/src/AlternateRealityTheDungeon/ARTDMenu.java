package AlternateRealityTheDungeon;

import java.awt.BorderLayout;
import java.awt.Dimension;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;

import java.util.Objects;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.Timer;
import javax.swing.WindowConstants;

import ARTDEnemies.ARTDRats;


public class ARTDMenu extends JPanel {

	private static final long serialVersionUID = 1L;
	ARTDCharecter myChar = ARTDCharecter.Singleton();
	ARDTGamePreferences myPreferences = new ARDTGamePreferences();


	public ARTDMenu() {

		JFrame frame = new JFrame("Alternate Reality: The Dungeon");
		frame.setLayout(new BorderLayout());
		
		frame.setForeground(myPreferences.colorBrown);

	    Font font = new Font("Times New Roman", Font.BOLD, 20);
	    Dimension windowSize = frame.getMaximumSize();
		frame.setSize(windowSize);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		ARTDLoadSaveGame mygamestate = new ARTDLoadSaveGame();
		ARTDGameMenuItems myGameMenuItems = new ARTDGameMenuItems();
		
		JPanel p1 = new JPanel(new BorderLayout());
		JPanel p2 = new JPanel(new BorderLayout());
		JPanel p3 = new JPanel(new BorderLayout());
		JPanel p4 = new JPanel(new BorderLayout());

		try {
			mygamestate.StartGameLoadCharecter();
		} catch (IOException e2) {
			
			e2.printStackTrace();
		}
		
//		toonstats.append("\nSTAMINA: \t\t" + stat[0]);
//		toonstats.append("\nCHARISMA: \t\t" + stat[1]);
//		toonstats.append("\nSTRENGTH: \t\t" + stat[2]);
//		toonstats.append("\nINTELLIGENCE: \t" + stat[3]);
//		toonstats.append("\nWISDOM: \t\t" + stat[4]);
//		toonstats.append("\nAGILITY: \t\t" + stat[5]);
		
		// CharInfo[0] = Charecter Name
		// CharInfo[1] = Class
		// CharInfo[2] = Level
		// CharInfo[3] = Experience
		// CharInfo[4] = Hit Points
		// CharInfo[5] = Stat: Stamina
		// CharInfo[6] = Stat: Charisma
		// CharInfo[7] = Stat: Strength
		// CharInfo[8] = Stat: Intelligence
		// CharInfo[9] = Stat: Wisdom
		// CharInfo[10] = Stat: Agility
		// CharInfo[11] = Gold
		// CharInfo[12] = Food
		// CharInfo[13] = Water
		// CharInfo[14] = Torches
		// CharInfo[15] = Gems
		
		
		
		JTextField CharNameClassLevel = new JTextField();
		CharNameClassLevel.setFont(font);
		CharNameClassLevel.setBackground(myPreferences.colorLightBrown);
		CharNameClassLevel.setEditable(false);

		
		JTextField CharStats = new JTextField();
		CharStats.setFont(font);
		CharStats.setBackground(myPreferences.colorLightYellow);
		CharStats.setEditable(false);

		
		JTextField CharXPHPGold = new JTextField();
		CharXPHPGold.setFont(font);
		CharXPHPGold.setEditable(false);
		CharXPHPGold.setBackground(myPreferences.colorLightBrown);
		
		
		
		
		ActionListener task = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	CharNameClassLevel.setText("Name: " + myChar.CharInfo.get(0)+"\t\t" + "Class: "+ myChar.CharInfo.get(1) + "\t\t"+" Level: " + myChar.CharInfo.get(2)
            	+ "\t\t" + "Experience: " + myChar.CharInfo.get(3));
        		
            	
            	CharStats.setText("Stamina: " + myChar.CharInfo.get(5) + "\t\t"+ "Charisma: " + myChar.CharInfo.get(6)
            	+ "\t\t"+"Strength: " +myChar.CharInfo.get(7) + "\t\t"+ "Intelligence: " + myChar.CharInfo.get(8) 
        		+ "\t\t"+ "Wisdom: "+ myChar.CharInfo.get(9) + "\t\t"+"Agility: " + myChar.CharInfo.get(10));
        		
            	CharXPHPGold.setText("Hit Points: " + myChar.CharInfo.get(4) + "\t\t" + "Gold: " + myChar.CharInfo.get(11) +"\t\t"+ "Gems: " + myChar.CharInfo.get(12));
            }
		};
		Timer timer = new Timer(100 ,task); // Execute task each 100 miliseconds
		timer.setRepeats(true);
		timer.start();
		
		//Text Area at the bottom of the play window
	    JTextArea messagearea = new JTextArea(); 
	    messagearea.setLineWrap(true);
	    messagearea.setWrapStyleWord(true);
	    messagearea.setEditable(false);
        messagearea.setFont(font);	    

	    
		



		// Create the menu bar.
		JMenuBar menuBar = new JMenuBar();

		// Build the menu.
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});

		JMenu gameMenu = new JMenu("Game");
		gameMenu.setMnemonic(KeyEvent.VK_G);
		
		
		JMenu charecterMenu = new JMenu("Charecter");
		charecterMenu.setMnemonic(KeyEvent.VK_C);
		
		
		JMenu helpMenu = new JMenu("About");
		helpMenu.setMnemonic(KeyEvent.VK_H);

		///////////////////////// create groups of menu
		///////////////////////// items/////////////////////////////////////
		JMenuItem newGameMenuItem = new JMenuItem("New Game");
		newGameMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_MASK));
		newGameMenuItem.getAccessibleContext().setAccessibleDescription("New Game");
		newGameMenuItem.addActionListener(new ActionListener() {

			
			
			@Override
			public void actionPerformed(ActionEvent e) {

			
				
				int result = JOptionPane.showConfirmDialog(frame,
						"Are you sure you wish to delete your current game and start a new one?", "Start New Game?",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (result == JOptionPane.YES_OPTION) {
					frame.dispose();
					try {
						BufferedWriter writer = Files.newBufferedWriter(Paths
								.get("src//AlternateRealityTheDungeon//TextFiles//SaveGame//InitialCharecterSave.txt"));
						writer.write("");
						writer.flush();
					} catch (IOException e1) {

						e1.printStackTrace();
					}

					File d = new File("src//AlternateRealityTheDungeon//TextFiles//SaveGame//");

					for (File file : d.listFiles())
						if (!file.isDirectory())
							file.delete();


					try {


						ARTDMain.main(null);


					} catch (IOException | InterruptedException e1) {

						e1.printStackTrace();
					}

					frame.dispose();

				} else if (result == JOptionPane.NO_OPTION) {

				} else {

				}

			}
		});

		JMenuItem LoadSavedGameMenuItem = new JMenuItem("Load Saved Game");
		LoadSavedGameMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, KeyEvent.CTRL_MASK));
		LoadSavedGameMenuItem.getAccessibleContext().setAccessibleDescription("Load Saved Game");
		LoadSavedGameMenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				
				mygamestate.LoadGame();


			}
		});

		JMenuItem saveMenuItem = new JMenuItem("Save Current Game");
		saveMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_MASK));
		saveMenuItem.getAccessibleContext().setAccessibleDescription("Save Current Game");
		saveMenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {

					
					mygamestate.SaveGame();
				} catch (IOException | ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		JMenuItem exitGameMenuItem = new JMenuItem("Exit");
		exitGameMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, KeyEvent.CTRL_MASK));
		exitGameMenuItem.getAccessibleContext().setAccessibleDescription("Exit Game");
		exitGameMenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});

		///////////////////////// Charecter Menu Group ////////////////////////////

		JMenuItem charecterstatsMenuItem = new JMenuItem("Stats");
		charecterstatsMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, KeyEvent.CTRL_MASK));
		charecterstatsMenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				myGameMenuItems.Stats();

			}
		});

		JMenuItem charecterinventoryMenuItem = new JMenuItem("Inventory");
		charecterinventoryMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, KeyEvent.CTRL_MASK));
		charecterinventoryMenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				myGameMenuItems.Inventory();

			}
		});

		JMenuItem mapMenu = new JMenu("Map");
		mapMenu.setMnemonic(KeyEvent.VK_M);

		// Help and About Menu Items -- About the Game and any Help Information
		JMenuItem aboutMenuItem = new JMenuItem("About");
		aboutMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, KeyEvent.CTRL_MASK));
		aboutMenuItem.getAccessibleContext().setAccessibleDescription("About Game");
		aboutMenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				JFrame frame = new JFrame("Help Information");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

				JPanel p = new JPanel(new BorderLayout());

				JButton helpbutton = new JButton("Click to Close");
				helpbutton.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						frame.dispose();

					}

				});

				JTextArea helptext = new JTextArea(50, 150);
				helptext.setLineWrap(true);
				helptext.setWrapStyleWord(true);
				JScrollPane scrollPane = new JScrollPane(helptext);
				scrollPane.setSize(120, 120);

				try {
					// Read some text from the resource file to display in
					// the JTextArea.
					helptext.read(
							new InputStreamReader(Objects.requireNonNull(
									getClass().getResourceAsStream("/AlternateRealityTheDungeon/TextFiles/About.txt"))),
							null);
				} catch (IOException e1) {
					e1.printStackTrace();
				}

				frame.add(p);
				frame.getContentPane().add(new JScrollPane(helptext), BorderLayout.NORTH);
				frame.setSize(120, 120);

				p.add(helpbutton, BorderLayout.SOUTH);
				helpbutton.setSize(120, 120);

				frame.pack();
				frame.setVisible(true);

			}
		});

		JMenuItem helpMenuItem = new JMenuItem("Help");
		helpMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, KeyEvent.CTRL_MASK));
		helpMenuItem.getAccessibleContext().setAccessibleDescription("Help");
		helpMenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				ARTDRats myRats = new ARTDRats();
				myRats.RatsCombatEncouter();
				
				
				JFrame frame = new JFrame("Help Information");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

				JPanel p = new JPanel(new BorderLayout());

				JButton helpbutton = new JButton("Click to Close");
				helpbutton.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						frame.dispose();

					}

				});

				JTextArea helptext = new JTextArea(50, 150);
				helptext.setLineWrap(true);
				helptext.setWrapStyleWord(true);


				try {
					// Read some text from the resource file to display in
					// the JTextArea.
					helptext.read(
							new InputStreamReader(Objects.requireNonNull(
									getClass().getResourceAsStream("/AlternateRealityTheDungeon/TextFiles/Help.txt"))),
							null);
				} catch (IOException e1) {
					e1.printStackTrace();
				}

				frame.add(p);
				frame.getContentPane().add(new JScrollPane(helptext), BorderLayout.NORTH);
				frame.setSize(120, 120);

				p.add(helpbutton, BorderLayout.SOUTH);
				helpbutton.setSize(120, 120);

			//	frame.setLocationRelativeTo(null);
				frame.pack();
				frame.setVisible(true);

			}
		});

		// add menu items to menus
		gameMenu.add(newGameMenuItem);
		gameMenu.add(LoadSavedGameMenuItem);
		gameMenu.add(saveMenuItem);
		gameMenu.add(exitGameMenuItem);

		charecterMenu.add(charecterstatsMenuItem);
		charecterMenu.add(charecterinventoryMenuItem);
		charecterMenu.add(mapMenu);

		helpMenu.add(aboutMenuItem);
		helpMenu.add(helpMenuItem);

		// add menu to menubar
		menuBar.add(gameMenu);
		menuBar.add(charecterMenu);
		menuBar.add(helpMenu);

		JMenuItem mapFloor1MenuItem = new JMenuItem("Floor 1");
		mapFloor1MenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, KeyEvent.CTRL_MASK));
		mapFloor1MenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		JMenuItem mapFloor2MenuItem = new JMenuItem("Floor 2");
		mapFloor2MenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, KeyEvent.CTRL_MASK));
		mapFloor2MenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		JMenuItem mapFloor3MenuItem = new JMenuItem("Floor 3");
		mapFloor3MenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_3, KeyEvent.CTRL_MASK));
		mapFloor3MenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		JMenuItem mapFloor4MenuItem = new JMenuItem("Floor 4");
		mapFloor4MenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_4, KeyEvent.CTRL_MASK));
		mapFloor4MenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		mapMenu.add(mapFloor1MenuItem);
		mapMenu.add(mapFloor2MenuItem);
		mapMenu.add(mapFloor3MenuItem);
		mapMenu.add(mapFloor4MenuItem);

		// add menubar to the frame
		frame.setJMenuBar(menuBar);

		// Size and Location for Window

		// Add Menubar and Display JFrame

		frame.setJMenuBar(menuBar);

		frame.add(p1, BorderLayout.NORTH);
		p1.add(p2, BorderLayout.NORTH);
		p1.add(p3, BorderLayout.CENTER);
		p1.add(p4, BorderLayout.SOUTH);
		p2.add(CharNameClassLevel);
		p3.add(CharStats);
		p4.add(CharXPHPGold);
		
//		frame.add(CharNameClassLevel, BorderLayout.NORTH);
//		frame.add(CharStats, BorderLayout.NORTH);
//		frame.add(CharXPHPGold, BorderLayout.NORTH);

		frame.add(messagearea, BorderLayout.SOUTH);
		
		
		frame.setVisible(true);
	}

}
