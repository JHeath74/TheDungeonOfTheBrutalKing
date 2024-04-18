
package DungeonoftheBrutalKing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.ArrayList;
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

import GameEngine.Camera;
import GameEngine.Screen;
import GameEngine.Texture;

/*
 * Games Menu Items
 *
 */
public class MainGameScreen extends JFrame implements Runnable {


	private static final long serialVersionUID = 1L;
	Charecter myChar = Charecter.Singleton();
	GameSettings myGameSettings = new GameSettings();
	LoadSaveGame myGameState = new LoadSaveGame();
	GameMenuItems myGameMenuItems = new GameMenuItems();



	JFrame MainGameScreenFrame = null;
	JPanel p1Panel, p2Panel, p3Panel, p4Panel, GameImagesAndCombatPanel = null;
	JTextArea MessageTextArea = null;
	JTextField CharNameClassLevelField, CharStatsField, CharStats2Field, CharXPHPGoldField = null;
	JMenuBar menuBar = null;
	JMenu gameMenu, charecterMenu, settingsMenu, helpMenu = null;
	JMenuItem newGameMenuItem, LoadSavedGameMenuItem, saveMenuItem,
				exitGameMenuItem,charecterstatsMenuItem,
				charecterinventoryMenuItem, mapMenu, gameSettingsMenuItem,
				aboutMenuItem, helpMenuItem, mapFloor1MenuItem, mapFloor2MenuItem,
				mapFloor3MenuItem, mapFloor4MenuItem = null;
	JLabel menuBarImageLabel, startingImageLabel = null;
	JSplitPane PicturesAndTextUpdatesPane = null;

	Dimension screenSize = null;
	int width, height = 0;
	Timer timer = null;
	
	//---------------------Game Engine ------------------------------------------------
	public int mapWidth = 15;
	public int mapHeight = 15;
	private Thread thread;
	private boolean running;
	private BufferedImage image;
	public int[] pixels;
	public ArrayList<Texture> textures;
	public Camera camera;
	public Screen screen;
	public static int[][] map = 
		{
			{1,1,1,1,1,1,1,1,2,2,2,2,2,2,2},
			{1,0,0,0,0,0,0,0,2,0,0,0,0,0,2},
			{1,0,3,3,3,3,3,0,0,0,0,0,0,0,2},
			{1,0,3,0,0,0,3,0,2,0,0,0,0,0,2},
			{1,0,3,0,0,0,3,0,2,2,2,0,2,2,2},
			{1,0,3,0,0,0,3,0,2,0,0,0,0,0,2},
			{1,0,3,3,0,3,3,0,2,0,0,0,0,0,2},
			{1,0,0,0,0,0,0,0,2,0,0,0,0,0,2},
			{1,1,1,1,1,1,1,1,4,4,4,0,4,4,4},
			{1,0,0,0,0,0,1,4,0,0,0,0,0,0,4},
			{1,0,0,0,0,0,1,4,0,0,0,0,0,0,4},
			{1,0,0,0,0,0,1,4,0,3,3,3,3,0,4},
			{1,0,0,0,0,0,1,4,0,3,3,3,3,0,4},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,4},
			{1,1,1,1,1,1,1,4,4,4,4,4,4,4,4}
		};
