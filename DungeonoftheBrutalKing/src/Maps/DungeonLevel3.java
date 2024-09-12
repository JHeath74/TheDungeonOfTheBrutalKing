package Maps;

import DungeonoftheBrutalKing.Maps;

public class DungeonLevel3 extends Maps {
	
	//16x16
	

	

	public int[][] DungeonLevel3 = {
		{1,1,1,1,1,1,1,1,1,1},
		{1,0,0,0,0,0,0,0,0,1},
		{1,0,1,1,1,1,0,1,0,1},
		{1,0,1,0,0,1,0,1,0,1},
		{1,0,1,0,0,1,0,1,0,1},
		{1,0,1,1,1,1,0,1,0,1},
		{1,0,0,0,0,0,0,0,0,1},
		{1,1,1,1,1,1,1,1,1,1}

	};


	int mapWidth = 16;
	int mapHeight = 16;
	int mapLevel = 3; 
	
	
	
	
	public DungeonLevel3() {
	

		
	}
	
	public int[][] getDungeonLevel3() {
		return DungeonLevel3;
	}


	public int getMapWidth() {
		return mapWidth;
	}


	public int getMapHeight() {
		return mapHeight;
	}


	public int getMapLevel() {
		return mapLevel;
	}

}
