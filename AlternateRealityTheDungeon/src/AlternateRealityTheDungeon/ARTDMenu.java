package AlternateRealityTheDungeon;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.Objects;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.Timer;
import javax.swing.WindowConstants;

/*
 * Games Menu Items
 * 
 */
public class ARTDMenu extends JFrame {

	private static final long serialVersionUID = 1L;
	ARTDCharecter myChar = ARTDCharecter.Singleton();
	ARDTGameSettings myPreferences = new ARDTGameSettings();
	//ARTDCombat myCombat = new ARTDCombat();
	ARTDLoadSaveGame mygamestate = new ARTDLoadSaveGame();
	ARTDGameMenuItems myGameMenuItems = new ARTDGameMenuItems();
	
	
	JFrame artdmenuframe = null;
	JPanel p1, p2, p3, p4, GameImagesAndCombat = null;
	JTextArea CombatMessageArea;
	JTextField CharNameClassLevel, CharStats, CharXPHPGold = null;
	JMenuBar menuBar = null;
	JMenu gameMenu, charecterMenu, settingsMenu, helpMenu = null;
	JMenuItem newGameMenuItem, LoadSavedGameMenuItem, saveMenuItem,
				exitGameMenuItem,charecterstatsMenuItem,
				charecterinventoryMenuItem, mapMenu, gameSettingsMenuItem,
				aboutMenuItem, helpMenuItem, mapFloor1MenuItem, mapFloor2MenuItem,
				mapFloor3MenuItem, mapFloor4MenuItem = null;
	JLabel picLabel = null;
	JSplitPane PicturesAndTextUpdates = null;
	
	Dimension screenSize = null;
	int width, height = 0;
	Timer timer = null;
	

