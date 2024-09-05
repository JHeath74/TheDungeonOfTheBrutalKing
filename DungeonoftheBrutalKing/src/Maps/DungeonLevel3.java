package Maps;

import DungeonoftheBrutalKing.Maps;

public class DungeonLevel3 extends Maps {
	
	//16x16
	

	

	private int[][] DungeonLevel3;
	


	int mapWidth = 16;
	int mapHeight = 16;
	int mapLevel = 3; 
	
	
	public DungeonLevel3(int mapWidth, int mapHeight, int mapLevel, int[][] DungeonLevel3) {
		//64x64
		
		this.mapWidth = mapWidth;
		this.mapHeight = mapHeight;
		this.mapLevel = mapLevel;
		
		this.DungeonLevel3 = new int[][] {
			{1,1,1,1,1,1,1,1,1,1},
			{1,0,0,0,0,0,0,0,0,1},
			{1,0,1,1,1,1,0,1,0,1},
			{1,0,1,0,0,1,0,1,0,1},
			{1,0,1,0,0,1,0,1,0,1},
			{1,0,1,1,1,1,0,1,0,1},
			{1,0,0,0,0,0,0,0,0,1},
			{1,1,1,1,1,1,1,1,1,1}

		};
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
