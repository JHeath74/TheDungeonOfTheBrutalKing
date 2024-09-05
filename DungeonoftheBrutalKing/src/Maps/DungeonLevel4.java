package Maps;

import DungeonoftheBrutalKing.Maps;

public class DungeonLevel4 {

	//8x8
	
	private int[][] DungeonLevel4;
	


	int mapWidth = 8;
	int mapHeight = 8;
	int mapLevel = 3; 
	
	
	public DungeonLevel4(int mapWidth, int mapHeight, int mapLevel, int[][] DungeonLevel4) {
		//64x64
		
		this.mapWidth = mapWidth;
		this.mapHeight = mapHeight;
		this.mapLevel = mapLevel;
		
		this.DungeonLevel4 = new int[][] {
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