	ARTDMenu() throws IOException {

		//Creating Frame
		artdmenuframe = new JFrame("Alternate Reality: The Dungeon");
		
		//Adding Frame Preferences and Settings
		artdmenuframe.setLayout(new BorderLayout());
		artdmenuframe.setForeground(myPreferences.colorBrown);
		artdmenuframe.setUndecorated(true);
		artdmenuframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	
		
		// getScreenSize() returns the size
        // of the screen in pixels
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        
        // width will store the width of the screen
        width = (int)size.getWidth();
        
        // height will store the height of the screen
        height = (int)size.getHeight();
            
        artdmenuframe.pack();
        artdmenuframe.setSize(width, height);


		p1 = new JPanel(new BorderLayout());
		p2 = new JPanel(new BorderLayout());
		p3 = new JPanel(new BorderLayout());
		p4 = new JPanel(new BorderLayout());
		GameImagesAndCombat = new JPanel(new BorderLayout());

		try {
			mygamestate.StartGameLoadCharecter();
		} catch (IOException e2) {

			e2.printStackTrace();
		}

		//*********************************************************
		// -----------  Fields at top of the screen displaying
		//------------ Name and Stats for toon
		//***********************************************************
		
		CharNameClassLevel = new JTextField();
		CharNameClassLevel.setFont(myPreferences.fontTimesNewRoman);
		CharNameClassLevel.setBackground(myPreferences.colorLightBrown);
		CharNameClassLevel.setEditable(false);
		CharNameClassLevel.setColumns(4);

		CharStats = new JTextField();
		CharStats.setFont(myPreferences.fontTimesNewRoman);
		CharStats.setBackground(myPreferences.colorLightYellow);
		CharStats.setEditable(false);		

		CharXPHPGold = new JTextField();
		CharXPHPGold.setFont(myPreferences.fontTimesNewRoman);
		CharXPHPGold.setEditable(false);
		CharXPHPGold.setBackground(myPreferences.colorLightBrown);
		

		ActionListener task = new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				
				 CharNameClassLevel.setText("Name: " + myChar.CharInfo.get(0) +"\t\t" + "Class: " +
						 					myChar.CharInfo.get(1)+"\t\t" + "Level: " + myChar.CharInfo.get(2) + "\t\t" +"Experience: " +
						 					myChar.CharInfo.get(3));
				
				

				CharStats.setText("Stamina: " + myChar.CharInfo.get(5) + "\t\t" + "Charisma: " + myChar.CharInfo.get(6)
						+ "\t\t" + "Strength: " + myChar.CharInfo.get(7) + "\t\t" + "Intelligence: "
						+ myChar.CharInfo.get(8) + "\t\t" + "Wisdom: " + myChar.CharInfo.get(9) + "\t\t" + "Agility: "
						+ myChar.CharInfo.get(10));

				CharXPHPGold.setText("Hit Points: " + myChar.CharInfo.get(4) + "\t\t" + "Gold: "
						+ myChar.CharInfo.get(11) + "\t\t" + "Gems: " + myChar.CharInfo.get(12));
			}
		};
		timer = new Timer(100, task); // Execute task each 100 miliseconds
		timer.setRepeats(true);
		timer.start();

		// ****************************************************************************************
		// ----------------------------Menu Bar and Menu Items------------------------------------
		// ****************************************************************************************

		// Create the menu bar.
		menuBar = new JMenuBar();
		
		//Menu Bar Preferences
		
		menuBar.setPreferredSize(new Dimension(25,35));
		menuBar.setFont(new Font("sans-serif", Font.PLAIN, 14));
		menuBar.setBackground(myPreferences.colorDarkKhaki);
		
		picLabel = new JLabel(new ImageIcon(myPreferences.myJMenuBarPicture));
		picLabel.setSize(25, 25);
		menuBar.add(picLabel);
		
		// Build the menu.
		artdmenuframe.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
		// *************************************************************
		// ------------------- Adding Menu Headers -----------------------------
		// *************************************************************

		gameMenu = new JMenu("Game");
		gameMenu.setMnemonic(KeyEvent.VK_G);

		charecterMenu = new JMenu("Charecter");
		charecterMenu.setMnemonic(KeyEvent.VK_C);

		settingsMenu = new JMenu("Preferences");
		settingsMenu.setMnemonic(KeyEvent.VK_P);

		helpMenu = new JMenu("About");
		helpMenu.setMnemonic(KeyEvent.VK_H);

		// ****************************************************************************************
		// ----------------------------Adding Menu Items-------------------------------------------
		// ****************************************************************************************
		// ****************************************************************************************
		// ----------------------------Load, Save and Exit------------------------------------
		// ****************************************************************************************

		newGameMenuItem = new JMenuItem("New Game");
		newGameMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_MASK));
		newGameMenuItem.getAccessibleContext().setAccessibleDescription("New Game");
		newGameMenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				int result = JOptionPane.showConfirmDialog(artdmenuframe,
						"Are you sure you wish to delete your current game and start a new one?", "Start New Game?",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (result == JOptionPane.YES_OPTION) {
					artdmenuframe.dispose();
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

					artdmenuframe.dispose();

				} else if (result == JOptionPane.NO_OPTION) {

				} else {

				}

			}
		});

		// ***************************************************************************
		// ----------------------------- Loading a Previously Saved Game--------------
		// ***************************************************************************

		LoadSavedGameMenuItem = new JMenuItem("Load Saved Game");
		LoadSavedGameMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, KeyEvent.CTRL_MASK));
		LoadSavedGameMenuItem.getAccessibleContext().setAccessibleDescription("Load Saved Game");
		LoadSavedGameMenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				mygamestate.LoadGame();

			}
		});

		// ***************************************************************************
		// ----------------------------- Saving Your Game ----------------------------
		// ***************************************************************************

		saveMenuItem = new JMenuItem("Save Current Game");
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

		// ***************************************************************************
		// ----------------------------- Exiting Your Game ---------------------------
		// ***************************************************************************

		exitGameMenuItem = new JMenuItem("Exit");
		exitGameMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, KeyEvent.CTRL_MASK));
		exitGameMenuItem.getAccessibleContext().setAccessibleDescription("Exit Game");
		exitGameMenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});

		// ****************************************************************************************
		// ----------------------------Stats, Inventory and
		// Maps------------------------------------
		// ****************************************************************************************

		charecterstatsMenuItem = new JMenuItem("Stats");
		charecterstatsMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, KeyEvent.CTRL_MASK));
		charecterstatsMenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				myGameMenuItems.Stats();

			}
		});

		charecterinventoryMenuItem = new JMenuItem("Inventory");
		charecterinventoryMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, KeyEvent.CTRL_MASK));
		charecterinventoryMenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				myGameMenuItems.Inventory();

			}
		});

		mapMenu = new JMenu("Map");
		mapMenu.setMnemonic(KeyEvent.VK_M);

		// ****************************************************************************************
		// ----------------------------Settings and
		// Preferences------------------------------------
		// ****************************************************************************************

		gameSettingsMenuItem = new JMenuItem("Settings");
		gameSettingsMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, KeyEvent.CTRL_MASK));
		gameSettingsMenuItem.getAccessibleContext().setAccessibleDescription("Game Settings");
		gameSettingsMenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// Settings Such as
				// Auto Save Timer
				// Set Brightness
				// Set Resolution
				// Set Colors
				// Set Volume

				System.out.print("Settings and Preferences");

			}
		});

		// ****************************************************************************************
		// ---------------------------- Help and About -------------------------------------------
		// ****************************************************************************************

		// Help and About Menu Items -- About the Game and any Help Information
		aboutMenuItem = new JMenuItem("About");
		aboutMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, KeyEvent.CTRL_MASK));
		aboutMenuItem.getAccessibleContext().setAccessibleDescription("About Game");
		aboutMenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
