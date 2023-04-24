package ARTDMaps;

import AlternateRealityTheDungeon.ARTDMaps;

public class ARTDFloor3Map extends ARTDMaps
{

	
	
	public ARTDFloor3Map() 
	{
		MapFloor3 = new int[16][16];
	}

	public void levelGenerator()
	{
		
		

		
		for (int x = 0; x < MapFloor4.length; x++) {
		    for (int y = 0; y < MapFloor4[x].length; y++) {
		        
				if (MapFloor4[x][y] == 1) {
		            
					// Draw a wall tile
		         //   batch.draw(wallTexture, x * TILE_SIZE, y * TILE_SIZE);

					
					
					
		        }if (MapFloor4[x][y] == 2) {
		            // Draw a floor tile
		         //   batch.draw(floorTexture, x * TILE_SIZE, y * TILE_SIZE);
		        }if (MapFloor4[x][y] == 3) {
		            // Draw a door tile
		         //   batch.draw(doorTexture, x * TILE_SIZE, y * TILE_SIZE);
		        }if (MapFloor4[x][y] == 4) {
		            // Draw a stair tile
		        //    batch.draw(stairTexture, x * TILE_SIZE, y * TILE_SIZE);
		        }
		    }
		}
	}
}
