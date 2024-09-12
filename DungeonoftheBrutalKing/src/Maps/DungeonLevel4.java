package Maps;

import DungeonoftheBrutalKing.Maps;

public class DungeonLevel4 {

	//8x8
	
	public int[][] DungeonLevel4 = {
		{1,1,1,1,1,1,1,1,1,1},
		{1,0,0,0,0,0,0,0,0,1},
		{1,0,1,1,1,1,0,1,0,1},
		{1,0,1,0,0,1,0,1,0,1},
		{1,0,1,0,0,1,0,1,0,1},
		{1,0,1,1,1,1,0,1,0,1},
		{1,0,0,0,0,0,0,0,0,1},
		{1,1,1,1,1,1,1,1,1,1}

	};


	int mapWidth = 8;
	int mapHeight = 8;
	int mapLevel = 4; 
	
	
	public DungeonLevel4() {
		//64x64
		
		
		
		
	}
	
	public int[][] getDungeonLevel4() {
		return DungeonLevel4;
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
