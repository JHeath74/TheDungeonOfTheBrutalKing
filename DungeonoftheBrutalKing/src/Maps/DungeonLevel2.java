package Maps;

import DungeonoftheBrutalKing.Maps;

public class DungeonLevel2 extends Maps {

	//32x32
	

	
	



	int mapWidth = 32;
	int mapHeight = 32;
	int mapLevel = 2; 
	
	public int[][] DungeonLevel2 = {
			{1,1,1,1,1,1,1,1,1,1},
			{1,0,0,0,0,0,0,0,0,1},
			{1,0,1,1,1,1,0,1,0,1},
			{1,0,1,0,0,1,0,1,0,1},
			{1,0,1,0,0,1,0,1,0,1},
			{1,0,1,1,1,1,0,1,0,1},
			{1,0,0,0,0,0,0,0,0,1},
			{1,1,1,1,1,1,1,1,1,1}

		};
	
	
	public DungeonLevel2() {
		//64x64
		
		
	}
	
	public int[][] getDungeonLevel2() {
		return DungeonLevel2;
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