//-----------------------------------------------------------------------------

	
	
	public MainGameScreen() throws IOException {

		
		 
		
		//Creating Frame
		MainGameScreenFrame = new JFrame("Dungeon of the Brutal King");


		//Adding Frame Preferences and Settings
		MainGameScreenFrame.setLayout(new BorderLayout());
		MainGameScreenFrame.setForeground(myGameSettings.colorBrown);
		MainGameScreenFrame.setUndecorated(true);
		MainGameScreenFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		//Adding JPanels
		
	//	startingImageLabel = new JLabel();
		p1Panel = new JPanel(new BorderLayout());
		p2Panel = new JPanel(new BorderLayout());
		p3Panel = new JPanel(new BorderLayout());
		p4Panel = new JPanel(new BorderLayout());
		GameImagesAndCombatPanel = new JPanel(new BorderLayout());
		
//		startingImageLabel = new JLabel(new ImageIcon(image));
//		startingImageLabel = new JLabel(new ImageIcon(myGameSettings.StoryIntroductionPath + "Starting_Image.png"));
//		GameImagesAndCombatPanel.add(startingImageLabel);
		
		thread = new Thread();

		image = new BufferedImage(1200, 800, BufferedImage.TYPE_INT_RGB);

		pixels = ((DataBufferInt)image.getRaster().getDataBuffer()).getData();
		textures = new ArrayList<Texture>();
		textures.add(Texture.wood);
		textures.add(Texture.brick);
		textures.add(Texture.bluestone);
		textures.add(Texture.stone);
		camera = new Camera(4.5, 4.5, 1, 0, 0, -.66);
		screen = new Screen(map, mapWidth, mapHeight, textures, 640, 480);
		addKeyListener(camera);
		start(); //Remove The Word Thread
		
		// getScreenSize() returns the size
        // of the screen in pixels
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();

        // width will store the width of the screen
        width = (int)size.getWidth();

        // height will store the height of the screen
        height = (int)size.getHeight();

        MainGameScreenFrame.setSize(width, height);

     //   MainGameScreenFrame.getContentPane().add(new JLabel(new ImageIcon(image))); // Display a blank screen on the main game window
        
		

		try {
			myGameState.StartGameLoadCharecter();
		} catch (IOException e2) {

			e2.printStackTrace();
		}

		//*********************************************************
		// -----------  Fields at top of the screen displaying
		//------------ Name and Stats for toon
		//***********************************************************

		CharNameClassLevelField = new JTextField();
		CharNameClassLevelField.setFont(myGameSettings.fontTimesNewRoman);
		CharNameClassLevelField.setBackground(myGameSettings.colorGreen);
		CharNameClassLevelField.setForeground(myGameSettings.colorWhite);
		CharNameClassLevelField.setColumns(3);
		CharNameClassLevelField.setEditable(false);


		CharStatsField = new JTextField();
		CharStatsField.setLayout(new FlowLayout());
		CharStatsField.setFont(myGameSettings.fontTimesNewRoman);
		CharStatsField.setBackground(myGameSettings.colorBlue);
		CharStatsField.setForeground(myGameSettings.colorWhite);
		CharStatsField.setEditable(false);

		CharStats2Field = new JTextField();
		CharStats2Field.setLayout(new FlowLayout());
		CharStats2Field.setFont(myGameSettings.fontTimesNewRoman);
		CharStats2Field.setBackground(myGameSettings.colorBlue);
		CharStats2Field.setForeground(myGameSettings.colorWhite);
		CharStats2Field.setEditable(false);


		CharXPHPGoldField = new JTextField();
		CharXPHPGoldField.setLayout(getLayout());
		CharXPHPGoldField.setFont(myGameSettings.fontTimesNewRoman);
		CharXPHPGoldField.setBackground(myGameSettings.colorPurple);
		CharXPHPGoldField.setForeground(myGameSettings.colorWhite);
		CharXPHPGoldField.setColumns(3);
		CharXPHPGoldField.setEditable(false);


		ActionListener task = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {

				 CharNameClassLevelField.setText("Name: " + myChar.CharInfo.get(0) + "\t\t"
						 					+ "Level: " + myChar.CharInfo.get(2) + "\t\t"
						 					+ "Experience: " + myChar.CharInfo.get(3));



				CharStatsField.setText("Stamina:\t"
								+ "Charisma: \t"
								+ "Strength: \t"
								+ "Intelligence:\t "
								+ "Wisdom: \t"
								+ "Agility: \t");

				CharStats2Field.setText(myChar.CharInfo.get(5) + "\t" +
								   myChar.CharInfo.get(6) + "\t" +
								   myChar.CharInfo.get(7) + "\t" +
								   myChar.CharInfo.get(8) + "\t" +
								   myChar.CharInfo.get(9) + "\t" +
								   myChar.CharInfo.get(10));


				CharXPHPGoldField.setText("Hit Points: " + myChar.CharInfo.get(4) + "\t\t"
									+ "Gold: " + myChar.CharInfo.get(11) + "\t\t"
									+ "Gems: " + myChar.CharInfo.get(12) + "\t\t"
									+ "Dungeon Level:");
			}
		};
		timer = new Timer(100, task); // Execute task to display stats each 100 miliseconds
		timer.setRepeats(true);
		timer.start();
		
		
	

		// ****************************************************************************************
		// ----------------------------Menu Bar and Menu Items------------------------------------
		// ****************************************************************************************

		// Create the menu bar.
		menuBar = new JMenuBar();
		
		// ****************************************************************
		// ----------------------------Adding Menu Bar to the JFrame ------
		// ****************************************************************
		
		MainGameScreenFrame.setJMenuBar(menuBar);
		
		//Menu Bar Preferences

		menuBar.setPreferredSize(new Dimension(25,35));
		menuBar.setFont(new Font("sans-serif", Font.ROMAN_BASELINE, 22));
		menuBar.setBackground(myGameSettings.colorPlum);

		menuBarImageLabel = new JLabel(new ImageIcon(myGameSettings.myJMenuBarPicture));
		menuBarImageLabel.setSize(25, 25);
		menuBar.add(menuBarImageLabel);

		// Build the menu.
		MainGameScreenFrame.addWindowListener(new WindowAdapter() {
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
		newGameMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
		newGameMenuItem.getAccessibleContext().setAccessibleDescription("New Game");
		newGameMenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				int result = JOptionPane.showConfirmDialog(MainGameScreenFrame,
						"Are you sure you wish to delete your current game and start a new one?", "Start New Game?",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (result == JOptionPane.YES_OPTION) {
					MainGameScreenFrame.dispose();
					try {
						BufferedWriter writer = Files.newBufferedWriter(Paths
								.get("src//AlternateRealityTheDungeon//TextFiles//SaveGame//InitialCharecterSave.txt"));
						writer.write("");
						writer.flush();
						writer.close();// Is this located correctly.
					} catch (IOException e1) {

						e1.printStackTrace();
					}

					File d = new File(GameSettings.SavedGameDirectory);

					for (File file : d.listFiles()) {
						if (!file.isDirectory()) {
							file.delete();
						}
					}

					try {

						CharacterCreation.CharacterCreation();

					} catch (IOException | InterruptedException e1) {

						e1.printStackTrace();
					}

					MainGameScreenFrame.dispose();

				} else if (result == JOptionPane.NO_OPTION) {

				} else {

				}

			}
		});

		// ***************************************************************************
		// ----------------------------- Loading a Previously Saved Game--------------
		// ***************************************************************************

		LoadSavedGameMenuItem = new JMenuItem("Load Saved Game");
		LoadSavedGameMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, InputEvent.CTRL_MASK));
		LoadSavedGameMenuItem.getAccessibleContext().setAccessibleDescription("Load Saved Game");
		LoadSavedGameMenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				myGameState.LoadGame();

			}
		});

		// ***************************************************************************
		// ----------------------------- Saving Your Game ----------------------------
		// ***************************************************************************

		saveMenuItem = new JMenuItem("Save Current Game");
		saveMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		saveMenuItem.getAccessibleContext().setAccessibleDescription("Save Current Game");
		saveMenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {

					myGameState.SaveGame();
				} catch (IOException | ParseException e1) {

					e1.printStackTrace();
				}
			}
		});

		// ***************************************************************************
		// ----------------------------- Exiting Your Game ---------------------------
		// ***************************************************************************

		exitGameMenuItem = new JMenuItem("Exit");
		exitGameMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_MASK));
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
		charecterstatsMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, InputEvent.CTRL_MASK));
		charecterstatsMenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				myGameMenuItems.Stats();

			}
		});

		charecterinventoryMenuItem = new JMenuItem("Inventory");
		charecterinventoryMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, InputEvent.CTRL_MASK));
		charecterinventoryMenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				myGameMenuItems.Inventory();

			}
		});

		mapMenu = new JMenu("Map");
		mapMenu.setMnemonic(KeyEvent.VK_M);

		// ****************************************************************************************
		// ----------------------------Settings and Preferences------------------------------------
		// ****************************************************************************************

		gameSettingsMenuItem = new JMenuItem("Settings");
		gameSettingsMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, InputEvent.CTRL_MASK));
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
		aboutMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_MASK));
		aboutMenuItem.getAccessibleContext().setAccessibleDescription("About Game");
		aboutMenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				JFrame frame = new JFrame("Help Information");
				frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

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
									getClass().getResourceAsStream("/DungeonoftheBrutalKing/TextFiles/About.txt"))),
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
		helpMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, InputEvent.CTRL_MASK));
		helpMenuItem.getAccessibleContext().setAccessibleDescription("Help");
		helpMenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				JFrame frame = new JFrame("Help Information");
				frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

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
									getClass().getResourceAsStream("/DungeonoftheBrutalKing/TextFiles/Help.txt"))),
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
		mapFloor1MenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, InputEvent.CTRL_MASK));
		mapFloor1MenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {


			}
		});

		mapFloor2MenuItem = new JMenuItem("Floor 2");
		mapFloor2MenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, InputEvent.CTRL_MASK));
		mapFloor2MenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {


			}
		});

		mapFloor3MenuItem = new JMenuItem("Floor 3");
		mapFloor3MenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_3, InputEvent.CTRL_MASK));
		mapFloor3MenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {


			}
		});
		mapFloor4MenuItem = new JMenuItem("Floor 4");
		mapFloor4MenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_4, InputEvent.CTRL_MASK));
		mapFloor4MenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {


			}
		});
		mapMenu.add(mapFloor1MenuItem);
		mapMenu.add(mapFloor2MenuItem);
		mapMenu.add(mapFloor3MenuItem);
		mapMenu.add(mapFloor4MenuItem);

		// **************************************************************************************
		// ----------------------------Setting Up JTextArea ------------------------------------
		// *************************************************************************************
	
		MessageTextArea = new JTextArea("JTextArea AMessageArea - Game Text Updates");
		MessageTextArea.setBackground(myGameSettings.colorLightBrown);
		MessageTextArea.setForeground(myGameSettings.colorLightYellow);
		MessageTextArea.setFont(myGameSettings.fontLomoCopyLTStdMidi);
			
		// **************************************************************************************
		// ----------------------------Setting Up JSplitPane ------------------------------------
		// *************************************************************************************

		PicturesAndTextUpdatesPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		PicturesAndTextUpdatesPane.setVisible(true);
		PicturesAndTextUpdatesPane.setResizeWeight(.90d);
		PicturesAndTextUpdatesPane.setLeftComponent(GameImagesAndCombatPanel);
		PicturesAndTextUpdatesPane.setRightComponent(MessageTextArea);
		PicturesAndTextUpdatesPane.setVisible(true);

		// ***************************************************************
		// -------------------Adding JPanel to JFrame --------------------
		// ****************************************************************

		MainGameScreenFrame.add(PicturesAndTextUpdatesPane, BorderLayout.CENTER);
		MainGameScreenFrame.add(p1Panel, BorderLayout.NORTH);
		p1Panel.add(p2Panel, BorderLayout.NORTH);
		p1Panel.add(p3Panel, BorderLayout.CENTER);
		p1Panel.add(p4Panel, BorderLayout.SOUTH);
		p2Panel.add(CharNameClassLevelField);
		p3Panel.add(CharStatsField, BorderLayout.NORTH);
		p3Panel.add(CharStats2Field, BorderLayout.SOUTH);
		p4Panel.add(CharXPHPGoldField);



		
		MainGameScreenFrame.setVisible(true);


	}
	
	
	
	private synchronized void start() {
		running = true;
		thread.start();
	
	}
	
	public synchronized void stop() {
		running = false;
		try {
			thread.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void render() {
		BufferStrategy bs = getBufferStrategy();
		if(bs == null) {
			MainGameScreenFrame.createBufferStrategy(3);
			return;
		}
		Graphics g = bs.getDrawGraphics();
		g.drawImage(image, 0, 0, image.getWidth(), image.getHeight(), null);
		bs.show();
	}
	
	public void run() {
		long lastTime = System.nanoTime();
		final double ns = 1000000000.0 / 60.0;//60 times per second
		double delta = 0;
		requestFocus();
		while(running) {
			long now = System.nanoTime();
			delta = delta + ((now-lastTime) / ns);
			lastTime = now;
			while (delta >= 1)//Make sure update is only happening 60 times a second
			{
				//handles all of the logic restricted time
				screen.update(camera, pixels);
				camera.update(map);
				delta--;
			}
			render();//displays to the screen unrestricted time
		}

	}
}
