package DungeonoftheBrutalKing;

import javax.swing.*;

import Maps.DungeonLevel;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


	public class MovementAndLevels extends JFrame {
	    private char[][][] levels;  // 3D array to store dungeon levels
	    private int currentLevel;
	    private int playerX;
	    private int playerY;

	    public MovementAndLevels(char[][][] levels) {
	        this.levels = levels;
	        this.currentLevel = 0;
	        this.playerX = 0;
	        this.playerY = 0;

	        addKeyListener(new DungeonKeyListener());
	        setFocusable(true);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setSize(400, 400);
	        setVisible(true);
	    }

	    private class DungeonKeyListener implements KeyListener {
	        @Override
	        public void keyPressed(KeyEvent e) {
	            int keyCode = e.getKeyCode();

	            switch (keyCode) {
	                case KeyEvent.VK_UP:
	                    movePlayer(0, -1);
	                    break;
	                case KeyEvent.VK_DOWN:
	                    movePlayer(0, 1);
	                    break;
	                case KeyEvent.VK_LEFT:
	                    movePlayer(-1, 0);
	                    break;
	                case KeyEvent.VK_RIGHT:
	                    movePlayer(1, 0);
	                    break;
	            }

	            repaint(); // Redraw the game screen after each move
	        }

	        @Override
	        public void keyTyped(KeyEvent e) {
	            // Unused, but required by the KeyListener interface
	        }

	        @Override
	        public void keyReleased(KeyEvent e) {
	            // Unused, but required by the KeyListener interface
	        }
	    }

	    private void movePlayer(int deltaX, int deltaY) {
	        int newX = playerX + deltaX;
	        int newY = playerY + deltaY;

	        if (isValidMove(newX, newY)) {
	            playerX = newX;
	            playerY = newY;
	        }
	    }

	    private boolean isValidMove(int x, int y) {
	        char[][] currentLevelMap = levels[currentLevel];
	        return x >= 0 && x < currentLevelMap.length && y >= 0 && y < currentLevelMap[0].length
	                && currentLevelMap[x][y] != '#'; // '#' represents walls
	    }

	    @Override
	    public void paint(Graphics g) {
	        super.paint(g);
	        char[][] currentLevelMap = levels[currentLevel];
	        int tileSize = 20; // Size of each tile
	        for (int x = 0; x < currentLevelMap.length; x++) {
	            for (int y = 0; y < currentLevelMap[0].length; y++) {
	                if (currentLevelMap[x][y] == '#') {
	                    g.setColor(Color.BLACK);
	                    g.fillRect(x * tileSize, y * tileSize, tileSize, tileSize);
	                }
	                // Add more conditions for different tile types
	            }
	        }
	        // Draw the player
	        g.setColor(Color.RED);
	        g.fillOval(playerX * tileSize, playerY * tileSize, tileSize, tileSize);
	    }

	    public static void main(String[] args) {
	        char[][][] levels = {
	            {
	                {'#', '#', '#', '#', '#'},
	                {'#', '.', '.', '.', '#'},
	                {'#', '.', '#', '.', '#'},
	                {'#', '.', '.', '.', '#'},
	                {'#', '#', '#', '#', '#'}
	            }
	            // Add more levels as needed
	        };

	        SwingUtilities.invokeLater(() -> {
	        	MovementAndLevels game = new MovementAndLevels(levels);
	        });
	    }
	

    }



