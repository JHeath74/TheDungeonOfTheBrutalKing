package DungeonoftheBrutalKing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.WindowConstants;

import GameEngine.Camera;
import GameEngine.Screen;
import GameEngine.Texture;

public class MainGameScreen2 extends JFrame implements Runnable{

	GameSettings myGameSettings = new GameSettings();
	
	JMenuBar menuBar = null;
	JMenu gameMenu, charecterMenu, settingsMenu, helpMenu = null;
	JMenuItem newGameMenuItem, LoadSavedGameMenuItem, saveMenuItem,
				exitGameMenuItem,charecterstatsMenuItem,
				charecterinventoryMenuItem, mapMenu, gameSettingsMenuItem,
				aboutMenuItem, helpMenuItem, mapFloor1MenuItem, mapFloor2MenuItem,
				mapFloor3MenuItem, mapFloor4MenuItem = null;
	
	private static final long serialVersionUID = 1L;
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
	public MainGameScreen2() {
		thread = new Thread(this);
	
		image = new BufferedImage(640, 480, BufferedImage.TYPE_INT_RGB);
		pixels = ((DataBufferInt)image.getRaster().getDataBuffer()).getData();
		textures = new ArrayList<Texture>();
		textures.add(Texture.wood);
		textures.add(Texture.brick);
		textures.add(Texture.bluestone);
		textures.add(Texture.stone);
		camera = new Camera(4.5, 4.5, 1, 0, 0, -.66);
		screen = new Screen(map, mapWidth, mapHeight, textures, 640, 480);
		addKeyListener(camera);
		
		
		setSize(1200, 800);
		setResizable(false);
		setTitle("Dungeon of the Brutal King");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBackground(Color.black);
		setLocationRelativeTo(null);
		setVisible(true);
		start();
		
		
		
		// Create the menu bar.
		menuBar = new JMenuBar();

		//Menu Bar Preferences

		menuBar.setPreferredSize(new Dimension(25,35));
		menuBar.setFont(new Font("sans-serif", Font.ROMAN_BASELINE, 22));
		menuBar.setBackground(myGameSettings.colorPlum);
		
		this.add(menuBar, BorderLayout.NORTH);
		
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
				
				// **************************************************************
				// ---------- Adding Menu Selection Items to the Menu bar--------
				// **************************************************************
				menuBar.add(gameMenu);
				menuBar.add(charecterMenu);
				menuBar.add(settingsMenu);
				menuBar.add(helpMenu);
		




		
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
			createBufferStrategy(3);
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