/*
				try {
					myCombat.CombatEncouter();
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
*/
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

		helpMenuItem = new JMenuItem("Help");
		helpMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, KeyEvent.CTRL_MASK));
		helpMenuItem.getAccessibleContext().setAccessibleDescription("Help");
		helpMenuItem.addActionListener(new ActionListener() {

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

				// frame.setLocationRelativeTo(null);
				frame.pack();
				frame.setVisible(true);

			}
		});

		// **********************************************************
		// ---------- Adding Menu Items to the Menu Selections-------
		// **********************************************************

		gameMenu.add(newGameMenuItem);
		gameMenu.add(LoadSavedGameMenuItem);
		gameMenu.add(saveMenuItem);
		gameMenu.add(exitGameMenuItem);

		charecterMenu.add(charecterstatsMenuItem);
		charecterMenu.add(charecterinventoryMenuItem);
		charecterMenu.add(mapMenu);

		settingsMenu.add(gameSettingsMenuItem);

		helpMenu.add(aboutMenuItem);
		helpMenu.add(helpMenuItem);

		// **************************************************************
		// ---------- Adding Menu Selection Items to the Menu bar--------
		// **************************************************************
		menuBar.add(gameMenu);
		menuBar.add(charecterMenu);
		menuBar.add(settingsMenu);
		menuBar.add(helpMenu);

		// ***************************************************************
		// --------------------- Map Sub Menu Items----------------------
		// **************************************************************

		mapFloor1MenuItem = new JMenuItem("Floor 1");
		mapFloor1MenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, KeyEvent.CTRL_MASK));
		mapFloor1MenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		mapFloor2MenuItem = new JMenuItem("Floor 2");
		mapFloor2MenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, KeyEvent.CTRL_MASK));
		mapFloor2MenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		mapFloor3MenuItem = new JMenuItem("Floor 3");
		mapFloor3MenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_3, KeyEvent.CTRL_MASK));
		mapFloor3MenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		mapFloor4MenuItem = new JMenuItem("Floor 4");
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
		
		// **************************************************************************************
		// ----------------------------Setting Up JSplitPane ------------------------------------
		// *************************************************************************************
				
		JTextArea messagearea = new JTextArea("JTextArea AMessageArea - Video and Pictures");
		CombatMessageArea= new JTextArea("JTextArea AMessageArea - Game Updates"); 
		
		PicturesAndTextUpdates = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		PicturesAndTextUpdates.setVisible(true);
		PicturesAndTextUpdates.setResizeWeight(.90d);
		PicturesAndTextUpdates.setLeftComponent(GameImagesAndCombat);
		PicturesAndTextUpdates.setRightComponent(CombatMessageArea);
		PicturesAndTextUpdates.setVisible(true);
				
		
		// ****************************************************************
		// ----------------------------Adding Menu Bar to the JFrame ------
		// ****************************************************************
		artdmenuframe.setJMenuBar(menuBar);

		// ***************************************************************
		// -------------------Setting Up Menubar and JFrame --------------
		// ****************************************************************

		
		
		artdmenuframe.add(PicturesAndTextUpdates, BorderLayout.CENTER);
		artdmenuframe.add(p1, BorderLayout.NORTH);
		p1.add(p2, BorderLayout.NORTH);
		p1.add(p3, BorderLayout.CENTER);
		p1.add(p4, BorderLayout.SOUTH);
		p2.add(CharNameClassLevel);
		p3.add(CharStats);
		p4.add(CharXPHPGold);
		GameImagesAndCombat.add(messagearea);
	

		artdmenuframe.setVisible(true);
	}

}
