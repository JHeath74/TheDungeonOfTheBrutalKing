package DungeonoftheBrutalKing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.geom.AffineTransform;
import java.awt.geom.Path2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Maps extends JFrame{

//	protected static int[][][] DungeonMap;
	//protected static int[][][] MapFloor2;
//	protected static int[][][] MapFloor3;
//	protected static int[][][] MapFloor4;

    private static final int TILE_WIDTH = 64;
    private static final int TILE_HEIGHT = 32;

    private static final int DUNGEON_WIDTH = 5;
    private static final int DUNGEON_HEIGHT = 5;
    private static final int DUNGEON_LEVEL = 3;

    private static final int TILE_FLOOR = 0;
    private static final int TILE_WALL = 1;


    protected static int attempts = 0;


    private int playerX = 1;
    private int playerY = 1;

	protected Combat myCombat = null;
	MainGameScreen myMenu = null;
	GameSettings myGameSettings = null;


	 private int[][][] DungeonMap = {
		        {
		            {1, 1, 1, 1, 1},
		            {1, 0, 0, 0, 1},
		            {1, 0, 1, 0, 1},
		            {1, 0, 0, 0, 1},
		            {1, 1, 1, 1, 1}
		        },
		        {
		            {1, 1, 1, 1, 1},
		            {1, 0, 0, 0, 1},
		            {1, 0, 0, 0, 1},
		            {1, 0, 1, 0, 1},
		            {1, 1, 1, 1, 1}
		        },
		        {
		            {1, 1, 1, 1, 1},
		            {1, 0, 0, 0, 1},
		            {1, 0, 1, 0, 1},
		            {1, 0, 1, 0, 1},
		            {1, 1, 1, 1, 1}
		        }
		    };

	 public Maps() {
	       // addKeyListener(this);
	        setFocusable(true);
	    }


	 public void paintComponent(Graphics g) {
	        super.paintComponents(g);
	        Graphics2D g2d = (Graphics2D) g;

	        // Set rendering hints for better quality
	        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	        g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);


		// Draw the dungeon level
	       for (int z = 0; z > DUNGEON_LEVEL; z++) {
			for (int x = 0; x < DUNGEON_WIDTH; x++) {
	            for (int y = 0; y < DUNGEON_HEIGHT; y++) {
	                if (DungeonMap[z][y][x] == TILE_FLOOR) {
	                    drawIsometricTile(g2d, x, y, GameSettings.DungeonFloorTexturePath + "DungeonFloorTexture.jpg");
	                } else if (DungeonMap[z][y][x] == TILE_WALL) {
	                    drawIsometricTile(g2d, x, y, GameSettings.DungeonWallTexturePath + "DungeonWallTexture.avif");
	                }
	            }
	        }
		}


	    }

	    private void movePlayer(int dx, int dy, int i) throws IOException {
	        int newX = playerX + dx;
	        int newY = playerY + dy;

	        // Check if the new position is within the bounds of the dungeon
	        if (newX >= 0 && newX < DUNGEON_WIDTH && newY >= 0 && newY < DUNGEON_HEIGHT) {
	            // Check if the new position is a floor tile
	            if (DungeonMap[DUNGEON_LEVEL][newY][newX] == TILE_FLOOR) {
	                playerX = newX;
	                playerY = newY;

	                if(combatChance())
	                {
	                	Combat artdCombat = new Combat();
						artdCombat.CombatEncouter();
	                }


	                }

	                repaint();

	        }
	    }

	    public void keyPressed(KeyEvent e) throws IOException {
	        int keyCode = e.getKeyCode();
	        switch (keyCode) {
	            case KeyEvent.VK_LEFT:
	                movePlayer(-1, 0, 90);
	                break;
	            case KeyEvent.VK_RIGHT:
	                movePlayer(1, 0, 90);
	                break;
	            case KeyEvent.VK_UP:
	                movePlayer(0, -1, 0);
	                break;
	            case KeyEvent.VK_DOWN:
	                movePlayer(0, 1, 0);
	                break;
	        }
	    }

	    public void keyTyped(KeyEvent e) {}

	    public void keyReleased(KeyEvent e) {}




	    public static boolean combatChance() {
	            Random rand = new Random();
	            attempts++;

	            if (attempts > 20) {
	                attempts = 0;
	                return true;
	            }

	            return rand.nextDouble() < 0.05;
	        }


	private void drawIsometricTile(Graphics2D g2d, int x, int y, String dungeonWallTexture) {
	    double screenX = (x - y) * TILE_WIDTH / 2;
	    double screenY = (x + y) * TILE_HEIGHT / 2;

	    Path2D.Double tileShape = new Path2D.Double();
	    tileShape.moveTo(screenX, screenY + TILE_HEIGHT / 2);
	    tileShape.lineTo(screenX + TILE_WIDTH / 2, screenY);
	    tileShape.lineTo(screenX + TILE_WIDTH, screenY + TILE_HEIGHT / 2);
	    tileShape.lineTo(screenX + TILE_WIDTH / 2, screenY + TILE_HEIGHT);
	    tileShape.closePath();

	    // Load the image from a file
	    BufferedImage image = null;
	    try {
	        image = ImageIO.read(new File(dungeonWallTexture));
	    } catch (IOException e) {
	        e.printStackTrace();
	    }

	    // Draw the image onto the tile
	    if (image != null) {
	        AffineTransform transform = new AffineTransform();
	        transform.translate(screenX, screenY);
	        g2d.drawImage(image, transform, null);
	    } else {
	        g2d.setColor(Color.GREEN);
	        g2d.fill(tileShape);
	    }

	    g2d.setColor(Color.BLACK);
	    g2d.draw(tileShape);
	}




}
