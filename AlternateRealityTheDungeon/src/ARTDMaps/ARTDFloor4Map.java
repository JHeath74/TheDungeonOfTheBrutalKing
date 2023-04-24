package ARTDMaps;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import AlternateRealityTheDungeon.ARTDMaps;
import AlternateRealityTheDungeon.ARTDMenu;
import AlternateRealityTheDungeon.ARTDSingleton;

public class ARTDFloor4Map extends ARTDMaps {

// 1 for a wall, 2 for the floor, 3 for doors, 4 for stairs
	
	public ARTDFloor4Map()
	{
		 MapFloor4 = new int[8][8];
		 TILE_SIZE = 10;
		 wallTexture = null;
		 floorTexture = null;
		 doorTexture = null;
		 stairTexture = null;
		 
		 wallImage = null;
		 floorImage = null;
		 doorImage = null;
		 stairImage = null;
		 
		 wallLabel = null;
		 floorLabel = null; 
		 doorLabel = null;
		 stairLabel = null;
		 
		 wallImagePath = "src\\AlternateRealityTheDungeon\\Images\\Level\\Wall\\";
		 floorImagePath = "\\src\\AlternateRealityTheDungeon\\Images\\Level\\Floor\\";
		 doorImagePath= "\\src\\AlternateRealityTheDungeon\\Images\\Level\\Door\\";
		 stairImagePath = "\\src\\AlternateRealityTheDungeon\\Images\\Level\\Stairs\\";

		 
		 
		 try {
			myMenu = new ARTDMenu();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		 
		int[][] MapFloor4 = {{1,1,1,1,1,1,1,1},
					     	{1,4,0,0,0,0,0,1},
							{1,0,1,1,1,1,0,1},
							{1,0,1,0,0,1,0,1},
							{1,0,1,0,0,1,0,1},
							{1,0,1,1,3,1,0,1},
							{1,0,0,0,0,0,0,1},
							{1,1,1,1,1,1,1,1}};
	}

	public void levelGenerator(int TILE_SIZE)
	{
		
		

		
		for (int x = 0; x < MapFloor4.length; x++) {
		    for (int y = 0; y < MapFloor4[x].length; y++) {
		        
				if (MapFloor4[x][y] == 1) {
		            
		         //   batch.draw(wallTexture, x * TILE_SIZE, y * TILE_SIZE);
					
					//	wallTexture = ImageIO.read(new File(wallImagePath + "wallImage.jpg", x * TILE_SIZE ));

				//	wallLabel = new JLabel(new ImageIcon(wallTexture));
						
					
		        }if (MapFloor4[x][y] == 2) {
		            // Draw a floor tile
		        //    batch.draw(floorTexture, x * TILE_SIZE, y * TILE_SIZE);
		        	try {
						floorTexture = ImageIO.read(new File(floorImagePath + "floorImage.jpg" ));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					floorLabel = new JLabel(new ImageIcon(floorTexture));
		        	
		        	
		        }if (MapFloor4[x][y] == 3) {
		            // Draw a door tile
		         //   batch.draw(doorTexture, x * TILE_SIZE, y * TILE_SIZE);
		        	
		        	try {
						doorTexture = ImageIO.read(new File(doorImagePath + "doorImage.jpg" ));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					doorLabel = new JLabel(new ImageIcon(doorTexture));
		        	
		        }if (MapFloor4[x][y] == 4) {
		            // Draw a stair tile
		         //   batch.draw(stairTexture, x * TILE_SIZE, y * TILE_SIZE);
		        	
		         	try {
		         		stairTexture = ImageIO.read(new File(stairImagePath + "stairImage.jpg" ));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		         	stairLabel = new JLabel(new ImageIcon(stairTexture));
		        	
		        }
		    }
		}

	}
	
	
}
