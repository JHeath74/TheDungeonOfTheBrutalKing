package ARTDMaps;


import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import java.awt.Graphics;
import java.awt.Graphics2D;

import java.util.Random;

import AlternateRealityTheDungeon.ARTDMaps;
import AlternateRealityTheDungeon.ARTDMenu;

//1 for a wall, 2 for the floor, 3 for doors, 4 for stairs

public class ARTDFloor4Map extends ARTDMaps implements KeyListener {

    private static final int TILE_WIDTH = 64;
    private static final int TILE_HEIGHT = 32;

    private static final int DUNGEON_WIDTH = 10;
    private static final int DUNGEON_HEIGHT = 10;

    private static final int TILE_FLOOR = 0;
    private static final int TILE_WALL = 1;
    
    private static int attempts = 0;
    
    

    int[][] MapFloor4 = {{1,1,1,1,1,1,1,1},
	     				 {1,4,0,0,0,0,0,1},
	     				 {1,0,1,1,1,1,0,1},
	     				 {1,0,1,0,0,1,0,1},
	     				 {1,0,1,0,0,1,0,1},
	     				 {1,0,1,1,3,1,0,1},
	     				 {1,0,0,0,0,0,0,1},
	     				 {1,1,1,1,1,1,1,1}};

    private int playerX = 1;
    private int playerY = 1;

    private List<Enemy> enemies = new ArrayList<>();

    public void IsometricView() {
        addKeyListener(this);
        setFocusable(true);

        // Add some enemies to the dungeon
        enemies.add(new Enemy(3, 3, 10));
        enemies.add(new Enemy(7, 5, 15));
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Set rendering hints for better quality
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

        // Draw the dungeon level
        for (int x = 0; x < DUNGEON_WIDTH; x++) {
            for (int y = 0; y < DUNGEON_HEIGHT; y++) {
                if (MapFloor4[y][x] == TILE_FLOOR) {
                    drawIsometricTile(g2d, x, y, "path/to/floor.png");
                } else if (MapFloor4[y][x] == TILE_WALL) {
                    drawIsometricTile(g2d, x, y, "path/to/wall.png");
                }
            }
        }

        // Draw the enemies
        for (Enemy enemy : enemies) {
            drawIsometricTile(g2d, enemy.getX(), enemy.getY(), "path/to/enemy.png");
        }

        // Draw the player
        drawIsometricTile(g2d, playerX, playerY, "path/to/player.png");
    }

    private void movePlayer(int dx, int dy) {
        int newX = playerX + dx;
        int newY = playerY + dy;

        // Check if the new position is within the bounds of the dungeon
        if (newX >= 0 && newX < DUNGEON_WIDTH && newY >= 0 && newY < DUNGEON_HEIGHT) {
            // Check if the new position is a floor tile
            if (MapFloor4[newY][newX] == TILE_FLOOR) {
                playerX = newX;
                playerY = newY;

                // Check for combat with enemies
                for (Enemy enemy : enemies) {
                    if (enemy.getX() == playerX && enemy.getY() == playerY) {
                        // Player attacks enemy
                        enemy.takeDamage(5);
                        if (enemy.isDead()) {
                            enemies.remove(enemy);
                        }

                        // Enemy attacks player
                        int playerHealth = 10;
                        playerHealth -= 3;
                        if (playerHealth <= 0) {
                            // Game over
                        }
                    }
                }

                repaint();
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch (keyCode) {
            case KeyEvent.VK_LEFT:
                movePlayer(-1, 0);
                break;
            case KeyEvent.VK_RIGHT:
                movePlayer(1, 0);
                break;
            case KeyEvent.VK_UP:
                movePlayer(0, -1);
                break;
            case KeyEvent.VK_DOWN:
                movePlayer(0, 1);
                break;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}
    

       

    public static boolean chance() {
            Random rand = new Random();
            attempts++;

            if (attempts > 20) {
                attempts = 0;
                return true;
            }

            return rand.nextDouble() < 0.05;
        }
}
